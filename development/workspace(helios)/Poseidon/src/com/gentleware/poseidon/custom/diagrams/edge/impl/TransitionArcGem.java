   		
		package com.gentleware.poseidon.custom.diagrams.edge.impl;    	
	   	
import java.awt.Color;
import org.eclipse.emf.ecore.EObject;
import com.gentleware.poseidon.dsl.MetamodelElementWrapper;
import com.gentleware.poseidon.diagrams.gen.edge.DslGenTransitionArcGem;


		public class TransitionArcGem extends DslGenTransitionArcGem {
		
			public TransitionArcGem(EObject subject, String figureName, Color initialFillColor, boolean createdFromPersistentFigure) {
				super(subject, figureName, initialFillColor, createdFromPersistentFigure);	
			}
	
		}
	   	
	