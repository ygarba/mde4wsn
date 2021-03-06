package com.gentleware.poseidon.diagrams.gen.edge;

import com.gentleware.poseidon.diagrams.gen.factory.DslGenSemanticElementFactory;
import com.gentleware.poseidon.diagrams.gen.base.DslGenElementRoles;
import com.gentleware.poseidon.diagrams.gen.edge.DslGenActivityEdgeCreatorGem;

import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import com.gentleware.poseidon.idraw.foundation.CalculatedArcPoints;

import com.gentleware.poseidon.dsl.MetamodelElementWrapper;
import com.gentleware.poseidon.custom.idraw.foundation.CustomCalculatedArcPoints;
import com.gentleware.poseidon.idraw.figurefacilities.selection.SelectionToolHelper;

import com.gentleware.poseidon.diagrams.arc.BasicArcGem;
import com.gentleware.poseidon.idraw.arcfacilities.creationbase.ArcGem;
import com.gentleware.poseidon.idraw.arcfacilities.creationbase.BaseArcCreateFacet;
import com.gentleware.poseidon.idraw.foundation.DiagramFacet;
import com.gentleware.poseidon.idraw.foundation.FigureFacet;
import com.gentleware.poseidon.idraw.foundation.FigureReference;
import com.gentleware.poseidon.idraw.foundation.ReferenceCalculatedArcPoints;
import com.gentleware.poseidon.idraw.foundation.ToolCoordinatorFacet;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentFigure;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentProperties;

import com.gentleware.poseidon.repositorybase.DslGenDiagramType;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public abstract class DslGenActivityEdgeCreateFacet extends BaseArcCreateFacet {
	public static final String DEFAULT_FIGURE_NAME = "ActivityEdge";
	public static final String SEMANTIC_ELEMENT = "com.gentleware.poseidon.model.wrapper.WrappedActivityEdge";

	protected DslGenActivityEdgeCreatorGem creatorGem;

	public DslGenActivityEdgeCreatorGem getCreatorGem() {
		return creatorGem;
	}

	public void setCreatorGem(DslGenActivityEdgeCreatorGem creatorGem) {
		this.creatorGem = creatorGem;
	}

	public Object create(Object subject, DiagramFacet diagram, String figureId,
			ReferenceCalculatedArcPoints referencePoints,
			PersistentProperties properties) {
		BasicArcGem gem = new BasicArcGem(this, this, diagram, figureId,
				new CustomCalculatedArcPoints(referencePoints));
		ArcGem arcGem = createArcGem(subject, diagram, figureId,
				referencePoints, properties, gem);
		gem.connectBasicArcAppearanceFacet(arcGem.getBasicArcAppearanceFacet());
		arcGem.connectFigureFacet(gem.getFigureFacet());
		gem.connectContainerFacet(arcGem.getContainerFacet());
		gem.connectAdvancedArcFacet(arcGem.getAdvancedArcFacet());
		arcGem.connectCurvableFacet(gem.getCurvableFacet());
		diagram.add(gem.getFigureFacet());
		performAdvancedFigureSetup(gem, arcGem);

		return new FigureReference(diagram, figureId);
	}

	@Override
	public FigureFacet createFigure(DiagramFacet diagram,
			PersistentFigure figure) {
		// instantiate to use conventional facets
		BasicArcGem gem = new BasicArcGem(this, this, diagram, figure);
		ArcGem arcGem = createArcGem(diagram, figure, gem);
		arcGem.connectCurvableFacet(gem.getCurvableFacet());
		gem.connectContainerFacet(arcGem.getContainerFacet());
		gem.connectAdvancedArcFacet(arcGem.getAdvancedArcFacet());
		arcGem.connectFigureFacet(gem.getFigureFacet());
		gem.connectBasicArcAppearanceFacet(arcGem.getBasicArcAppearanceFacet());
		performAdvancedFigureSetup(gem, arcGem);

		return gem.getFigureFacet();
	}

	public void performAdvancedFigureSetup(BasicArcGem basicGem, ArcGem arcGem) {
	}

	@Override
	public EObject createSemanticElement(DiagramFacet diagram,
			ReferenceCalculatedArcPoints calculatedPoints) {
		DslGenSemanticElementFactory factory = DslGenSemanticElementFactory
				.getInstance();
		final CalculatedArcPoints points = new CustomCalculatedArcPoints(
				calculatedPoints);
		FigureFacet sourceFigureFacet = points.getNode1().getFigureFacet();
		final EObject source = (EObject) sourceFigureFacet.getSubject();
		final EObject target = (EObject) points.getNode2().getFigureFacet()
				.getSubject();
		return factory.createActivityEdgeSemanticElement(source, target);
	}

	public String getFigureName() {
		return DslGenActivityEdgeCreatorGem.NAME;
	}

	public void initializeExtraProperties(PersistentProperties properties) {
		creatorGem.initializeExtraPropertiesImpl(properties);
	}

	public String getRecreatorName() {
		return creatorGem.getCreatorName();
	}

	public void initSourcesAndTargets() {
		final Set<String> sources = getSources();
		sources.add(DslGenElementRoles.INITIALNODE);
		sources.add(DslGenElementRoles.DECISIONNODE);
		sources.add(DslGenElementRoles.MERGENODE);
		sources.add(DslGenElementRoles.SENSINGACTION);
		sources.add(DslGenElementRoles.ACTUATINGACTION);
		sources.add(DslGenElementRoles.TIMINGACTION);
		sources.add(DslGenElementRoles.UPDATEPOOLACTION);
		sources.add(DslGenElementRoles.GETNODEACTION);
		sources.add(DslGenElementRoles.GETDATAACTION);
		sources.add(DslGenElementRoles.REMOTETRIGGERACTION);
		sources.add(DslGenElementRoles.OPAQUEACTION);

		final Set<String> targets = getTargets();
		targets.add(DslGenElementRoles.FINALNODE);
		targets.add(DslGenElementRoles.DECISIONNODE);
		targets.add(DslGenElementRoles.MERGENODE);
		targets.add(DslGenElementRoles.SENSINGACTION);
		targets.add(DslGenElementRoles.ACTUATINGACTION);
		targets.add(DslGenElementRoles.TIMINGACTION);
		targets.add(DslGenElementRoles.UPDATEPOOLACTION);
		targets.add(DslGenElementRoles.GETNODEACTION);
		targets.add(DslGenElementRoles.GETDATAACTION);
		targets.add(DslGenElementRoles.REMOTETRIGGERACTION);
		targets.add(DslGenElementRoles.OPAQUEACTION);
	}

	@Override
	public void applyExtraPropertiesDelegate(EObject element) {
		creatorGem.applyExtraProperties(element);
	}

	public void aboutToMakeCommand(ToolCoordinatorFacet coordinator) {
	}

	@Override
	public String getDefaultFigureName() {
		return DEFAULT_FIGURE_NAME;
	}

	@Override
	public String getSemanticElementName() {
		return SEMANTIC_ELEMENT;
	}

	@Override
	protected void initAllowedDiagramTypes() {
		super.initAllowedDiagramTypes();
		final Set<String> allowedDiagramTypes = getAllowedDiagramTypes();
		allowedDiagramTypes.clear();
		allowedDiagramTypes.add(DslGenDiagramType.ACTIVITY_LITERAL.getName());
		allowedDiagramTypes.add(DslGenDiagramType.PLATFORM_LITERAL.getName());
	}

}
