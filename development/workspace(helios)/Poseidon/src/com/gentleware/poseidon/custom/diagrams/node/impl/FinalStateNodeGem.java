   		
		package com.gentleware.poseidon.custom.diagrams.node.impl;    	
	   	
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.gentleware.poseidon.dsl.MetamodelElementWrapper;
import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.geometry.UBounds;
import com.gentleware.poseidon.geometry.UPoint;
import com.gentleware.poseidon.idraw.foundation.DiagramFacet;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentFigure;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentProperties;
import com.gentleware.poseidon.idraw.nodefacilities.nodesupport.AbstractShapeAppearanceFacet;
import com.gentleware.poseidon.idraw.nodefacilities.nodesupport.NodeAppearanceFacet;
import com.gentleware.poseidon.idraw.nodefacilities.nodesupport.ShapeAppearanceFacet;
import com.gentleware.poseidon.diagrams.base.node.BasicSeparateNameNodeAppearanceFacet;
import com.gentleware.poseidon.diagrams.gen.node.DslGenFinalStateNodeGem;

import edu.umd.cs.jazz.ZVisualComponent;
import edu.umd.cs.jazz.component.ZEllipse;
import edu.umd.cs.jazz.component.ZImage;
import edu.umd.cs.jazz.component.ZLabel;
import edu.umd.cs.jazz.component.ZRectangle;
import edu.umd.cs.jazz.component.ZShape;


		public class FinalStateNodeGem extends DslGenFinalStateNodeGem {
		
			public FinalStateNodeGem(Color initialFillColor, PersistentFigure figure, String figureName) {
				super(initialFillColor, figure, figureName);
			}

			public FinalStateNodeGem(EObject subject, DiagramFacet diagram, String figureId, Color initialFillColor,
					PersistentProperties properties, String figureName) {
				super(subject, diagram, figureId, initialFillColor, properties, figureName);
			}
						 			
		}
	   	
	