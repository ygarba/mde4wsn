package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenDecisionNodeCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.DecisionNodeCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenDecisionNodeCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "DecisionNode";
	private DslGenDecisionNodeCreateFacet nodeCreateFacet = new DecisionNodeCreateFacetImpl();

	public DslGenDecisionNodeCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenDecisionNodeCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
