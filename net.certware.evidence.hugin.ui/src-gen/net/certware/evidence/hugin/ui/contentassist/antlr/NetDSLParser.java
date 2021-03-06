/*
* generated by Xtext
*/
package net.certware.evidence.hugin.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import net.certware.evidence.hugin.services.NetDSLGrammarAccess;

public class NetDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private NetDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected net.certware.evidence.hugin.ui.contentassist.antlr.internal.InternalNetDSLParser createParser() {
		net.certware.evidence.hugin.ui.contentassist.antlr.internal.InternalNetDSLParser result = new net.certware.evidence.hugin.ui.contentassist.antlr.internal.InternalNetDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDomainElementAccess().getAlternatives(), "rule__DomainElement__Alternatives");
					put(grammarAccess.getAttributeAccess().getAlternatives(), "rule__Attribute__Alternatives");
					put(grammarAccess.getBasicNodeKeywordAccess().getAlternatives(), "rule__BasicNodeKeyword__Alternatives");
					put(grammarAccess.getBasicNodeKeywordAccess().getAlternatives_0_0(), "rule__BasicNodeKeyword__Alternatives_0_0");
					put(grammarAccess.getSubtypeAttributeAccess().getSubtypeAlternatives_2_0(), "rule__SubtypeAttribute__SubtypeAlternatives_2_0");
					put(grammarAccess.getPotentialAttributeAccess().getAlternatives(), "rule__PotentialAttribute__Alternatives");
					put(grammarAccess.getMatrixRowAccess().getAlternatives(), "rule__MatrixRow__Alternatives");
					put(grammarAccess.getMeanTermAccess().getAlternatives(), "rule__MeanTerm__Alternatives");
					put(grammarAccess.getClassElementAccess().getAlternatives(), "rule__ClassElement__Alternatives");
					put(grammarAccess.getNodeAttributesAccess().getAlternatives(), "rule__NodeAttributes__Alternatives");
					put(grammarAccess.getAssignOpAccess().getAlternatives(), "rule__AssignOp__Alternatives");
					put(grammarAccess.getRelOpsAccess().getAlternatives(), "rule__RelOps__Alternatives");
					put(grammarAccess.getArithOpsAccess().getAlternatives(), "rule__ArithOps__Alternatives");
					put(grammarAccess.getMultOpsAccess().getAlternatives(), "rule__MultOps__Alternatives");
					put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
					put(grammarAccess.getUnaryOpsAccess().getAlternatives(), "rule__UnaryOps__Alternatives");
					put(grammarAccess.getTermExpressionAccess().getAlternatives(), "rule__TermExpression__Alternatives");
					put(grammarAccess.getTermLiteralAccess().getAlternatives(), "rule__TermLiteral__Alternatives");
					put(grammarAccess.getOperatorNameAccess().getAlternatives(), "rule__OperatorName__Alternatives");
					put(grammarAccess.getDomainDefinitionAccess().getGroup(), "rule__DomainDefinition__Group__0");
					put(grammarAccess.getDomainHeaderAccess().getGroup(), "rule__DomainHeader__Group__0");
					put(grammarAccess.getBasicNodeAccess().getGroup(), "rule__BasicNode__Group__0");
					put(grammarAccess.getBasicNodeKeywordAccess().getGroup_0(), "rule__BasicNodeKeyword__Group_0__0");
					put(grammarAccess.getStatesAttributeAccess().getGroup(), "rule__StatesAttribute__Group__0");
					put(grammarAccess.getLabelAttributeAccess().getGroup(), "rule__LabelAttribute__Group__0");
					put(grammarAccess.getPositionAttributeAccess().getGroup(), "rule__PositionAttribute__Group__0");
					put(grammarAccess.getSubtypeAttributeAccess().getGroup(), "rule__SubtypeAttribute__Group__0");
					put(grammarAccess.getStateValuesAttributeAccess().getGroup(), "rule__StateValuesAttribute__Group__0");
					put(grammarAccess.getApplicationAttributeAccess().getGroup(), "rule__ApplicationAttribute__Group__0");
					put(grammarAccess.getNodeSizeAttributeAccess().getGroup(), "rule__NodeSizeAttribute__Group__0");
					put(grammarAccess.getPotentialAccess().getGroup(), "rule__Potential__Group__0");
					put(grammarAccess.getPotentialGraphAccess().getGroup(), "rule__PotentialGraph__Group__0");
					put(grammarAccess.getPotentialGraphAccess().getGroup_3(), "rule__PotentialGraph__Group_3__0");
					put(grammarAccess.getPotentialModelAccess().getGroup(), "rule__PotentialModel__Group__0");
					put(grammarAccess.getPotentialDataAttributeAccess().getGroup(), "rule__PotentialDataAttribute__Group__0");
					put(grammarAccess.getMatrixRowAccess().getGroup_0(), "rule__MatrixRow__Group_0__0");
					put(grammarAccess.getMatrixRowAccess().getGroup_1(), "rule__MatrixRow__Group_1__0");
					put(grammarAccess.getMatrixRowAccess().getGroup_2(), "rule__MatrixRow__Group_2__0");
					put(grammarAccess.getMatrixRowAccess().getGroup_3(), "rule__MatrixRow__Group_3__0");
					put(grammarAccess.getMatrixRowAccess().getGroup_4(), "rule__MatrixRow__Group_4__0");
					put(grammarAccess.getList5Access().getGroup(), "rule__List5__Group__0");
					put(grammarAccess.getList4Access().getGroup(), "rule__List4__Group__0");
					put(grammarAccess.getList3Access().getGroup(), "rule__List3__Group__0");
					put(grammarAccess.getList2Access().getGroup(), "rule__List2__Group__0");
					put(grammarAccess.getList1Access().getGroup(), "rule__List1__Group__0");
					put(grammarAccess.getMeanExpressionAccess().getGroup(), "rule__MeanExpression__Group__0");
					put(grammarAccess.getMeanExpressionAccess().getGroup_1(), "rule__MeanExpression__Group_1__0");
					put(grammarAccess.getMeanTermAccess().getGroup_1(), "rule__MeanTerm__Group_1__0");
					put(grammarAccess.getPotentialTableAttributeAccess().getGroup(), "rule__PotentialTableAttribute__Group__0");
					put(grammarAccess.getModelNodesAttributeAccess().getGroup(), "rule__ModelNodesAttribute__Group__0");
					put(grammarAccess.getSamplesAttributeAccess().getGroup(), "rule__SamplesAttribute__Group__0");
					put(grammarAccess.getModelDataAttributeAccess().getGroup(), "rule__ModelDataAttribute__Group__0");
					put(grammarAccess.getClassDefinitionAccess().getGroup(), "rule__ClassDefinition__Group__0");
					put(grammarAccess.getClassInstanceAccess().getGroup(), "rule__ClassInstance__Group__0");
					put(grammarAccess.getClassInstanceAccess().getGroup_6(), "rule__ClassInstance__Group_6__0");
					put(grammarAccess.getInputBindingsAccess().getGroup(), "rule__InputBindings__Group__0");
					put(grammarAccess.getInputBindingAccess().getGroup(), "rule__InputBinding__Group__0");
					put(grammarAccess.getOutputBindingsAccess().getGroup(), "rule__OutputBindings__Group__0");
					put(grammarAccess.getOutputBindingAccess().getGroup(), "rule__OutputBinding__Group__0");
					put(grammarAccess.getExpressionSequenceAccess().getGroup(), "rule__ExpressionSequence__Group__0");
					put(grammarAccess.getExpressionSequenceAccess().getGroup_1(), "rule__ExpressionSequence__Group_1__0");
					put(grammarAccess.getExpressionSequenceAccess().getGroup_1_1(), "rule__ExpressionSequence__Group_1_1__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getAssignmentOpExpressionAccess().getGroup(), "rule__AssignmentOpExpression__Group__0");
					put(grammarAccess.getAssignmentOpExpressionAccess().getGroup_1(), "rule__AssignmentOpExpression__Group_1__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1(), "rule__RelationalExpression__Group_1__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup_1(), "rule__UnaryExpression__Group_1__0");
					put(grammarAccess.getOperatorAccess().getGroup(), "rule__Operator__Group__0");
					put(grammarAccess.getTermLiteralAccess().getGroup_0(), "rule__TermLiteral__Group_0__0");
					put(grammarAccess.getTermLiteralAccess().getGroup_1(), "rule__TermLiteral__Group_1__0");
					put(grammarAccess.getTermLiteralAccess().getGroup_2(), "rule__TermLiteral__Group_2__0");
					put(grammarAccess.getTermLiteralAccess().getGroup_3(), "rule__TermLiteral__Group_3__0");
					put(grammarAccess.getTermLiteralAccess().getGroup_4(), "rule__TermLiteral__Group_4__0");
					put(grammarAccess.getModelAccess().getDomainAssignment(), "rule__Model__DomainAssignment");
					put(grammarAccess.getIntegerAccess().getIAssignment(), "rule__Integer__IAssignment");
					put(grammarAccess.getDomainDefinitionAccess().getHeaderAssignment_0(), "rule__DomainDefinition__HeaderAssignment_0");
					put(grammarAccess.getDomainDefinitionAccess().getElementsAssignment_1(), "rule__DomainDefinition__ElementsAssignment_1");
					put(grammarAccess.getDomainHeaderAccess().getAttributesAssignment_3(), "rule__DomainHeader__AttributesAssignment_3");
					put(grammarAccess.getBasicNodeAccess().getKeywordAssignment_0(), "rule__BasicNode__KeywordAssignment_0");
					put(grammarAccess.getBasicNodeAccess().getIdAssignment_1(), "rule__BasicNode__IdAssignment_1");
					put(grammarAccess.getBasicNodeAccess().getAttributesAssignment_3(), "rule__BasicNode__AttributesAssignment_3");
					put(grammarAccess.getStatesAttributeAccess().getStatesAssignment_4(), "rule__StatesAttribute__StatesAssignment_4");
					put(grammarAccess.getLabelAttributeAccess().getValueAssignment_2(), "rule__LabelAttribute__ValueAssignment_2");
					put(grammarAccess.getPositionAttributeAccess().getXAssignment_4(), "rule__PositionAttribute__XAssignment_4");
					put(grammarAccess.getPositionAttributeAccess().getYAssignment_5(), "rule__PositionAttribute__YAssignment_5");
					put(grammarAccess.getSubtypeAttributeAccess().getSubtypeAssignment_2(), "rule__SubtypeAttribute__SubtypeAssignment_2");
					put(grammarAccess.getStateValuesAttributeAccess().getNumbersAssignment_3(), "rule__StateValuesAttribute__NumbersAssignment_3");
					put(grammarAccess.getApplicationAttributeAccess().getKeyAssignment_0(), "rule__ApplicationAttribute__KeyAssignment_0");
					put(grammarAccess.getApplicationAttributeAccess().getValueAssignment_2(), "rule__ApplicationAttribute__ValueAssignment_2");
					put(grammarAccess.getNodeSizeAttributeAccess().getWidthAssignment_3(), "rule__NodeSizeAttribute__WidthAssignment_3");
					put(grammarAccess.getNodeSizeAttributeAccess().getHeightAssignment_4(), "rule__NodeSizeAttribute__HeightAssignment_4");
					put(grammarAccess.getPotentialAccess().getGraphAssignment_1(), "rule__Potential__GraphAssignment_1");
					put(grammarAccess.getPotentialAccess().getModelAssignment_2(), "rule__Potential__ModelAssignment_2");
					put(grammarAccess.getPotentialGraphAccess().getChildrenAssignment_2(), "rule__PotentialGraph__ChildrenAssignment_2");
					put(grammarAccess.getPotentialGraphAccess().getParentsAssignment_3_1(), "rule__PotentialGraph__ParentsAssignment_3_1");
					put(grammarAccess.getPotentialModelAccess().getAttributesAssignment_2(), "rule__PotentialModel__AttributesAssignment_2");
					put(grammarAccess.getPotentialDataAttributeAccess().getDataAssignment_3(), "rule__PotentialDataAttribute__DataAssignment_3");
					put(grammarAccess.getMatrixRowAccess().getR5Assignment_0_1(), "rule__MatrixRow__R5Assignment_0_1");
					put(grammarAccess.getMatrixRowAccess().getR4Assignment_1_1(), "rule__MatrixRow__R4Assignment_1_1");
					put(grammarAccess.getMatrixRowAccess().getR3Assignment_2_1(), "rule__MatrixRow__R3Assignment_2_1");
					put(grammarAccess.getMatrixRowAccess().getR2Assignment_3_1(), "rule__MatrixRow__R2Assignment_3_1");
					put(grammarAccess.getMatrixRowAccess().getR1Assignment_4_1(), "rule__MatrixRow__R1Assignment_4_1");
					put(grammarAccess.getList5Access().getListAssignment_2(), "rule__List5__ListAssignment_2");
					put(grammarAccess.getList4Access().getListAssignment_2(), "rule__List4__ListAssignment_2");
					put(grammarAccess.getList3Access().getListAssignment_2(), "rule__List3__ListAssignment_2");
					put(grammarAccess.getList2Access().getListAssignment_2(), "rule__List2__ListAssignment_2");
					put(grammarAccess.getList1Access().getItemsAssignment_2(), "rule__List1__ItemsAssignment_2");
					put(grammarAccess.getPotentialTableAttributeAccess().getNodesAssignment_0(), "rule__PotentialTableAttribute__NodesAssignment_0");
					put(grammarAccess.getPotentialTableAttributeAccess().getSamplesAssignment_1(), "rule__PotentialTableAttribute__SamplesAssignment_1");
					put(grammarAccess.getPotentialTableAttributeAccess().getDataAssignment_2(), "rule__PotentialTableAttribute__DataAssignment_2");
					put(grammarAccess.getModelNodesAttributeAccess().getConfigurationsAssignment_4(), "rule__ModelNodesAttribute__ConfigurationsAssignment_4");
					put(grammarAccess.getSamplesAttributeAccess().getValueAssignment_2(), "rule__SamplesAttribute__ValueAssignment_2");
					put(grammarAccess.getModelDataAttributeAccess().getSequenceAssignment_4(), "rule__ModelDataAttribute__SequenceAssignment_4");
					put(grammarAccess.getClassDefinitionAccess().getNameAssignment_1(), "rule__ClassDefinition__NameAssignment_1");
					put(grammarAccess.getClassDefinitionAccess().getElementsAssignment_3(), "rule__ClassDefinition__ElementsAssignment_3");
					put(grammarAccess.getClassInstanceAccess().getInstanceNameAssignment_1(), "rule__ClassInstance__InstanceNameAssignment_1");
					put(grammarAccess.getClassInstanceAccess().getClassNameAssignment_3(), "rule__ClassInstance__ClassNameAssignment_3");
					put(grammarAccess.getClassInstanceAccess().getInputAssignment_5(), "rule__ClassInstance__InputAssignment_5");
					put(grammarAccess.getClassInstanceAccess().getOutputAssignment_6_1(), "rule__ClassInstance__OutputAssignment_6_1");
					put(grammarAccess.getClassInstanceAccess().getAttributesAssignment_9(), "rule__ClassInstance__AttributesAssignment_9");
					put(grammarAccess.getInputBindingsAccess().getLhsAssignment_0(), "rule__InputBindings__LhsAssignment_0");
					put(grammarAccess.getInputBindingsAccess().getRhsAssignment_2(), "rule__InputBindings__RhsAssignment_2");
					put(grammarAccess.getInputBindingAccess().getFormalAssignment_0(), "rule__InputBinding__FormalAssignment_0");
					put(grammarAccess.getInputBindingAccess().getActualAssignment_2(), "rule__InputBinding__ActualAssignment_2");
					put(grammarAccess.getOutputBindingsAccess().getLhsAssignment_0(), "rule__OutputBindings__LhsAssignment_0");
					put(grammarAccess.getOutputBindingsAccess().getRhsAssignment_2(), "rule__OutputBindings__RhsAssignment_2");
					put(grammarAccess.getOutputBindingAccess().getActualAssignment_0(), "rule__OutputBinding__ActualAssignment_0");
					put(grammarAccess.getOutputBindingAccess().getFormalAssignment_2(), "rule__OutputBinding__FormalAssignment_2");
					put(grammarAccess.getExpressionSequenceAccess().getExpressionsAssignment_1_0(), "rule__ExpressionSequence__ExpressionsAssignment_1_0");
					put(grammarAccess.getExpressionSequenceAccess().getExpressionsAssignment_1_1_1(), "rule__ExpressionSequence__ExpressionsAssignment_1_1_1");
					put(grammarAccess.getExpressionAccess().getOpAssignment_1_1(), "rule__Expression__OpAssignment_1_1");
					put(grammarAccess.getExpressionAccess().getRightAssignment_1_2(), "rule__Expression__RightAssignment_1_2");
					put(grammarAccess.getAssignmentOpExpressionAccess().getOpAssignment_1_1(), "rule__AssignmentOpExpression__OpAssignment_1_1");
					put(grammarAccess.getAssignmentOpExpressionAccess().getRightAssignment_1_2(), "rule__AssignmentOpExpression__RightAssignment_1_2");
					put(grammarAccess.getOrExpressionAccess().getOpAssignment_1_1(), "rule__OrExpression__OpAssignment_1_1");
					put(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2(), "rule__OrExpression__RightAssignment_1_2");
					put(grammarAccess.getAndExpressionAccess().getOpAssignment_1_1(), "rule__AndExpression__OpAssignment_1_1");
					put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2(), "rule__AndExpression__RightAssignment_1_2");
					put(grammarAccess.getRelationalExpressionAccess().getOpAssignment_1_1(), "rule__RelationalExpression__OpAssignment_1_1");
					put(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1_2(), "rule__RelationalExpression__RightAssignment_1_2");
					put(grammarAccess.getAdditiveExpressionAccess().getOpAssignment_1_1(), "rule__AdditiveExpression__OpAssignment_1_1");
					put(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_2(), "rule__AdditiveExpression__RightAssignment_1_2");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_1(), "rule__MultiplicativeExpression__OpAssignment_1_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_2(), "rule__MultiplicativeExpression__RightAssignment_1_2");
					put(grammarAccess.getUnaryExpressionAccess().getOpAssignment_1_0(), "rule__UnaryExpression__OpAssignment_1_0");
					put(grammarAccess.getUnaryExpressionAccess().getExprAssignment_1_1(), "rule__UnaryExpression__ExprAssignment_1_1");
					put(grammarAccess.getOperatorAccess().getOpAssignment_0(), "rule__Operator__OpAssignment_0");
					put(grammarAccess.getOperatorAccess().getSequenceAssignment_2(), "rule__Operator__SequenceAssignment_2");
					put(grammarAccess.getTermLiteralAccess().getValueAssignment_0_1(), "rule__TermLiteral__ValueAssignment_0_1");
					put(grammarAccess.getTermLiteralAccess().getValueAssignment_1_1(), "rule__TermLiteral__ValueAssignment_1_1");
					put(grammarAccess.getTermLiteralAccess().getValueAssignment_2_1(), "rule__TermLiteral__ValueAssignment_2_1");
					put(grammarAccess.getTermLiteralAccess().getValueAssignment_3_1(), "rule__TermLiteral__ValueAssignment_3_1");
					put(grammarAccess.getTermLiteralAccess().getValueAssignment_4_1(), "rule__TermLiteral__ValueAssignment_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			net.certware.evidence.hugin.ui.contentassist.antlr.internal.InternalNetDSLParser typedParser = (net.certware.evidence.hugin.ui.contentassist.antlr.internal.InternalNetDSLParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public NetDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(NetDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
