/*
* generated by Xtext
*/
package net.certware.intent.state.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import net.certware.intent.state.services.StateSpecificationGrammarAccess;

public class StateSpecificationParser extends AbstractContentAssistParser {
	
	@Inject
	private StateSpecificationGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected net.certware.intent.state.ui.contentassist.antlr.internal.InternalStateSpecificationParser createParser() {
		net.certware.intent.state.ui.contentassist.antlr.internal.InternalStateSpecificationParser result = new net.certware.intent.state.ui.contentassist.antlr.internal.InternalStateSpecificationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModeElementTypeAccess().getElementTypeAlternatives_0(), "rule__ModeElementType__ElementTypeAlternatives_0");
					put(grammarAccess.getStateValueAccess().getValueAlternatives_0(), "rule__StateValue__ValueAlternatives_0");
					put(grammarAccess.getTriggerAccess().getAlternatives(), "rule__Trigger__Alternatives");
					put(grammarAccess.getSpecificationAccess().getGroup(), "rule__Specification__Group__0");
					put(grammarAccess.getSpecificationAccess().getGroup_2(), "rule__Specification__Group_2__0");
					put(grammarAccess.getBigDecimalTypeAccess().getGroup(), "rule__BigDecimalType__Group__0");
					put(grammarAccess.getBigDecimalTypeAccess().getGroup_2(), "rule__BigDecimalType__Group_2__0");
					put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
					put(grammarAccess.getComponentAccess().getGroup_2(), "rule__Component__Group_2__0");
					put(grammarAccess.getComponentAccess().getGroup_3(), "rule__Component__Group_3__0");
					put(grammarAccess.getComponentAccess().getGroup_4(), "rule__Component__Group_4__0");
					put(grammarAccess.getComponentAccess().getGroup_5(), "rule__Component__Group_5__0");
					put(grammarAccess.getModeElementAccess().getGroup(), "rule__ModeElement__Group__0");
					put(grammarAccess.getStateElementAccess().getGroup(), "rule__StateElement__Group__0");
					put(grammarAccess.getStateVariableAccess().getGroup(), "rule__StateVariable__Group__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getModeVariableAccess().getGroup(), "rule__ModeVariable__Group__0");
					put(grammarAccess.getModeAccess().getGroup(), "rule__Mode__Group__0");
					put(grammarAccess.getDeviceAccess().getGroup(), "rule__Device__Group__0");
					put(grammarAccess.getDeviceAccess().getGroup_3(), "rule__Device__Group_3__0");
					put(grammarAccess.getDeviceAccess().getGroup_4(), "rule__Device__Group_4__0");
					put(grammarAccess.getDeviceInputAccess().getGroup(), "rule__DeviceInput__Group__0");
					put(grammarAccess.getDeviceInputAccess().getGroup_2(), "rule__DeviceInput__Group_2__0");
					put(grammarAccess.getDeviceOutputAccess().getGroup(), "rule__DeviceOutput__Group__0");
					put(grammarAccess.getDeviceOutputAccess().getGroup_2(), "rule__DeviceOutput__Group_2__0");
					put(grammarAccess.getComponentInputAccess().getGroup(), "rule__ComponentInput__Group__0");
					put(grammarAccess.getComponentInputAccess().getGroup_2(), "rule__ComponentInput__Group_2__0");
					put(grammarAccess.getComponentOutputAccess().getGroup(), "rule__ComponentOutput__Group__0");
					put(grammarAccess.getComponentOutputAccess().getGroup_2(), "rule__ComponentOutput__Group_2__0");
					put(grammarAccess.getBigUnitValueAccess().getGroup(), "rule__BigUnitValue__Group__0");
					put(grammarAccess.getStateListAccess().getGroup(), "rule__StateList__Group__0");
					put(grammarAccess.getTriggerAccess().getGroup_0(), "rule__Trigger__Group_0__0");
					put(grammarAccess.getTriggerAccess().getGroup_1(), "rule__Trigger__Group_1__0");
					put(grammarAccess.getTriggerTableAccess().getGroup(), "rule__TriggerTable__Group__0");
					put(grammarAccess.getValueRangeAccess().getGroup(), "rule__ValueRange__Group__0");
					put(grammarAccess.getValueListAccess().getGroup(), "rule__ValueList__Group__0");
					put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
					put(grammarAccess.getOutputAccess().getGroup_1(), "rule__Output__Group_1__0");
					put(grammarAccess.getOutputAccess().getGroup_2(), "rule__Output__Group_2__0");
					put(grammarAccess.getOutputAccess().getGroup_3(), "rule__Output__Group_3__0");
					put(grammarAccess.getOutputAccess().getGroup_4(), "rule__Output__Group_4__0");
					put(grammarAccess.getOutputAccess().getGroup_5(), "rule__Output__Group_5__0");
					put(grammarAccess.getOutputAccess().getGroup_6(), "rule__Output__Group_6__0");
					put(grammarAccess.getOutputAccess().getGroup_7(), "rule__Output__Group_7__0");
					put(grammarAccess.getOutputAccess().getGroup_8(), "rule__Output__Group_8__0");
					put(grammarAccess.getOutputAccess().getGroup_9(), "rule__Output__Group_9__0");
					put(grammarAccess.getOutputAccess().getGroup_10(), "rule__Output__Group_10__0");
					put(grammarAccess.getOutputAccess().getGroup_11(), "rule__Output__Group_11__0");
					put(grammarAccess.getOutputAccess().getGroup_12(), "rule__Output__Group_12__0");
					put(grammarAccess.getOutputAccess().getGroup_13(), "rule__Output__Group_13__0");
					put(grammarAccess.getOutputAccess().getGroup_14(), "rule__Output__Group_14__0");
					put(grammarAccess.getOutputAccess().getGroup_15(), "rule__Output__Group_15__0");
					put(grammarAccess.getOutputAccess().getGroup_16(), "rule__Output__Group_16__0");
					put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
					put(grammarAccess.getInputAccess().getGroup_1(), "rule__Input__Group_1__0");
					put(grammarAccess.getInputAccess().getGroup_2(), "rule__Input__Group_2__0");
					put(grammarAccess.getInputAccess().getGroup_3(), "rule__Input__Group_3__0");
					put(grammarAccess.getInputAccess().getGroup_4(), "rule__Input__Group_4__0");
					put(grammarAccess.getInputAccess().getGroup_5(), "rule__Input__Group_5__0");
					put(grammarAccess.getInputAccess().getGroup_6(), "rule__Input__Group_6__0");
					put(grammarAccess.getInputAccess().getGroup_7(), "rule__Input__Group_7__0");
					put(grammarAccess.getInputAccess().getGroup_8(), "rule__Input__Group_8__0");
					put(grammarAccess.getInputAccess().getGroup_9(), "rule__Input__Group_9__0");
					put(grammarAccess.getInputAccess().getGroup_10(), "rule__Input__Group_10__0");
					put(grammarAccess.getInputAccess().getGroup_11(), "rule__Input__Group_11__0");
					put(grammarAccess.getInputAccess().getGroup_12(), "rule__Input__Group_12__0");
					put(grammarAccess.getInputAccess().getGroup_13(), "rule__Input__Group_13__0");
					put(grammarAccess.getSpecificationAccess().getNameAssignment_1(), "rule__Specification__NameAssignment_1");
					put(grammarAccess.getSpecificationAccess().getDevicesAssignment_2_2(), "rule__Specification__DevicesAssignment_2_2");
					put(grammarAccess.getSpecificationAccess().getComponentsAssignment_3(), "rule__Specification__ComponentsAssignment_3");
					put(grammarAccess.getModeElementTypeAccess().getElementTypeAssignment(), "rule__ModeElementType__ElementTypeAssignment");
					put(grammarAccess.getComponentAccess().getNameAssignment_1(), "rule__Component__NameAssignment_1");
					put(grammarAccess.getComponentAccess().getModesAssignment_2_1(), "rule__Component__ModesAssignment_2_1");
					put(grammarAccess.getComponentAccess().getStatesAssignment_3_1(), "rule__Component__StatesAssignment_3_1");
					put(grammarAccess.getComponentAccess().getInputsAssignment_4_1(), "rule__Component__InputsAssignment_4_1");
					put(grammarAccess.getComponentAccess().getOutputsAssignment_5_1(), "rule__Component__OutputsAssignment_5_1");
					put(grammarAccess.getModeElementAccess().getInferredAssignment_0(), "rule__ModeElement__InferredAssignment_0");
					put(grammarAccess.getModeElementAccess().getTypeAssignment_1(), "rule__ModeElement__TypeAssignment_1");
					put(grammarAccess.getModeElementAccess().getModesAssignment_2(), "rule__ModeElement__ModesAssignment_2");
					put(grammarAccess.getStateElementAccess().getInferredAssignment_0(), "rule__StateElement__InferredAssignment_0");
					put(grammarAccess.getStateElementAccess().getStatesAssignment_1(), "rule__StateElement__StatesAssignment_1");
					put(grammarAccess.getStateVariableAccess().getDescAssignment_1(), "rule__StateVariable__DescAssignment_1");
					put(grammarAccess.getStateVariableAccess().getStateAssignment_3(), "rule__StateVariable__StateAssignment_3");
					put(grammarAccess.getStateAccess().getInitialAssignment_0(), "rule__State__InitialAssignment_0");
					put(grammarAccess.getStateAccess().getValueAssignment_1(), "rule__State__ValueAssignment_1");
					put(grammarAccess.getModeVariableAccess().getDescAssignment_1(), "rule__ModeVariable__DescAssignment_1");
					put(grammarAccess.getModeVariableAccess().getModesAssignment_3(), "rule__ModeVariable__ModesAssignment_3");
					put(grammarAccess.getModeAccess().getInitialAssignment_0(), "rule__Mode__InitialAssignment_0");
					put(grammarAccess.getModeAccess().getValueAssignment_1(), "rule__Mode__ValueAssignment_1");
					put(grammarAccess.getDeviceAccess().getNameAssignment_1(), "rule__Device__NameAssignment_1");
					put(grammarAccess.getDeviceAccess().getDescAssignment_2(), "rule__Device__DescAssignment_2");
					put(grammarAccess.getDeviceAccess().getInputsAssignment_3_1(), "rule__Device__InputsAssignment_3_1");
					put(grammarAccess.getDeviceAccess().getOutputsAssignment_4_1(), "rule__Device__OutputsAssignment_4_1");
					put(grammarAccess.getDeviceInputAccess().getNameAssignment_1(), "rule__DeviceInput__NameAssignment_1");
					put(grammarAccess.getDeviceInputAccess().getIoAssignment_2_1(), "rule__DeviceInput__IoAssignment_2_1");
					put(grammarAccess.getDeviceInputAccess().getSourceAssignment_4(), "rule__DeviceInput__SourceAssignment_4");
					put(grammarAccess.getDeviceOutputAccess().getNameAssignment_1(), "rule__DeviceOutput__NameAssignment_1");
					put(grammarAccess.getDeviceOutputAccess().getIoAssignment_2_1(), "rule__DeviceOutput__IoAssignment_2_1");
					put(grammarAccess.getDeviceOutputAccess().getTargetAssignment_4(), "rule__DeviceOutput__TargetAssignment_4");
					put(grammarAccess.getComponentInputAccess().getNameAssignment_1(), "rule__ComponentInput__NameAssignment_1");
					put(grammarAccess.getComponentInputAccess().getIoAssignment_2_1(), "rule__ComponentInput__IoAssignment_2_1");
					put(grammarAccess.getComponentInputAccess().getSourceAssignment_4(), "rule__ComponentInput__SourceAssignment_4");
					put(grammarAccess.getComponentOutputAccess().getNameAssignment_1(), "rule__ComponentOutput__NameAssignment_1");
					put(grammarAccess.getComponentOutputAccess().getIoAssignment_2_1(), "rule__ComponentOutput__IoAssignment_2_1");
					put(grammarAccess.getComponentOutputAccess().getTargetAssignment_4(), "rule__ComponentOutput__TargetAssignment_4");
					put(grammarAccess.getBigUnitValueAccess().getValueAssignment_0(), "rule__BigUnitValue__ValueAssignment_0");
					put(grammarAccess.getBigUnitValueAccess().getUnitsAssignment_2(), "rule__BigUnitValue__UnitsAssignment_2");
					put(grammarAccess.getStateValueAccess().getValueAssignment(), "rule__StateValue__ValueAssignment");
					put(grammarAccess.getStateListAccess().getStateListAssignment_1(), "rule__StateList__StateListAssignment_1");
					put(grammarAccess.getTriggerAccess().getModeAssignment_0_1(), "rule__Trigger__ModeAssignment_0_1");
					put(grammarAccess.getTriggerAccess().getListAssignment_0_2(), "rule__Trigger__ListAssignment_0_2");
					put(grammarAccess.getTriggerAccess().getVariableAssignment_1_1(), "rule__Trigger__VariableAssignment_1_1");
					put(grammarAccess.getTriggerAccess().getValueAssignment_1_2(), "rule__Trigger__ValueAssignment_1_2");
					put(grammarAccess.getTriggerAccess().getListAssignment_1_3(), "rule__Trigger__ListAssignment_1_3");
					put(grammarAccess.getTriggerTableAccess().getRowsAssignment_2(), "rule__TriggerTable__RowsAssignment_2");
					put(grammarAccess.getValueRangeAccess().getLowerAssignment_1(), "rule__ValueRange__LowerAssignment_1");
					put(grammarAccess.getValueRangeAccess().getUpperAssignment_3(), "rule__ValueRange__UpperAssignment_3");
					put(grammarAccess.getValueRangeAccess().getRangeTypeAssignment_6(), "rule__ValueRange__RangeTypeAssignment_6");
					put(grammarAccess.getValueRangeAccess().getRangeUnitsAssignment_8(), "rule__ValueRange__RangeUnitsAssignment_8");
					put(grammarAccess.getValueListAccess().getValuesAssignment_1(), "rule__ValueList__ValuesAssignment_1");
					put(grammarAccess.getOutputAccess().getRangeAssignment_1_1(), "rule__Output__RangeAssignment_1_1");
					put(grammarAccess.getOutputAccess().getValueListAssignment_2_1(), "rule__Output__ValueListAssignment_2_1");
					put(grammarAccess.getOutputAccess().getRateAssignment_3_1(), "rule__Output__RateAssignment_3_1");
					put(grammarAccess.getOutputAccess().getDelayAssignment_4_1(), "rule__Output__DelayAssignment_4_1");
					put(grammarAccess.getOutputAccess().getDeadlineAssignment_5_1(), "rule__Output__DeadlineAssignment_5_1");
					put(grammarAccess.getOutputAccess().getCompletionHandlingAssignment_6_1(), "rule__Output__CompletionHandlingAssignment_6_1");
					put(grammarAccess.getOutputAccess().getVariablesAssignment_7_1(), "rule__Output__VariablesAssignment_7_1");
					put(grammarAccess.getOutputAccess().getRelationshipAssignment_8_1(), "rule__Output__RelationshipAssignment_8_1");
					put(grammarAccess.getOutputAccess().getMinResponseAssignment_9_1(), "rule__Output__MinResponseAssignment_9_1");
					put(grammarAccess.getOutputAccess().getMaxResponseAssignment_10_1(), "rule__Output__MaxResponseAssignment_10_1");
					put(grammarAccess.getOutputAccess().getFeebackHandlingAssignment_11_1(), "rule__Output__FeebackHandlingAssignment_11_1");
					put(grammarAccess.getOutputAccess().getReversedAssignment_12_1(), "rule__Output__ReversedAssignment_12_1");
					put(grammarAccess.getOutputAccess().getReferencesAssignment_13_1(), "rule__Output__ReferencesAssignment_13_1");
					put(grammarAccess.getOutputAccess().getCommentsAssignment_14_1(), "rule__Output__CommentsAssignment_14_1");
					put(grammarAccess.getOutputAccess().getContentsAssignment_15_1(), "rule__Output__ContentsAssignment_15_1");
					put(grammarAccess.getOutputAccess().getTableAssignment_16_1(), "rule__Output__TableAssignment_16_1");
					put(grammarAccess.getInputAccess().getRangeAssignment_1_1(), "rule__Input__RangeAssignment_1_1");
					put(grammarAccess.getInputAccess().getValueListAssignment_2_1(), "rule__Input__ValueListAssignment_2_1");
					put(grammarAccess.getInputAccess().getValueHandlingAssignment_3_1(), "rule__Input__ValueHandlingAssignment_3_1");
					put(grammarAccess.getInputAccess().getGranularityAssignment_4_1(), "rule__Input__GranularityAssignment_4_1");
					put(grammarAccess.getInputAccess().getArrivalRateAvgAssignment_5_1(), "rule__Input__ArrivalRateAvgAssignment_5_1");
					put(grammarAccess.getInputAccess().getArrivalRateMinimumAssignment_6_1(), "rule__Input__ArrivalRateMinimumAssignment_6_1");
					put(grammarAccess.getInputAccess().getArrivalRateMaximumAssignment_7_1(), "rule__Input__ArrivalRateMaximumAssignment_7_1");
					put(grammarAccess.getInputAccess().getObsolescenceAssignment_8_1(), "rule__Input__ObsolescenceAssignment_8_1");
					put(grammarAccess.getInputAccess().getReferencesAssignment_9_1(), "rule__Input__ReferencesAssignment_9_1");
					put(grammarAccess.getInputAccess().getAppearsInAssignment_10_1(), "rule__Input__AppearsInAssignment_10_1");
					put(grammarAccess.getInputAccess().getDescriptionAssignment_11_1(), "rule__Input__DescriptionAssignment_11_1");
					put(grammarAccess.getInputAccess().getCommentsAssignment_12_1(), "rule__Input__CommentsAssignment_12_1");
					put(grammarAccess.getInputAccess().getStructureAssignment_13_1(), "rule__Input__StructureAssignment_13_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			net.certware.intent.state.ui.contentassist.antlr.internal.InternalStateSpecificationParser typedParser = (net.certware.intent.state.ui.contentassist.antlr.internal.InternalStateSpecificationParser) parser;
			typedParser.entryRuleSpecification();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public StateSpecificationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(StateSpecificationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
