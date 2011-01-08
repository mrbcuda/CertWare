/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

/**
 * Example artifact contributions.  
 * Meant to support the exports extension point and wizard. 
 * @author mrb
 * @since 1.0.3
 */
public class ExportContributions implements IExportContribution {

	List<ExportStyleIdMapping> styleIdMappings = new ArrayList();
	List<ExportStyleResource> styleResources = new ArrayList();
	List<ExportStyleString> styleStrings = new ArrayList();
	
	/**
	 * Initialize the categories and list given the extension point contributions.
	 */
	public void initialize() {

		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(EXPORT_EXTENSION);

		// given the contributions, allocate them to the categories
		for ( IConfigurationElement ce : config ) {
			if ( EXPORT_ELEMENT_STYLEID_MAPPING.equals(ce.getName())) {
				ExportStyleIdMapping esm = new ExportStyleIdMapping(ce);
				styleIdMappings.add(esm);
			}
			
			if ( EXPORT_ELEMENT_STYLE_RESOURCE.equals(ce.getName())) {
				ExportStyleResource esr = new ExportStyleResource(ce);
				styleResources.add(esr);
			}
			
			if ( EXPORT_ELEMENT_STYLE_CONTRIBUTION.equals(ce.getName())) {
				ExportStyleString ess = new ExportStyleString(ce);
				styleStrings.add(ess);
			}
		}
	}

	/**
	 * @return the styleIdMappings
	 */
	public List<ExportStyleIdMapping> getStyleIdMappings() {
		return styleIdMappings;
	}

	/**
	 * @return the styleResources
	 */
	public List<ExportStyleResource> getStyleResources() {
		return styleResources;
	}

	/**
	 * @return the styleStrings
	 */
	public List<ExportStyleString> getStyleStrings() {
		return styleStrings;
	}
	
	
}
