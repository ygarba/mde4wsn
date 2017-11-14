/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn.validation;

import com.gentleware.poseidon.dsl.wsn.optimizationLevel;

/**
 * A sample validator interface for {@link com.gentleware.poseidon.dsl.wsn.Objectives}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ObjectivesValidator {
	boolean validate();

	boolean validatePower(optimizationLevel value);
	boolean validateMemory(optimizationLevel value);
	boolean validatePacketloss(optimizationLevel value);
}
