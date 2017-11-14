package com.gentleware.poseidon.custom.diagrams.base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.deltaengine.base.DEConstituent;
import com.gentleware.poseidon.deltaengine.base.DEElement;
import com.gentleware.poseidon.deltaengine.base.DEObject;
import com.gentleware.poseidon.deltaengine.base.DEPackage;
import com.gentleware.poseidon.deltaengine.base.DEPort;
import com.gentleware.poseidon.deltaengine.base.DeltaPair;
import com.gentleware.poseidon.deltaengine.base.GlobalDeltaEngine;
import com.gentleware.poseidon.deltaengine.base.IDeltaEngine;
import com.gentleware.poseidon.deltaengine.base.IDeltas;
import com.gentleware.poseidon.idraw.figures.simplecontainernode.SimpleDeletedUuidsFacet;
import com.gentleware.poseidon.idraw.foundation.Command;
import com.gentleware.poseidon.idraw.foundation.CompositeCommand;
import com.gentleware.poseidon.idraw.foundation.FigureFacet;
import com.gentleware.poseidon.idraw.foundation.LinkingFacet;
import com.gentleware.poseidon.idraw.nodefacilities.nodesupport.BasicNodeFigureFacet;
import com.gentleware.poseidon.repository.SemanticElementManager;

public abstract class PoseidonCoreElementConstituentHelper {
	private BasicNodeFigureFacet figure;
	/**
	 * this is what the figure is added to. if it is null, then the diagram is used; e.g. for connectors
	 */
	private FigureFacet container;
	/** should we be showing these constituents */
	private boolean showing;
	/** the figures that are currently visible */
	private Set<FigureFacet> currentlyDisplayed;
	private boolean top;
	private SimpleDeletedUuidsFacet deleted;
	private String ownerRole;
	private String childRole;

	public PoseidonCoreElementConstituentHelper(BasicNodeFigureFacet classFigure, FigureFacet container, boolean showing, Iterator<FigureFacet> figures, String ownerRole,
			String childRole, SimpleDeletedUuidsFacet deleted, boolean top) {
		this.figure = classFigure;
		this.container = container;
		this.showing = showing;
		this.currentlyDisplayed = getCurrentlyDisplayed(figures);
		this.top = top;
		this.deleted = deleted;
		this.ownerRole = ownerRole;
		this.childRole = childRole;
	}

	/**
	 * add the figure to the display
	 * 
	 * @param perspective
	 * @param currentInContainerIgnoringDeletes
	 * @param elementFigure
	 * @param containerReference
	 * @param object
	 * @param pair
	 * @param top
	 * @return
	 */
	public abstract Command makeAddCommand(DEPackage perspective, Set<FigureFacet> currentInContainerIgnoringDeletes, BasicNodeFigureFacet elementFigure,
			FigureFacet container, DeltaPair addOrReplace, boolean top);

	public boolean isShowingAllConstituents() {
		Set<DeltaPair> constituents = getConstituents(getPerspective(), ownerRole, childRole);
		for (DeltaPair pair : constituents) {
			if (!containedWithin(currentlyDisplayed, pair))
				return false;
		}
		return true;
	}

	public Map<String, String> getHiddenConstituents() {
		Map<String /* UUID */, String /* name */> hidden = new LinkedHashMap<String, String>();

		Set<DeltaPair> constituents = getConstituents(getPerspective(), ownerRole, childRole);

		for (DeltaPair pair : constituents) {
			if (!containedWithin(currentlyDisplayed, pair))
				hidden.put(pair.getConstituent().getUuid(), pair.getConstituent().getName());
		}
		return hidden;
	}

	public Set<String> getConstituentUuids() {
		Set<String> uuids = new HashSet<String>();
		for (DeltaPair pair : getConstituents(getPerspective(), ownerRole, childRole)){
			uuids.add(pair.getUuid());
		}
		return uuids;
	}

	/**
	 * work out the perspective of this element
	 * 
	 * @return
	 */
	public DEPackage getPerspective() {
		final DEPackage extractDEStratum = com.gentleware.poseidon.diagrams.constituenthelpers.PerspectiveHelper.extractDEStratum(figure.getDiagram(), figure
				.getContainedFacet().getContainer());
		return extractDEStratum;
	}

	public CompositeCommand makeUpdateCommand() {
		// if the container isn't visible, don't bother
		if (!showing)
			return null;

		IDeltaEngine engine = GlobalDeltaEngine.engine;

		// work out the perspective
		DEPackage perspective = getPerspective();
		Set<DeltaPair> constituents = getConstituents(perspective, ownerRole, childRole);

		// work out what we need to delete
		CompositeCommand cmd = new CompositeCommand("", "");
		List<DEObject> existing = new ArrayList<DEObject>();

		// delete if this shouldn't be here
		Set<String> suppressed = getVisuallySuppressed(perspective, GlobalDeltaEngine.engine.locateObject(figure.getSubject()).asElement()/*, constituentType*/);
		Set<DEObject> visualProblems = new HashSet<DEObject>();
		for (FigureFacet f : currentlyDisplayed) {
			// don't delete if this is deleted -- this is covered elsewhere
			EObject subject = (EObject) f.getSubject();

			if (subject != null && !SemanticElementManager.getInstance().isElementDeleted(subject)) {
				DEObject constituent = engine.locateObject(subject);
				boolean visualProblem = hasVisualProblem(figure, f, constituent.asConstituent());
				if (deleted.isDeleted(suppressed, constituent.getUuid()) || !containedWithin(constituents, constituent) || existing.contains(constituent) || visualProblem) {
					cmd.addCommand(f.formDeleteCommand());
					if (visualProblem)
						visualProblems.add(constituent);
				} else
					existing.add(constituent);
			}
		}

		// work out what we need to add
		for (DeltaPair pair : constituents) {
			if ((visualProblems.contains(pair.getConstituent()) || !containedWithin(currentlyDisplayed, pair))
					&& !deleted.isDeleted(suppressed, pair.getConstituent().getUuid())) {
				cmd.addCommand(makeAddCommand(perspective, currentlyDisplayed, figure, container, pair, top));
			}
		}

		return cmd;
	}

	protected boolean hasVisualProblem(BasicNodeFigureFacet container, FigureFacet sub, DEConstituent constituent) {
		return false;
	}

	public static Set<String> getVisuallySuppressed(DEPackage perspective, DEElement element/*, Class constituentType*/) {
		return new HashSet<String>();
	}

	private Set<FigureFacet> getCurrentlyDisplayed(Iterator<FigureFacet> figures) {
		Set<FigureFacet> current = new HashSet<FigureFacet>();
		for (Iterator<FigureFacet> iter = figures; iter.hasNext();)
			current.add(iter.next());
		return current;
	}

	private Set<DeltaPair> getConstituents(DEPackage perspective, String ownerRole, String childRole) {
		IDeltaEngine engine = GlobalDeltaEngine.engine;
		EObject featuredElement = (EObject) figure.getSubject();

		// get the deltas for this perspective
		DEObject object = engine.locateObject(featuredElement);
		if (object == null) {
			return new HashSet<DeltaPair>();
		}
		DEElement element = object.asElement();

		IDeltas deltas = element.getDeltas(ownerRole, childRole);

		Set<DeltaPair> pairs = new LinkedHashSet<DeltaPair>();
		for (DeltaPair pair : deltas.getConstituents()) {
			pairs.add(pair);
		}

		return pairs;
	}

	private boolean containedWithin(Set<FigureFacet> current, DeltaPair pair) {
		IDeltaEngine engine = GlobalDeltaEngine.engine;

		for (FigureFacet figure : current) {
			if (figure.getSubject() != null) {
				DEObject constituent = engine.locateObject(figure.getSubject());
				if (pair.getConstituent() == constituent)
					return true;
			}
		}
		return false;
	}

	private boolean containedWithin(Set<DeltaPair> constituents, DEObject constituent) {
		for (DeltaPair pair : constituents)
			if (pair.getConstituent() == constituent)
				return true;
		return false;
	}

	public void cleanUuids() {
		Object subject = figure.getSubject();
		DEObject locatedObject = GlobalDeltaEngine.engine.locateObject(subject);
		DEPackage perspective = getPerspective();
		DEElement asElement = locatedObject.asElement();
		Set<String> visuallySuppressed = getVisuallySuppressed(perspective, asElement);
		Set<String> constituentUuids = getConstituentUuids();
		deleted.clean(visuallySuppressed, constituentUuids);
	}

	public static FigureFacet lookForFigure(FigureFacet figure, Object containingSubject, DEPort port, boolean found) {
		EObject subject = (EObject) figure.getSubject();

		if (subject == containingSubject)
			found = true;

		if (figure.getSubject() == port.getRepositoryObject() && found)
			return figure;

		// look through each child in turn
		if (figure.getContainerFacet() != null) {
			for (Iterator<FigureFacet> child = figure.getContainerFacet().getContents(); child.hasNext();) {
				FigureFacet childFigure = lookForFigure(child.next(), containingSubject, port, found);
				if (childFigure != null)
					return childFigure;
			}
		}

		// if we get here, we have lost :-(
		return null;
	}

	public static FigureFacet extractVisualPoseidonCoreElementFigureFromConstituent(FigureFacet constituent) {
		// travel up until we find a PoseidonCoreElement
		for (;;) {
			if (constituent == null)
				return null;
			if (constituent.getSubject() instanceof EObject)
				return constituent;
			if (constituent.getContainedFacet() == null || constituent.getContainedFacet().getContainer() == null)
				return null;
			constituent = constituent.getContainedFacet().getContainer().getFigureFacet();
		}
	}

	public static EObject extractVisualPoseidonCoreElementFromConstituent(FigureFacet constituent) {
		return (EObject) extractVisualPoseidonCoreElementFigureFromConstituent(constituent).getSubject();
	}

	/**
	 * return the replaced element if this is a replacement, otherwise just return the element
	 */
	public static EObject getOriginalSubject(Object subject) {
		EObject constituent = (EObject) subject;
		return constituent;
	}

	public static EObject getPossibleDeltaSubject(Object subject) {
		EObject element = (EObject) subject;
		return element;
	}

	/**
	 * look through the subfigures until we find one with the correct subject
	 * 
	 * @param top
	 * @param subject
	 * @return
	 */
	public static FigureFacet findSubfigure(FigureFacet top, Object subject) {
		if (top.getSubject() == subject)
			return top;

		// now consider contained subfigures
		if (top.getContainerFacet() != null)
			for (Iterator<FigureFacet> iter = top.getContainerFacet().getContents(); iter.hasNext();) {
				FigureFacet child = findSubfigure(iter.next(), subject);
				if (child != null)
					return child;
			}

		// consider any links also
		if (top.getAnchorFacet() != null)
			for (Iterator<LinkingFacet> iter = top.getAnchorFacet().getLinks(); iter.hasNext();) {
				FigureFacet child = findSubfigure(iter.next().getFigureFacet(), subject);
				if (child != null)
					return child;
			}

		return null;
	}
}
