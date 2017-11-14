package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.idraw.jazz.nodes.ZGridLayer;
import com.gentleware.poseidon.diagrams.gen.factory.DslGenSemanticElementFactory;
import com.gentleware.poseidon.diagrams.gen.base.DslGenElementRoles;
import com.gentleware.poseidon.diagrams.gen.node.DslGenVariableCreatorGem;
import com.gentleware.poseidon.diagrams.gen.bundle.DslGenDiagramResourceBundle;

import org.eclipse.emf.ecore.EObject;

import java.util.Set;

import com.gentleware.poseidon.geometry.UDimension;
import com.gentleware.poseidon.geometry.UPoint;
import com.gentleware.poseidon.idraw.foundation.ContainerFacet;
import com.gentleware.poseidon.idraw.foundation.DiagramFacet;
import com.gentleware.poseidon.idraw.foundation.FigureFacet;
import com.gentleware.poseidon.idraw.foundation.FigureReference;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentFigure;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentProperties;
import com.gentleware.poseidon.diagrams.feature.FeatureNodeGem;
import com.gentleware.poseidon.custom.idraw.nodefacilities.creationbase.CustomBaseNodeCreateFacet;
import com.gentleware.poseidon.idraw.nodefacilities.creationbase.NodeCreationMode;
import com.gentleware.poseidon.idraw.nodefacilities.creationbase.NodeGem;
import com.gentleware.poseidon.idraw.nodefacilities.nodesupport.BasicNodeGem;

import com.gentleware.poseidon.repositorybase.DslGenDiagramType;

import com.gentleware.poseidon.custom.diagrams.featurenode.impl.VariableFeatureTypeFacet; //import com.gentleware.poseidon.custom.diagrams.featurenode.impl.EAttributeFeatureTypeFacet;
import com.gentleware.poseidon.diagrams.feature.FeatureTypeFacet;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public abstract class DslGenVariableCreateFacet extends
		CustomBaseNodeCreateFacet {
	public static final UDimension MINIMUM_SIZE = new UDimension(
			1 * ZGridLayer.DEFAULT_GRID_SPACING,
			1 * ZGridLayer.DEFAULT_GRID_SPACING);

	public static final UDimension DEFAULT_SIZE = new UDimension(
			1 * ZGridLayer.DEFAULT_GRID_SPACING,
			1 * ZGridLayer.DEFAULT_GRID_SPACING);

	public static final String DEFAULT_FIGURE_NAME = "Variable";
	public static final String SEMANTIC_ELEMENT = "com.gentleware.poseidon.model.wrapper.WrappedVariable";

	protected DslGenVariableCreatorGem creatorGem;

	public DslGenVariableCreatorGem getCreatorGem() {
		return creatorGem;
	}

	public void setCreatorGem(DslGenVariableCreatorGem creatorGem) {
		this.creatorGem = creatorGem;
	}

	@Override
	public NodeGem createFeatureNodeGem(Object subject, DiagramFacet diagram,
			String figureId, UPoint location, PersistentProperties properties,
			BasicNodeGem basicGem) {
		FeatureNodeGem featureNodeGem = new FeatureNodeGem((EObject) subject);
		final FeatureTypeFacet featureTypeFacet = new VariableFeatureTypeFacet(
				basicGem.getBasicNodeFigureFacet(), featureNodeGem
						.getTextableFacet(), getRecreatorName(), "class",
				DslGenDiagramResourceBundle.Variable);
		featureNodeGem.connectFeatureTypeFacet(featureTypeFacet);
		basicGem.connectClipboardCommandsFacet(featureNodeGem
				.getClipboardCommandsFacet());
		featureNodeGem.connectBasicNodeFigureFacet(basicGem
				.getBasicNodeFigureFacet());
		return featureNodeGem;
	}

	@Override
	public NodeGem createFeatureNodeGem(DiagramFacet diagram,
			PersistentFigure figure, BasicNodeGem basicGem) {
		FeatureNodeGem featureNodeGem = new FeatureNodeGem(figure);
		final FeatureTypeFacet featureTypeFacet = new VariableFeatureTypeFacet(
				basicGem.getBasicNodeFigureFacet(), featureNodeGem
						.getTextableFacet(), getRecreatorName(), "class",
				DslGenDiagramResourceBundle.Variable);
		featureNodeGem.connectFeatureTypeFacet(featureTypeFacet);
		basicGem.connectClipboardCommandsFacet(featureNodeGem
				.getClipboardCommandsFacet());
		featureNodeGem.connectBasicNodeFigureFacet(basicGem
				.getBasicNodeFigureFacet());
		return featureNodeGem;
	}

	public Object createFigure(Object subject, DiagramFacet diagram,
			String figureId, UPoint location, PersistentProperties properties,
			boolean createAsFeature) {
		BasicNodeGem basicGem = new BasicNodeGem(getRecreatorName(), diagram,
				figureId, location, getDefaultFigureSize(), getNodeRoles(),
				getMinFigureSize());
		PersistentProperties actualProperties = new PersistentProperties(
				properties);
		initializeExtraProperties(actualProperties);

		NodeGem nodeGem = createAsFeature ? createFeatureNodeGem(subject,
				diagram, figureId, location, actualProperties, basicGem)
				: createNodeGem(subject, diagram, figureId, location,
						actualProperties, basicGem);

		basicGem.connectBasicNodeAppearanceFacet(nodeGem
				.getBasicNodeAppearanceFacet());
		ContainerFacet containerFacet = nodeGem.getBasicContainerFacet();
		if (containerFacet != null) {
			basicGem.connectBasicContainerFacet(containerFacet);
		}
		nodeGem.connectBasicNodeFigureFacet(basicGem.getBasicNodeFigureFacet());
		performAdvancedFigureSetup(basicGem, nodeGem, actualProperties);

		diagram.add(basicGem.getBasicNodeFigureFacet());

		return new FigureReference(diagram, figureId);
	}

	public void performAdvancedFigureSetup(BasicNodeGem basicGem,
			NodeGem nodeGem, PersistentProperties properties) {
	}

	@Override
	public EObject createSemanticElement(EObject owner,
			FigureReference containingReference) {
		DslGenSemanticElementFactory factory = DslGenSemanticElementFactory
				.getInstance();
		return factory.createVariableSemanticElement(owner);
	}

	public String getFigureName() {
		return DslGenVariableCreatorGem.NAME;
	}

	public void initializeExtraProperties(PersistentProperties properties) {
		creatorGem.initializeExtraPropertiesImpl(properties);
	}

	@Override
	public FigureFacet createFigure(DiagramFacet diagram,
			PersistentFigure figure, boolean createAsFeature) {
		BasicNodeGem basicGem = new BasicNodeGem(getRecreatorName(), diagram,
				figure, getDefaultFigureSize(), getNodeRoles(),
				getMinFigureSize());
		NodeGem nodeGem = createAsFeature ? createFeatureNodeGem(diagram,
				figure, basicGem) : createNodeGem(diagram, figure, basicGem);

		basicGem.connectBasicNodeAppearanceFacet(nodeGem
				.getBasicNodeAppearanceFacet());
		ContainerFacet containerFacet = nodeGem.getBasicContainerFacet();
		if (containerFacet != null) {
			basicGem.connectBasicContainerFacet(containerFacet);
		}
		nodeGem.connectBasicNodeFigureFacet(basicGem.getBasicNodeFigureFacet());
		performAdvancedFigureSetup(basicGem, nodeGem, figure.getProperties());

		return basicGem.getBasicNodeFigureFacet();
	}

	public String getRecreatorName() {
		return creatorGem.getCreatorName();
	}

	public void initNodeRoles() {
		final Set<String> roles = getNodeRoles();
		roles.add(DslGenElementRoles.VARIABLE);
	}

	@Override
	public void applyExtraPropertiesDelegate(EObject element) {
		creatorGem.applyExtraProperties(element);
	}

	@Override
	public String getDefaultFigureName() {
		return DEFAULT_FIGURE_NAME;
	}

	@Override
	public UDimension getMinFigureSize() {
		return MINIMUM_SIZE;
	}

	@Override
	public UDimension getDefaultFigureSize() {
		return DEFAULT_SIZE;
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
		allowedDiagramTypes.add(DslGenDiagramType.NODE_LITERAL.getName());
	}

}
