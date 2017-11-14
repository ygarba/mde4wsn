package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenAdviceCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.AdviceCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenAdviceCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Advice";
	private DslGenAdviceCreateFacet nodeCreateFacet = new AdviceCreateFacetImpl();

	public DslGenAdviceCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenAdviceCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
