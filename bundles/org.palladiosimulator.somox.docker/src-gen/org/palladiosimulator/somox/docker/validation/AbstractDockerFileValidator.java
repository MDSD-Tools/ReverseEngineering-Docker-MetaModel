/*
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractDockerFileValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.palladiosimulator.somox.docker.dockerFile.DockerFilePackage.eINSTANCE);
		return result;
	}
}