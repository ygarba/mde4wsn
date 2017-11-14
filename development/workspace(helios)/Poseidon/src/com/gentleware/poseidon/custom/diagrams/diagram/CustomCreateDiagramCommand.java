package com.gentleware.poseidon.custom.diagrams.diagram;

import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.diagrams.diagram.CreateDiagramCommand;
import com.gentleware.poseidon.repositorybase.DslGenDiagramType;

public class CustomCreateDiagramCommand extends CreateDiagramCommand {

	private static final long serialVersionUID = 610583122413874125L;

	public CustomCreateDiagramCommand(EObject diagramOwner, DslGenDiagramType diagramType) {
		super(diagramOwner, diagramType);
	}

}
