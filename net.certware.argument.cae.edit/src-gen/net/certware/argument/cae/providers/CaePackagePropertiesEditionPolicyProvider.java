/**
 * Generated with Acceleo
 */
package net.certware.argument.cae.providers;

import net.certware.argument.cae.CaePackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.impl.providers.StandardPropertiesEditionPolicyProvider;

/**
 * 
 * 
 */
public class CaePackagePropertiesEditionPolicyProvider extends StandardPropertiesEditionPolicyProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider#provides(org.eclipse.emf.ecore.EObject)
	 * 
	 */
	public boolean provides(EObject eObject) {
		return CaePackage.eINSTANCE.equals(eObject.eClass().getEPackage()) || CaePackage.eINSTANCE.getESubpackages().contains(eObject.eClass().getEPackage());
	}

}
