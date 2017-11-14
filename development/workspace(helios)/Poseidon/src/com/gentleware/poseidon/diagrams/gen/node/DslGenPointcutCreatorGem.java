package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenPointcutCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.PointcutCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenPointcutCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Pointcut";
	private DslGenPointcutCreateFacet nodeCreateFacet = new PointcutCreateFacetImpl();

	public DslGenPointcutCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenPointcutCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
