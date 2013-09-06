/*
* generated by Xtext
*/
package net.certware.planning.cpn.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;

import net.certware.planning.cpn.services.CpnDslGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class CpnDslParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {
		
	@Inject
	private CpnDslGrammarAccess grammarAccess;
	
	@Override
	protected AbstractToken getRootToken(IEObjectConsumer inst) {
		return new ThisRootNode(inst);	
	}
	
protected class ThisRootNode extends RootToken {
	public ThisRootNode(IEObjectConsumer inst) {
		super(inst);
	}
	
	@Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plans_Group(this, this, 0, inst);
			case 1: return new ArgumentModels_Group(this, this, 1, inst);
			case 2: return new Allocation_Group(this, this, 2, inst);
			case 3: return new Plan_Group(this, this, 3, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule Plans ****************
 *
 * Plans:
 * 	argumentmodels+=ArgumentModels* plans+=Plan*;
 *
 **/

// argumentmodels+=ArgumentModels* plans+=Plan*
protected class Plans_Group extends GroupToken {
	
	public Plans_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPlansAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plans_PlansAssignment_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Plans_ArgumentmodelsAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 2, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getPlansRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// argumentmodels+=ArgumentModels*
protected class Plans_ArgumentmodelsAssignment_0 extends AssignmentToken  {
	
	public Plans_ArgumentmodelsAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPlansAccess().getArgumentmodelsAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ArgumentModels_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("argumentmodels",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("argumentmodels");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getArgumentModelsRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getPlansAccess().getArgumentmodelsArgumentModelsParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Plans_ArgumentmodelsAssignment_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index - 1, consumed);
		}	
	}	
}

// plans+=Plan*
protected class Plans_PlansAssignment_1 extends AssignmentToken  {
	
	public Plans_PlansAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPlansAccess().getPlansAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plan_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("plans",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("plans");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getPlanRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getPlansAccess().getPlansPlanParserRuleCall_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Plans_PlansAssignment_1(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new Plans_ArgumentmodelsAssignment_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index - 2, consumed);
		}	
	}	
}


/************ end Rule Plans ****************/


/************ begin Rule ArgumentModels ****************
 *
 * // any of our CertWare argument models derived from ARM should work here 
 * ArgumentModels:
 * 	"argumentmodel" importURI=STRING;
 *
 **/

// "argumentmodel" importURI=STRING
protected class ArgumentModels_Group extends GroupToken {
	
	public ArgumentModels_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getArgumentModelsAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ArgumentModels_ImportURIAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getArgumentModelsRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "argumentmodel"
protected class ArgumentModels_ArgumentmodelKeyword_0 extends KeywordToken  {
	
	public ArgumentModels_ArgumentmodelKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getArgumentModelsAccess().getArgumentmodelKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// importURI=STRING
protected class ArgumentModels_ImportURIAssignment_1 extends AssignmentToken  {
	
	public ArgumentModels_ImportURIAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getArgumentModelsAccess().getImportURIAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ArgumentModels_ArgumentmodelKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("importURI",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("importURI");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getArgumentModelsAccess().getImportURISTRINGTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getArgumentModelsAccess().getImportURISTRINGTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule ArgumentModels ****************/


/************ begin Rule Allocation ****************
 *
 * Allocation:
 * 	{Allocation} ("cost" cost=INT)? ("duration" duration=INT)? ("team" team=STRING)? ("facility" facility=STRING)?;
 *
 **/

// {Allocation} ("cost" cost=INT)? ("duration" duration=INT)? ("team" team=STRING)? ("facility" facility=STRING)?
protected class Allocation_Group extends GroupToken {
	
	public Allocation_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAllocationAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Allocation_Group_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new Allocation_Group_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new Allocation_Group_1(lastRuleCallOrigin, this, 3, inst);
			case 4: return new Allocation_AllocationAction_0(lastRuleCallOrigin, this, 4, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getAllocationAccess().getAllocationAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {Allocation}
protected class Allocation_AllocationAction_0 extends ActionToken  {

	public Allocation_AllocationAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getAllocationAccess().getAllocationAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// ("cost" cost=INT)?
protected class Allocation_Group_1 extends GroupToken {
	
	public Allocation_Group_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAllocationAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_CostAssignment_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "cost"
protected class Allocation_CostKeyword_1_0 extends KeywordToken  {
	
	public Allocation_CostKeyword_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAllocationAccess().getCostKeyword_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_AllocationAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cost=INT
protected class Allocation_CostAssignment_1_1 extends AssignmentToken  {
	
	public Allocation_CostAssignment_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAllocationAccess().getCostAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_CostKeyword_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cost",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cost");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getAllocationAccess().getCostINTTerminalRuleCall_1_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getAllocationAccess().getCostINTTerminalRuleCall_1_1_0();
			return obj;
		}
		return null;
	}

}


// ("duration" duration=INT)?
protected class Allocation_Group_2 extends GroupToken {
	
	public Allocation_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAllocationAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_DurationAssignment_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "duration"
protected class Allocation_DurationKeyword_2_0 extends KeywordToken  {
	
	public Allocation_DurationKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAllocationAccess().getDurationKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Allocation_AllocationAction_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// duration=INT
protected class Allocation_DurationAssignment_2_1 extends AssignmentToken  {
	
	public Allocation_DurationAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAllocationAccess().getDurationAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_DurationKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("duration",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("duration");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getAllocationAccess().getDurationINTTerminalRuleCall_2_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getAllocationAccess().getDurationINTTerminalRuleCall_2_1_0();
			return obj;
		}
		return null;
	}

}


// ("team" team=STRING)?
protected class Allocation_Group_3 extends GroupToken {
	
	public Allocation_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAllocationAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_TeamAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "team"
protected class Allocation_TeamKeyword_3_0 extends KeywordToken  {
	
	public Allocation_TeamKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAllocationAccess().getTeamKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Allocation_Group_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new Allocation_AllocationAction_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// team=STRING
protected class Allocation_TeamAssignment_3_1 extends AssignmentToken  {
	
	public Allocation_TeamAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAllocationAccess().getTeamAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_TeamKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("team",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("team");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getAllocationAccess().getTeamSTRINGTerminalRuleCall_3_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getAllocationAccess().getTeamSTRINGTerminalRuleCall_3_1_0();
			return obj;
		}
		return null;
	}

}


// ("facility" facility=STRING)?
protected class Allocation_Group_4 extends GroupToken {
	
	public Allocation_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAllocationAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_FacilityAssignment_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "facility"
protected class Allocation_FacilityKeyword_4_0 extends KeywordToken  {
	
	public Allocation_FacilityKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAllocationAccess().getFacilityKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Allocation_Group_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new Allocation_Group_1(lastRuleCallOrigin, this, 2, inst);
			case 3: return new Allocation_AllocationAction_0(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// facility=STRING
protected class Allocation_FacilityAssignment_4_1 extends AssignmentToken  {
	
	public Allocation_FacilityAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAllocationAccess().getFacilityAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_FacilityKeyword_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("facility",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("facility");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getAllocationAccess().getFacilitySTRINGTerminalRuleCall_4_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getAllocationAccess().getFacilitySTRINGTerminalRuleCall_4_1_0();
			return obj;
		}
		return null;
	}

}



/************ end Rule Allocation ****************/


/************ begin Rule Plan ****************
 *
 * Plan:
 * 	"plan" id=STRING "element" element=[sacm::ModelElement] ("estimated" "(" estimated=Allocation ")")? ("actual" "("
 * 	actual=Allocation ")")?;
 *
 **/

// "plan" id=STRING "element" element=[sacm::ModelElement] ("estimated" "(" estimated=Allocation ")")? ("actual" "("
// actual=Allocation ")")?
protected class Plan_Group extends GroupToken {
	
	public Plan_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPlanAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plan_Group_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Plan_Group_4(lastRuleCallOrigin, this, 1, inst);
			case 2: return new Plan_ElementAssignment_3(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getPlanRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "plan"
protected class Plan_PlanKeyword_0 extends KeywordToken  {
	
	public Plan_PlanKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPlanAccess().getPlanKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// id=STRING
protected class Plan_IdAssignment_1 extends AssignmentToken  {
	
	public Plan_IdAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPlanAccess().getIdAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plan_PlanKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("id",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("id");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getPlanAccess().getIdSTRINGTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getPlanAccess().getIdSTRINGTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// "element"
protected class Plan_ElementKeyword_2 extends KeywordToken  {
	
	public Plan_ElementKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPlanAccess().getElementKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plan_IdAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// element=[sacm::ModelElement]
protected class Plan_ElementAssignment_3 extends AssignmentToken  {
	
	public Plan_ElementAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPlanAccess().getElementAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plan_ElementKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getPlanAccess().getElementModelElementCrossReference_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getPlanAccess().getElementModelElementCrossReference_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("estimated" "(" estimated=Allocation ")")?
protected class Plan_Group_4 extends GroupToken {
	
	public Plan_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPlanAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plan_RightParenthesisKeyword_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "estimated"
protected class Plan_EstimatedKeyword_4_0 extends KeywordToken  {
	
	public Plan_EstimatedKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPlanAccess().getEstimatedKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plan_ElementAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "("
protected class Plan_LeftParenthesisKeyword_4_1 extends KeywordToken  {
	
	public Plan_LeftParenthesisKeyword_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPlanAccess().getLeftParenthesisKeyword_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plan_EstimatedKeyword_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// estimated=Allocation
protected class Plan_EstimatedAssignment_4_2 extends AssignmentToken  {
	
	public Plan_EstimatedAssignment_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPlanAccess().getEstimatedAssignment_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("estimated",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("estimated");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAllocationRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getPlanAccess().getEstimatedAllocationParserRuleCall_4_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Plan_LeftParenthesisKeyword_4_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class Plan_RightParenthesisKeyword_4_3 extends KeywordToken  {
	
	public Plan_RightParenthesisKeyword_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPlanAccess().getRightParenthesisKeyword_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plan_EstimatedAssignment_4_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("actual" "(" actual=Allocation ")")?
protected class Plan_Group_5 extends GroupToken {
	
	public Plan_Group_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPlanAccess().getGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plan_RightParenthesisKeyword_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "actual"
protected class Plan_ActualKeyword_5_0 extends KeywordToken  {
	
	public Plan_ActualKeyword_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPlanAccess().getActualKeyword_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plan_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Plan_ElementAssignment_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "("
protected class Plan_LeftParenthesisKeyword_5_1 extends KeywordToken  {
	
	public Plan_LeftParenthesisKeyword_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPlanAccess().getLeftParenthesisKeyword_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plan_ActualKeyword_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// actual=Allocation
protected class Plan_ActualAssignment_5_2 extends AssignmentToken  {
	
	public Plan_ActualAssignment_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPlanAccess().getActualAssignment_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Allocation_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("actual",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("actual");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAllocationRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getPlanAccess().getActualAllocationParserRuleCall_5_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Plan_LeftParenthesisKeyword_5_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class Plan_RightParenthesisKeyword_5_3 extends KeywordToken  {
	
	public Plan_RightParenthesisKeyword_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPlanAccess().getRightParenthesisKeyword_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Plan_ActualAssignment_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



/************ end Rule Plan ****************/

}
