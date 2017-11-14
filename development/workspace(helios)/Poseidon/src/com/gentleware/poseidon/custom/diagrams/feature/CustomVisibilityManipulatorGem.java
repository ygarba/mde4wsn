package com.gentleware.poseidon.custom.diagrams.feature;

import com.gentleware.poseidon.diagrams.feature.FeatureTypeFacet;
import com.gentleware.poseidon.diagrams.feature.VisibilityManipulatorGem;
import com.gentleware.poseidon.geometry.UPoint;

public class CustomVisibilityManipulatorGem extends VisibilityManipulatorGem {

	public CustomVisibilityManipulatorGem(UPoint point, double height, FeatureTypeFacet featureTypeFacet, boolean firstSelected) {
		super(point, height, featureTypeFacet, firstSelected);
	}


}
