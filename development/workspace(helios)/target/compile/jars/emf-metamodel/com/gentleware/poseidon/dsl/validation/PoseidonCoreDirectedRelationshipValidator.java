/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.validation;

import com.gentleware.poseidon.dsl.MetamodelElementWrapper;
import com.gentleware.poseidon.dsl.PoseidonCoreElement;

/**
 * A sample validator interface for {@link com.gentleware.poseidon.dsl.PoseidonCoreDirectedRelationship}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PoseidonCoreDirectedRelationshipValidator {
	boolean validate();

	boolean validate__source(MetamodelElementWrapper value);

	boolean validate__target(MetamodelElementWrapper value);

	boolean validate__source(PoseidonCoreElement value);
	boolean validate__target(PoseidonCoreElement value);
}
