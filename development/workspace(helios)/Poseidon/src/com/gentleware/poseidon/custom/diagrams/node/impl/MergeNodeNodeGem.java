   		
		package com.gentleware.poseidon.custom.diagrams.node.impl;    	
	   	
import java.awt.Color;
import com.gentleware.poseidon.dsl.MetamodelElementWrapper;
import org.eclipse.emf.ecore.EObject;
import com.gentleware.poseidon.idraw.foundation.DiagramFacet;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentFigure;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentProperties;
import com.gentleware.poseidon.diagrams.gen.node.DslGenMergeNodeNodeGem;


		public class MergeNodeNodeGem extends DslGenMergeNodeNodeGem {
		
			public MergeNodeNodeGem(Color initialFillColor, PersistentFigure figure, String figureName) {
				super(initialFillColor, figure, figureName);
			}

			public MergeNodeNodeGem(EObject subject, DiagramFacet diagram, String figureId, Color initialFillColor,
					PersistentProperties properties, String figureName) {
				super(subject, diagram, figureId, initialFillColor, properties, figureName);
			}
	
		}
	   	
	