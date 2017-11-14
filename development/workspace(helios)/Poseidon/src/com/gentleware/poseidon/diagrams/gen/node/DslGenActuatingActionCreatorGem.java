package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenActuatingActionCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.ActuatingActionCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenActuatingActionCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "ActuatingAction";
	private DslGenActuatingActionCreateFacet nodeCreateFacet = new ActuatingActionCreateFacetImpl();

	public DslGenActuatingActionCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenActuatingActionCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
