package net.certware.argument.arm.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>AssertedCounterEvidenceImplTest</code> contains tests for the class <code>{@link AssertedCounterEvidenceImpl}</code>.
 * <p>
 * CertWare Project
 * Copyright (c) 2010 Kestrel Technology LLC.  All rights reserved.
 *
 * @generatedBy CodePro at 10/12/10 1:33 PM
 * @author mrb
 */
public class AssertedCounterEvidenceImplTest {
	/**
	 * Run the AssertedCounterEvidenceImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testAssertedCounterEvidenceImpl_1()
		throws Exception {

		AssertedCounterEvidenceImpl result = new AssertedCounterEvidenceImpl();

		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIdentifier());
		assertEquals(null, result.getDescription());
		assertEquals(true, result.eDeliver());
		assertEquals(false, result.eIsProxy());
		assertEquals(0, result.eContainerFeatureID());
		assertEquals(null, result.eInternalContainer());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(null, result.eDirectResource());
		assertEquals(null, result.eProxyURI());
		assertEquals(null, result.eInternalResource());
		assertEquals(null, result.eStore());
		assertEquals(false, result.eNotificationRequired());
		
	}

	/**
	 * Run the EClass eStaticClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEStaticClass_1()
		throws Exception {
		AssertedCounterEvidenceImpl fixture = new AssertedCounterEvidenceImpl();
		fixture.description = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.target = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		EClass result = fixture.eStaticClass();

		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(6, result.getFeatureCount());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(null, result.getDefaultValue());
		assertEquals("net.certware.argument.arm.AssertedCounterEvidence", result.getInstanceClassName());
		assertEquals(10, result.getClassifierID());
		assertEquals("net.certware.argument.arm.AssertedCounterEvidence", result.getInstanceTypeName());
		assertEquals("AssertedCounterEvidence", result.getName());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
		
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Before
	public void setUp()
		throws Exception {
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@After
	public void tearDown()
		throws Exception {
	}
}