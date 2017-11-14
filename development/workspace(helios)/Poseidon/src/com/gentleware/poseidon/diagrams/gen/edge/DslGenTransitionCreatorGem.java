package com.gentleware.poseidon.diagrams.gen.edge;

import com.gentleware.poseidon.diagrams.gen.edge.DslGenTransitionCreateFacet;
import com.gentleware.poseidon.custom.diagrams.edge.impl.TransitionCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenTransitionCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Transition";
	private DslGenTransitionCreateFacet arcCreateFacet = new TransitionCreateFacetImpl();

	public DslGenTransitionCreatorGem() {
		createProperties();
		arcCreateFacet.setCreatorGem(this);
	}

	public DslGenTransitionCreateFacet getArcCreateFacet() {
		return arcCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
