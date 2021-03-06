package net.certware.argument.caz.diagram.edit.commands;

import net.certware.argument.caz.Argument;
import net.certware.argument.caz.Evidence;
import net.certware.argument.caz.diagram.edit.policies.CazBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ArgumentArgumentEvidenceReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ArgumentArgumentEvidenceReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof Argument) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Evidence && newEnd instanceof Argument)) {
			return false;
		}
		return CazBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistArgumentArgumentEvidence_4007(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Evidence && newEnd instanceof Evidence)) {
			return false;
		}
		return CazBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistArgumentArgumentEvidence_4007(getOldSource(),
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getArgumentEvidence().remove(getOldTarget());
		getNewSource().getArgumentEvidence().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getArgumentEvidence().remove(getOldTarget());
		getOldSource().getArgumentEvidence().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected Argument getOldSource() {
		return (Argument) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected Argument getNewSource() {
		return (Argument) newEnd;
	}

	/**
	 * @generated
	 */
	protected Evidence getOldTarget() {
		return (Evidence) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Evidence getNewTarget() {
		return (Evidence) newEnd;
	}
}
