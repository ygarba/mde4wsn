package com.gentleware.poseidon.diagrams.gen.featurenode;

import com.gentleware.poseidon.diagrams.feature.AbstractFeatureTypeFacet;
import com.gentleware.poseidon.idraw.figurefacilities.textmanipulationbase.TextableFacet;
import com.gentleware.poseidon.idraw.nodefacilities.nodesupport.BasicNodeFigureFacet;
import com.gentleware.poseidon.swingx.ResourceId;
import com.gentleware.poseidon.repositorybase.GlobalSubjectRepository;
import com.gentleware.poseidon.repositorybase.SubjectRepositoryFacet;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import com.gentleware.poseidon.idraw.foundation.ContainedFacet;
import com.gentleware.poseidon.idraw.foundation.ContainerFacet;
import com.gentleware.poseidon.idraw.foundation.FigureReference;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public abstract class DslGenEntryActionFeatureTypeFacet extends
		AbstractFeatureTypeFacet {

	public DslGenEntryActionFeatureTypeFacet(BasicNodeFigureFacet figureFacet,
			TextableFacet textableFacet, String figureName, String iconName,
			ResourceId resourceId) {
		super(figureFacet, textableFacet, figureName, iconName, resourceId);
	}

	@Override
	protected EObject findOwningVisualElement() {
		SubjectRepositoryFacet repository = GlobalSubjectRepository.repository;
		Object aSubject = getFigureFacet().getSubject();
		EObject foundOwningElement = repository.findOwningElement(
				getFigureFacet().getFigureReference(), (EClass) null);
		if (foundOwningElement == aSubject) {
			ContainedFacet containedFacet = getFigureFacet()
					.getContainedFacet();
			if (containedFacet != null) {
				ContainerFacet container = containedFacet.getContainer();
				if (container != null) {
					FigureReference containerFigureReference = container
							.getFigureFacet().getFigureReference();
					foundOwningElement = repository.findOwningElement(
							containerFigureReference, (EClass) null);
				}
			}
		}
		return foundOwningElement == aSubject ? null : foundOwningElement;
	}

}
