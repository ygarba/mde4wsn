package com.gentleware.poseidon.diagrams.gen.edge;

import com.gentleware.poseidon.diagrams.gen.edge.DslGenTimingCreateFacet;
import com.gentleware.poseidon.custom.diagrams.edge.impl.TimingCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenTimingCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Timing";
	private DslGenTimingCreateFacet arcCreateFacet = new TimingCreateFacetImpl();

	public DslGenTimingCreatorGem() {
		createProperties();
		arcCreateFacet.setCreatorGem(this);
	}

	public DslGenTimingCreateFacet getArcCreateFacet() {
		return arcCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
