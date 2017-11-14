package com.gentleware.poseidon.custom.diagrams.node;

import com.gentleware.poseidon.diagrams.linkedtext.PoseidonLinkedTextGem;
import com.gentleware.poseidon.geometry.UPoint;
import com.gentleware.poseidon.idraw.foundation.DiagramFacet;
import com.gentleware.poseidon.idraw.foundation.FigureFacet;
import com.gentleware.poseidon.idraw.foundation.FigureReference;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentFigure;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentProperties;
import com.gentleware.poseidon.idraw.nodefacilities.creationbase.BaseNodeCreateFacet;
import com.gentleware.poseidon.idraw.nodefacilities.creationbase.NodeGem;
import com.gentleware.poseidon.idraw.nodefacilities.nodesupport.BasicNodeFigureFacet;
import com.gentleware.poseidon.idraw.nodefacilities.nodesupport.BasicNodeGem;
import com.gentleware.poseidon.idraw.nodefacilities.nodesupport.LinkedTextGem;

public class LinkedTextNodeCreateFacetImpl extends BaseNodeCreateFacet {
	private String recreatorName = null;
	
	public LinkedTextNodeCreateFacetImpl(String recreatorName){
		this.recreatorName = recreatorName;		
	}
	
	public String getFigureName() {
		return LinkedTextGem.FIGURE_NAME;
	}

	public Object createFigure(Object subject, DiagramFacet diagram,
			String figureId, UPoint location,
			PersistentProperties properties, boolean createAsFeature) {
		// never create on its own
		return null;
	}

	/**
	 * @see com.gentleware.poseidon.idraw.foundation.PersistentFigureRecreatorFacet#getFullName()
	 */
	@Override
	public String getRecreatorName() {
		return recreatorName;
	}

	/**
	 * @see com.gentleware.poseidon.idraw.foundation.PersistentFigureRecreatorFacet#persistence_createFromProperties(FigureReference,
	 *      PersistentProperties)
	 */
	@Override
	public FigureFacet createFigure(DiagramFacet diagram,
			PersistentFigure figure, boolean createAsFeature) {
		BasicNodeGem basicGem = new BasicNodeGem(getRecreatorName(),
				diagram, figure, getNodeRoles());
		NodeGem nodeGem = createNodeGem(diagram, figure, null);
		basicGem.connectBasicNodeAppearanceFacet(nodeGem
				.getBasicNodeAppearanceFacet());
		nodeGem.connectBasicNodeFigureFacet(basicGem
				.getBasicNodeFigureFacet());
		// decorate the clipboard facet
		// TODO No way to generate!
		basicGem.connectClipboardCommandsFacet(((PoseidonLinkedTextGem) nodeGem)
				.getClipboardCommandsFacet());		
		final BasicNodeFigureFacet basicNodeFigureFacet = basicGem.getBasicNodeFigureFacet();
		return basicNodeFigureFacet;
		
	}

	@Override
	public Object createNewSubject(Object previouslyCreated,
			DiagramFacet diagram, FigureReference containingReference,
			Object relatedSubject, PersistentProperties properties) {
		return null;
	}

	public void initializeExtraProperties(PersistentProperties properties) {
	}

	
	@Override
	public NodeGem createNodeGem(Object subject, DiagramFacet diagram,
			String figureId, UPoint location,
			PersistentProperties properties, BasicNodeGem basicGem) {
		return null;
	}

	
	@Override
	public NodeGem createNodeGem(DiagramFacet diagram,
			PersistentFigure figure, BasicNodeGem basicGem) {
		return new PoseidonLinkedTextGem(figure.getProperties());
	}

	
	public void initNodeRoles() {
	}

}
