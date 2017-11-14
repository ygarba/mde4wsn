package com.gentleware.poseidon.diagrams.gen.edge;

import java.awt.Color;
import org.eclipse.emf.ecore.EObject;
import com.gentleware.poseidon.dsl.MetamodelElementWrapper;
import com.gentleware.poseidon.diagrams.base.*;
import com.gentleware.poseidon.custom.diagrams.base.CustomBasicArcAppearanceFacet;
import com.gentleware.poseidon.idraw.arcfacilities.arcsupport.*;

public class DslGenWirelessLinkArcGem extends BaseArcGem {

	public DslGenWirelessLinkArcGem(EObject subject, String figureName,
			Color initialFillColor, boolean createdFromPersistentFigure) {
		super(subject, figureName, initialFillColor,
				createdFromPersistentFigure);
	}

	protected BasicArcAppearanceGem createBasicEdgeAppearanceFacet() {
		return new CustomBasicArcAppearanceFacet(fillColor, lineColor,
				figureFacet, figureName, subject) {

			public ArcEndAppearanceFacet createTargetEndAppearanceFacet() {
				return new ClosedArrowArcEndAppearanceFacet(false);
			}

			public LineAppearanceFacet createLineAppearanceFacet() {
				return new DashedLineAppeareanceFacet();
			}

		};
	}

}
