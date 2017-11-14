package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenBatteryCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.BatteryCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenBatteryCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Battery";
	private DslGenBatteryCreateFacet nodeCreateFacet = new BatteryCreateFacetImpl();

	public DslGenBatteryCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenBatteryCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
