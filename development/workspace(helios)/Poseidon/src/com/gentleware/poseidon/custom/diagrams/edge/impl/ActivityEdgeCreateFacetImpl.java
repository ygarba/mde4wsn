   		
		package com.gentleware.poseidon.custom.diagrams.edge.impl;    	
	   	
import com.gentleware.poseidon.diagrams.gen.edge.DslGenActivityEdgeCreateFacet;

import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.idraw.arcfacilities.arcsupport.AbstractBasicArcGem;
import com.gentleware.poseidon.idraw.arcfacilities.creationbase.ArcGem;
import com.gentleware.poseidon.idraw.foundation.DiagramFacet;
import com.gentleware.poseidon.idraw.foundation.ReferenceCalculatedArcPoints;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentFigure;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentProperties;



		public class ActivityEdgeCreateFacetImpl extends DslGenActivityEdgeCreateFacet {
		
			@Override
			public ArcGem createArcGem(Object subject, DiagramFacet diagram,
					String figureId, ReferenceCalculatedArcPoints calculatedPoints,
					PersistentProperties properties, AbstractBasicArcGem gem) {
				return new ActivityEdgeArcGem((EObject) subject, getFigureName(), extractFillColor(properties), false);
			}
	
			@Override
			public ArcGem createArcGem(DiagramFacet diagram, PersistentFigure figure, AbstractBasicArcGem gem) { 
				return new ActivityEdgeArcGem((EObject) figure.getSubject(), getFigureName(), extractFillColor(figure.getProperties()), true);
			}
	
		}
	   	
	