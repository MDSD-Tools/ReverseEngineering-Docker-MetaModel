/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.dockerFile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dockerfile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.somox.docker.dockerFile.Dockerfile#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.somox.docker.dockerFile.DockerFilePackage#getDockerfile()
 * @model
 * @generated
 */
public interface Dockerfile extends EObject
{
  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link org.palladiosimulator.somox.docker.dockerFile.Instruction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see org.palladiosimulator.somox.docker.dockerFile.DockerFilePackage#getDockerfile_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

} // Dockerfile