
package net.certware.planning.cpn;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CpnDslStandaloneSetup extends CpnDslStandaloneSetupGenerated{

	public static void doSetup() {
		new CpnDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

