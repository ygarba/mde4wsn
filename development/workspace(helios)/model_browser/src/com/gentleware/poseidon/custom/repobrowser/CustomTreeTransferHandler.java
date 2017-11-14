package com.gentleware.poseidon.custom.repobrowser;

import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.idraw.foundation.AbstractCommand;
import com.gentleware.poseidon.repobrowser.TreeMediator;
import com.gentleware.poseidon.repobrowser.dnd.TreeTransferHandler;
import com.gentleware.poseidon.repository.SemanticElementManager;

public class CustomTreeTransferHandler extends TreeTransferHandler {

	private static final long serialVersionUID = 1L;

	public CustomTreeTransferHandler(TreeMediator mediator) {
		super(mediator);
	}

	@Override
	protected AbstractCommand makeChangeOwnerCommand(final EObject droppedElement, final EObject dropTarget, final SemanticElementManager semanticElementsManager,
			final EObject oldNamespace) {
		return super.makeChangeOwnerCommand(droppedElement, dropTarget, semanticElementsManager, oldNamespace);

		//	the commented code below is an example of the implementation of this method 
/*		AbstractCommand changeOwnerCommand = new AbstractCommand() {

			private static final long serialVersionUID = 1L;

			public void execute(boolean isTop) {
				semanticElementsManager.addSemanticElementToOwner(droppedElement, dropTarget);
			}

			public void unExecute() {
				semanticElementsManager.addSemanticElementToOwner(droppedElement, oldNamespace);
			}

		};
		return changeOwnerCommand;*/
	}

}
