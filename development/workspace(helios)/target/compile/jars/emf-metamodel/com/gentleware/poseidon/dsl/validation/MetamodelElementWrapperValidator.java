/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.validation;

import com.gentleware.poseidon.dsl.J_DiagramHolder;
import com.gentleware.poseidon.dsl.MetamodelElementWrapper;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * A sample validator interface for {@link com.gentleware.poseidon.dsl.MetamodelElementWrapper}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MetamodelElementWrapperValidator {
	boolean validate();

	boolean validate__uuid(String value);
	boolean validateJ_deleted(int value);

	boolean validateJ_diagramHolder(J_DiagramHolder value);

	boolean validate__readOnly(boolean value);

	boolean validate__poseidonName(String value);

	boolean validate__poseidonNamespace(boolean value);

	boolean validate__ownedMember(EList<MetamodelElementWrapper> value);

	boolean validate__source(EObject value);

	boolean validate__target(EObject value);

	boolean validate__source(MetamodelElementWrapper value);

	boolean validate__target(MetamodelElementWrapper value);

	boolean validate__poseidonEdge(boolean value);

	boolean validate__poseidonRole(String value);

	boolean validate__namespace(boolean value);

	boolean validate__posName(String value);

	boolean validate__name(String value);
}
