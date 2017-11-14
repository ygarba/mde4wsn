   		
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
import com.gentleware.poseidon.diagrams.gen.node.DslGenSensingActionNodeGem;

import edu.umd.cs.jazz.ZVisualComponent;
import edu.umd.cs.jazz.component.ZImage;
import edu.umd.cs.jazz.component.ZLabel;
import edu.umd.cs.jazz.component.ZRectangle;
import edu.umd.cs.jazz.component.ZRoundedRectangle;
import edu.umd.cs.jazz.component.ZShape;


		public class SensingActionNodeGem extends DslGenSensingActionNodeGem {
		
			public SensingActionNodeGem(Color initialFillColor, PersistentFigure figure, String figureName) {
				super(initialFillColor, figure, figureName);
			}

			public SensingActionNodeGem(EObject subject, DiagramFacet diagram, String figureId, Color initialFillColor,
					PersistentProperties properties, String figureName) {
				super(subject, diagram, figureId, initialFillColor, properties, figureName);
			}
			
			//Yau
			@Override
			public NodeAppearanceFacet createBasicNodeAppearanceFacet() {
				return new BasicSeparateNameNodeAppearanceFacet(initialFillColor, 
						initialFillColor, figureFacet, contents, figureName, textableFacet, 
							subject, false) {
					
					public ShapeAppearanceFacet createShapeAppearanceFacet() {
					return new AbstractShapeAppearanceFacet() {

			@Override
			public ZVisualComponent[] drawShapes(UBounds bounds) {
									
				ZShape roundrect = new ZRoundedRectangle(bounds.x, bounds.y, bounds.width, bounds.height, 0.5*(bounds.width), 0.5*(bounds.height));
				
				UPoint topLeft = bounds.getTopLeftPoint();
					
				ZLabel zlabel = new ZLabel("Sensing"); 
				zlabel.setTranslation(topLeft.getX()+5, topLeft.getY()-13);
				zlabel.setPenColor(Color.BLACK); 
				zlabel.setFont(new Font("Joy",Font.BOLD,9));
							
				return new ZVisualComponent[] {roundrect, zlabel};
					}
				};
				}	
				};
			}
			//Yau	
	
		}
	   	
	