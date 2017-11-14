package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenSensorCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.SensorCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenSensorCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Sensor";
	private DslGenSensorCreateFacet nodeCreateFacet = new SensorCreateFacetImpl();

	public DslGenSensorCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenSensorCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
