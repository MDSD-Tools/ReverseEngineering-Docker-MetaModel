/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.compose.composeFile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volumes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Volumes#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Volumes#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Volumes#getDriver_opts <em>Driver opts</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Volumes#getExternal <em>External</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Volumes#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Volumes#getCustomName <em>Custom Name</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getVolumes()
 * @model
 * @generated
 */
public interface Volumes extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getVolumes_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Volumes#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Driver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Driver</em>' attribute.
   * @see #setDriver(String)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getVolumes_Driver()
   * @model
   * @generated
   */
  String getDriver();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Volumes#getDriver <em>Driver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Driver</em>' attribute.
   * @see #getDriver()
   * @generated
   */
  void setDriver(String value);

  /**
   * Returns the value of the '<em><b>Driver opts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Driver opts</em>' containment reference.
   * @see #setDriver_opts(Mapping)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getVolumes_Driver_opts()
   * @model containment="true"
   * @generated
   */
  Mapping getDriver_opts();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Volumes#getDriver_opts <em>Driver opts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Driver opts</em>' containment reference.
   * @see #getDriver_opts()
   * @generated
   */
  void setDriver_opts(Mapping value);

  /**
   * Returns the value of the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>External</em>' attribute.
   * @see #setExternal(String)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getVolumes_External()
   * @model
   * @generated
   */
  String getExternal();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Volumes#getExternal <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External</em>' attribute.
   * @see #getExternal()
   * @generated
   */
  void setExternal(String value);

  /**
   * Returns the value of the '<em><b>Labels</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labels</em>' containment reference.
   * @see #setLabels(ListOrMapping)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getVolumes_Labels()
   * @model containment="true"
   * @generated
   */
  ListOrMapping getLabels();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Volumes#getLabels <em>Labels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Labels</em>' containment reference.
   * @see #getLabels()
   * @generated
   */
  void setLabels(ListOrMapping value);

  /**
   * Returns the value of the '<em><b>Custom Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Name</em>' attribute.
   * @see #setCustomName(String)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getVolumes_CustomName()
   * @model
   * @generated
   */
  String getCustomName();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Volumes#getCustomName <em>Custom Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom Name</em>' attribute.
   * @see #getCustomName()
   * @generated
   */
  void setCustomName(String value);

} // Volumes