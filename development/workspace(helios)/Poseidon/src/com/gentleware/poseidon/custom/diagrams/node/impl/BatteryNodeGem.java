   		
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
import com.gentleware.poseidon.diagrams.gen.node.DslGenBatteryNodeGem;

import edu.umd.cs.jazz.ZVisualComponent;
import edu.umd.cs.jazz.component.ZImage;
import edu.umd.cs.jazz.component.ZLabel;
import edu.umd.cs.jazz.component.ZRectangle;
import edu.umd.cs.jazz.component.ZShape;


		public class BatteryNodeGem extends DslGenBatteryNodeGem {
		
			public BatteryNodeGem(Color initialFillColor, PersistentFigure figure, String figureName) {
				super(initialFillColor, figure, figureName);
			}

			public BatteryNodeGem(EObject subject, DiagramFacet diagram, String figureId, Color initialFillColor,
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
									
				ZShape rect = new ZRectangle(bounds);
				
				UPoint topLeft = bounds.getTopLeftPoint();
						
				Image image = null;
				
				try {            
		            image = ImageIO.read(this.getClass().getResource("/battery_62x43.png"));                      
		        } catch (IOException ex) {
		            ;
		        }
					
				ZImage zimage = new ZImage(image); 
				zimage.setTranslation(topLeft.getX()+1, topLeft.getY()+1);
				
				ZLabel zlabel = new ZLabel("Battery"); 
				zlabel.setTranslation(topLeft.getX()+0, topLeft.getY()-15);
				zlabel.setPenColor(Color.BLACK); 
				zlabel.setFont(new Font("Joy",Font.BOLD,10));
							
				return new ZVisualComponent[] {rect, zimage, zlabel};
					}
				};
				}	
				};
			}
			//Yau	
	
		}
	   	
	