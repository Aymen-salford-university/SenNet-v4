/**
 *
 * $Id$
 */
package org.wsn.sennet.validation;

import org.wsn.sennet.enums.Aggregation;

/**
 * A sample validator interface for {@link org.wsn.sennet.NodeLevelJob}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NodeLevelJobValidator {
	boolean validate();

	boolean validateNodeDataProcessing(Aggregation value);
	boolean validateSensingSamplingRate(long value);
	boolean validateDataProcessingRate(long value);
}
