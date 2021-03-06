/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn.validation;


/**
 * A sample validator interface for {@link com.gentleware.poseidon.dsl.wsn.SensingAction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SensingActionValidator {
	boolean validate();

	boolean validateSensorId(String value);
	boolean validateData(String value);
}
