package org.palladiosimulator.docker.compose.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.palladiosimulator.somox.docker.compose.ComposeFileStandaloneSetup;
import com.google.inject.Injector;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Factory {

	final static String IN = "./dockerfile.yml";
	final static String OUT = "./dockermodel.xmi";
	
	private static Injector injector;
	private static ResourceSet rs;
	
	private static void setUp() {
		injector = new ComposeFileStandaloneSetup().createInjectorAndDoEMFRegistration();
		rs = injector.getInstance(ResourceSet.class);
	}	
	
	public static Resource createXMI(String[] inputfiles, String outputfile) {
		
		setUp();		
		
		for(int i = 0; i < inputfiles.length; i++) {
			Path temp  = Paths.get("tempdockerfile" + i + ".compose");
			try {
				Files.copy(Paths.get(inputfiles[i]), temp, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
				rs.getResource(URI.createURI(temp.toString()), true);
				Files.delete(temp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
		Resource xmiResource = createAndAddResource(outputfile, new String[] {"compose"}, rs);
		
		for (Resource res : rs.getResources()) {
			xmiResource.getContents().add(res.getContents().get(0));
		}
		
		saveResource(xmiResource);
		
		return xmiResource;
	}

	public static void main(String[] args) throws IOException {
		
//		setUp();
		
//		Resource xmiResource = createXMI(rs, args);
		createXMI(args, OUT);
		
//		saveResource(xmiResource);
	}
	
	private static Resource createAndAddResource(final String outputFile, final String[] fileextensions,
            final ResourceSet rs) {
        for (final String fileext : fileextensions) {
            rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileext, new XMIResourceFactoryImpl());
        }
        final URI uri = URI.createFileURI(outputFile);
        final Resource resource = rs.createResource(uri);
        ((ResourceImpl) resource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
        return resource;
    }
	
	private static void saveResource(final Resource resource) {
        final Map<Object, Object> saveOptions = ((XMLResource) resource).getDefaultSaveOptions();
        saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
        saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, new ArrayList<>());
        try {
            resource.save(saveOptions);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }	
	
}
