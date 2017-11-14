package com.gentleware.poseidon.custom.idraw.foundation;

import java.util.List;

import com.gentleware.poseidon.geometry.UPoint;
import com.gentleware.poseidon.idraw.foundation.AnchorFacet;
import com.gentleware.poseidon.idraw.foundation.CalculatedArcPoints;
import com.gentleware.poseidon.idraw.foundation.ReferenceCalculatedArcPoints;

public class CustomCalculatedArcPoints extends CalculatedArcPoints {

	private static final long serialVersionUID = -8339694771113599466L;

	public CustomCalculatedArcPoints() {
		super();
	}

	public CustomCalculatedArcPoints(AnchorFacet node1, AnchorFacet node2, UPoint virtualPoint, List<UPoint> allPoints) {
		super(node1, node2, virtualPoint, allPoints);
	}

	public CustomCalculatedArcPoints(CalculatedArcPoints calculated, AnchorFacet node1, AnchorFacet node2) {
		super(calculated, node1, node2);
	}

	public CustomCalculatedArcPoints(CalculatedArcPoints calculated) {
		this(calculated, calculated.getNode1(), calculated.getNode2());
	}

	public CustomCalculatedArcPoints(ReferenceCalculatedArcPoints referenceCalculated) {
		this(getToolLinkableFromReference(referenceCalculated.getNode1Reference()), getToolLinkableFromReference(referenceCalculated.getNode2Reference()), referenceCalculated
				.getVirtualPoint(), referenceCalculated.getAllPoints());
	}

}
