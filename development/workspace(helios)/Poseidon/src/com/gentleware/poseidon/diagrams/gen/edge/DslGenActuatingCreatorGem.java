package com.gentleware.poseidon.diagrams.gen.edge;

import com.gentleware.poseidon.diagrams.gen.edge.DslGenActuatingCreateFacet;
import com.gentleware.poseidon.custom.diagrams.edge.impl.ActuatingCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenActuatingCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Actuating";
	private DslGenActuatingCreateFacet arcCreateFacet = new ActuatingCreateFacetImpl();

	public DslGenActuatingCreatorGem() {
		createProperties();
		arcCreateFacet.setCreatorGem(this);
	}

	public DslGenActuatingCreateFacet getArcCreateFacet() {
		return arcCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
