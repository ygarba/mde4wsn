package com.gentleware.poseidon.custom.gui.menu;

import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.diagrams.listeners.NewDefaultDiagramActionListener;
import com.gentleware.poseidon.gui.ApplicationWindow;
import com.gentleware.poseidon.repositorybase.DslGenDiagramType; //Yau: added as suggest fix

public class NewYauStateMachineDiagramActionListener extends
		NewDefaultDiagramActionListener {

	public NewYauStateMachineDiagramActionListener(
			ApplicationWindow applicationWindow) {
		super(applicationWindow);
		// TODO Auto-generated constructor stub
	}

	public NewYauStateMachineDiagramActionListener(
			ApplicationWindow applicationWindow, EObject diagramOwner) {
		super(applicationWindow, diagramOwner);
		// TODO Auto-generated constructor stub
	}
	
	//@Author(name = "Yau")
	@Override
	protected DslGenDiagramType getDiagramType() {
		return DslGenDiagramType.STATEMACHINE_LITERAL;
	}
}
