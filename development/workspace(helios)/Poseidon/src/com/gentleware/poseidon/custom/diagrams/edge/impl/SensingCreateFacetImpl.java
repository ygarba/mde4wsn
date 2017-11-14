   		
		package com.gentleware.poseidon.custom.diagrams.edge.impl;    	
	   	
import com.gentleware.poseidon.diagrams.gen.edge.DslGenSensingCreateFacet;

import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.idraw.arcfacilities.arcsupport.AbstractBasicArcGem;
import com.gentleware.poseidon.idraw.arcfacilities.creationbase.ArcGem;
import com.gentleware.poseidon.idraw.foundation.DiagramFacet;
import com.gentleware.poseidon.idraw.foundation.ReferenceCalculatedArcPoints;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentFigure;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentProperties;



		public class SensingCreateFacetImpl extends DslGenSensingCreateFacet {
		
			@Override
			public ArcGem createArcGem(Object subject, DiagramFacet diagram,
					String figureId, ReferenceCalculatedArcPoints calculatedPoints,
					PersistentProperties properties, AbstractBasicArcGem gem) {
				return new SensingArcGem((EObject) subject, getFigureName(), extractFillColor(properties), false);
			}
	
			@Override
			public ArcGem createArcGem(DiagramFacet diagram, PersistentFigure figure, AbstractBasicArcGem gem) { 
				return new SensingArcGem((EObject) figure.getSubject(), getFigureName(), extractFillColor(figure.getProperties()), true);
			}
	
		}
	   	
	