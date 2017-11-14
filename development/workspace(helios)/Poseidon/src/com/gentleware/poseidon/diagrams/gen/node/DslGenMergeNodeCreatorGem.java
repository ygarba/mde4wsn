package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenMergeNodeCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.MergeNodeCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenMergeNodeCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "MergeNode";
	private DslGenMergeNodeCreateFacet nodeCreateFacet = new MergeNodeCreateFacetImpl();

	public DslGenMergeNodeCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenMergeNodeCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
