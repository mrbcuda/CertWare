/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.ConsistencyLevel;
import net.certware.sacm.SACM.Evidence.ContainerConsistency;
import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Consistency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ContainerConsistencyImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerConsistencyImpl extends ProjectPropertyImpl implements ContainerConsistency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final ConsistencyLevel VALUE_EDEFAULT = ConsistencyLevel.UNKNOWN;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ConsistencyLevel value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerConsistencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.CONTAINER_CONSISTENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsistencyLevel getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ConsistencyLevel newValue) {
		ConsistencyLevel oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.CONTAINER_CONSISTENCY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.CONTAINER_CONSISTENCY__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.CONTAINER_CONSISTENCY__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.CONTAINER_CONSISTENCY__ID:
				return getId();
			case EvidencePackage.CONTAINER_CONSISTENCY__TIMING:
				return getTiming();
			case EvidencePackage.CONTAINER_CONSISTENCY__CUSTODY:
				return getCustody();
			case EvidencePackage.CONTAINER_CONSISTENCY__PROVENANCE:
				return getProvenance();
			case EvidencePackage.CONTAINER_CONSISTENCY__EVENT:
				return getEvent();
			case EvidencePackage.CONTAINER_CONSISTENCY__VALUE:
				return getValue();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvidencePackage.CONTAINER_CONSISTENCY__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.CONTAINER_CONSISTENCY__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.CONTAINER_CONSISTENCY__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.CONTAINER_CONSISTENCY__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.CONTAINER_CONSISTENCY__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.CONTAINER_CONSISTENCY__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.CONTAINER_CONSISTENCY__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.CONTAINER_CONSISTENCY__VALUE:
				setValue((ConsistencyLevel)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EvidencePackage.CONTAINER_CONSISTENCY__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.CONTAINER_CONSISTENCY__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.CONTAINER_CONSISTENCY__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.CONTAINER_CONSISTENCY__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.CONTAINER_CONSISTENCY__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.CONTAINER_CONSISTENCY__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.CONTAINER_CONSISTENCY__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.CONTAINER_CONSISTENCY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EvidencePackage.CONTAINER_CONSISTENCY__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.CONTAINER_CONSISTENCY__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.CONTAINER_CONSISTENCY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.CONTAINER_CONSISTENCY__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.CONTAINER_CONSISTENCY__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.CONTAINER_CONSISTENCY__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.CONTAINER_CONSISTENCY__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.CONTAINER_CONSISTENCY__VALUE:
				return value != VALUE_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: "); //$NON-NLS-1$
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ContainerConsistencyImpl
