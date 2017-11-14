package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.gem.CreatorGem;
import com.gentleware.poseidon.geometry.UPoint;
import com.gentleware.poseidon.idraw.foundation.DiagramFacet;
import com.gentleware.poseidon.idraw.foundation.FigureFacet;
import com.gentleware.poseidon.idraw.foundation.FigureReference;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentFigure;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentProperties;
import com.gentleware.poseidon.idraw.nodefacilities.creationbase.BaseNodeCreateFacet;
import com.gentleware.poseidon.idraw.nodefacilities.creationbase.NodeCreateFacet;
import com.gentleware.poseidon.idraw.nodefacilities.creationbase.NodeGem;
import com.gentleware.poseidon.idraw.nodefacilities.nodesupport.BasicNodeGem;
import com.gentleware.poseidon.diagrams.freetext.FreetextNodeGem;

/*
 * This code is generated. All the hand-written changes will be lost.
 */
public final class DslGenFreetextCreatorGem implements CreatorGem {
	public static final String NAME = "Freetext";
	private NodeCreateFacet nodeCreateFacet = new NodeCreateFacetImpl();

	public DslGenFreetextCreatorGem() {
	}

	public NodeCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private class NodeCreateFacetImpl extends BaseNodeCreateFacet {
		public String getFigureName() {
			return FreetextNodeGem.FIGURE_NAME;
		}

		public Object createFigure(Object subject, DiagramFacet diagram,
				String figureId, UPoint location,
				PersistentProperties properties, boolean createAsFeature) {
			BasicNodeGem basicGem = new BasicNodeGem(getRecreatorName(),
					diagram, figureId, location, getNodeRoles());
			NodeGem nodeGem = createNodeGem(subject, diagram, figureId,
					location, properties, null);
			basicGem.connectBasicNodeAppearanceFacet(nodeGem
					.getBasicNodeAppearanceFacet());
			nodeGem.connectBasicNodeFigureFacet(basicGem
					.getBasicNodeFigureFacet());

			diagram.add(basicGem.getBasicNodeFigureFacet());
			return new FigureReference(diagram, figureId);
		}

		public String getRecreatorName() {
			return getCreatorName();
		}

		public FigureFacet createFigure(DiagramFacet diagram,
				PersistentFigure figure) {
			BasicNodeGem basicGem = new BasicNodeGem(getRecreatorName(),
					diagram, figure, getNodeRoles());
			NodeGem nodeGem = createNodeGem(diagram, figure, null);
			basicGem.connectBasicNodeAppearanceFacet(nodeGem
					.getBasicNodeAppearanceFacet());
			nodeGem.connectBasicNodeFigureFacet(basicGem
					.getBasicNodeFigureFacet());
			return basicGem.getBasicNodeFigureFacet();
		}

		public Object createNewSubject(Object previouslyCreated,
				DiagramFacet diagram, FigureReference containingReference,
				Object relatedSubject, PersistentProperties properties) {
			return null;
		}

		public void initializeExtraProperties(PersistentProperties properties) {
		}

		public NodeGem createNodeGem(Object subject, DiagramFacet diagram,
				String figureId, UPoint location,
				PersistentProperties properties, BasicNodeGem basicGem) {
			return new FreetextNodeGem();
		}

		public NodeGem createNodeGem(DiagramFacet diagram,
				PersistentFigure figure, BasicNodeGem basicGem) {
			return new FreetextNodeGem(figure.getProperties());
		}

		public void initNodeRoles() {
		}
	}

	public String getCreatorName() {
		return NAME;
	}

}
