/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn.validation;

import com.gentleware.poseidon.dsl.wsn.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link com.gentleware.poseidon.dsl.wsn.Data}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DataValidator {
	boolean validate();

	boolean validateShared(boolean value);
	boolean validateVariable(EList<Variable> value);
}