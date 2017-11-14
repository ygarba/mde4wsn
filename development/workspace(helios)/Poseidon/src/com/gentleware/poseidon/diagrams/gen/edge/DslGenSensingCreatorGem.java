package com.gentleware.poseidon.diagrams.gen.edge;

import com.gentleware.poseidon.diagrams.gen.edge.DslGenSensingCreateFacet;
import com.gentleware.poseidon.custom.diagrams.edge.impl.SensingCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenSensingCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Sensing";
	private DslGenSensingCreateFacet arcCreateFacet = new SensingCreateFacetImpl();

	public DslGenSensingCreatorGem() {
		createProperties();
		arcCreateFacet.setCreatorGem(this);
	}

	public DslGenSensingCreateFacet getArcCreateFacet() {
		return arcCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
