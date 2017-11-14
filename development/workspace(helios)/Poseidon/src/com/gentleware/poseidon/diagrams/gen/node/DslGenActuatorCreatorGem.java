package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenActuatorCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.ActuatorCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenActuatorCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Actuator";
	private DslGenActuatorCreateFacet nodeCreateFacet = new ActuatorCreateFacetImpl();

	public DslGenActuatorCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenActuatorCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
