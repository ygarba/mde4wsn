package com.gentleware.poseidon.diagrams.gen.node;

import java.awt.Color;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import com.gentleware.poseidon.dsl.MetamodelElementWrapper;
import com.gentleware.poseidon.idraw.foundation.DiagramFacet;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentFigure;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentProperties;
import com.gentleware.poseidon.diagrams.base.node.*;
import com.gentleware.poseidon.idraw.nodefacilities.nodesupport.*;
import com.gentleware.poseidon.diagrams.feature.FeaturedNodeGem;
import com.gentleware.poseidon.diagrams.feature.CompartmentFeatureInfo;
import com.gentleware.poseidon.dsldeltaengine.gen.*;
import com.gentleware.poseidon.diagrams.gen.bundle.DslGenDiagramResourceBundle;

public class DslGenActuatingActionNodeGem extends SeparateNameContainerNodeGem {

	public DslGenActuatingActionNodeGem(Color initialFillColor,
			PersistentFigure figure, String figureName) {
		super(initialFillColor, figure, figureName, true);
	}

	public DslGenActuatingActionNodeGem(EObject subject, DiagramFacet diagram,
			String figureId, Color initialFillColor,
			PersistentProperties properties, String figureName) {
		super(subject, diagram, figureId, initialFillColor, properties,
				figureName, true);
	}

	public String getIconName() {
		return "call-action";
	}

	public NodeAppearanceFacet createBasicNodeAppearanceFacet() {
		return new SeparateNameAboveNodeAppearanceFacet(initialFillColor,
				initialFillColor, figureFacet, contents, figureName,
				textableFacet, subject, true) {
			public ShapeAppearanceFacet createShapeAppearanceFacet() {
				return new RoundedRectangleShapeAppearanceFacet();
			}
		};
	}

}
