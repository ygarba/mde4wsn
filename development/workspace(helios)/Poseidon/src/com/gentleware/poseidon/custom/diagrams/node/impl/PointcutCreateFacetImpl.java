   		
		package com.gentleware.poseidon.custom.diagrams.node.impl;    	
	   	
import com.gentleware.poseidon.diagrams.gen.node.DslGenPointcutCreateFacet;

import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.geometry.UPoint;
import com.gentleware.poseidon.idraw.foundation.DiagramFacet;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentFigure;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentProperties;
import com.gentleware.poseidon.idraw.nodefacilities.creationbase.NodeGem;
import com.gentleware.poseidon.idraw.nodefacilities.nodesupport.BasicNodeGem;


		public class PointcutCreateFacetImpl extends DslGenPointcutCreateFacet {

			@Override
			public NodeGem createNodeGem(Object subject, DiagramFacet diagram,
					String figureId, UPoint location,
					PersistentProperties properties, BasicNodeGem basicGem) {
				return new PointcutNodeGem((EObject) subject, diagram,
					figureId, extractFillColor(properties), properties, getFigureName()); 
			}
	
			@Override
			public NodeGem createNodeGem(DiagramFacet diagram,
					PersistentFigure figure, BasicNodeGem basicGem) {
				return new PointcutNodeGem(extractFillColor(figure.getProperties()), figure, getFigureName());
			}
	
		}
	   	
	