package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenTimingActionCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.TimingActionCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenTimingActionCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "TimingAction";
	private DslGenTimingActionCreateFacet nodeCreateFacet = new TimingActionCreateFacetImpl();

	public DslGenTimingActionCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenTimingActionCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
