package com.gentleware.poseidon.custom.repobrowser;

import javax.swing.JTree;

import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.deltaengine.errorchecking.ErrorRegister;
import com.gentleware.poseidon.dsl.MetamodelElementWrapper;
import com.gentleware.poseidon.dsl.PoseidonCoreElement;
import com.gentleware.poseidon.idraw.foundation.ToolCoordinatorFacet;
import com.gentleware.poseidon.repobrowser.DSLDetailMediator;

public class CustomDSLDetailMediator extends DSLDetailMediator {

	public CustomDSLDetailMediator(JTree outlineTree, JTree inlineTree, ToolCoordinatorFacet coordinator,
			EObject element, boolean readonly, ErrorRegister errors, boolean initialBigButtons) {
		super(outlineTree, inlineTree, coordinator, element, readonly, errors, initialBigButtons);
	}	
	
}
