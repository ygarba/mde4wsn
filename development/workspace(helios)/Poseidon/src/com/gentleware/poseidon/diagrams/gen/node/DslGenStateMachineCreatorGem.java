package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenStateMachineCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.StateMachineCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenStateMachineCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "StateMachine";
	private DslGenStateMachineCreateFacet nodeCreateFacet = new StateMachineCreateFacetImpl();

	public DslGenStateMachineCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenStateMachineCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
