/**
 *
 * $Id$
 */
package org.wsn.sennet.validation;

import org.eclipse.emf.common.util.EList;

import org.wsn.sennet.AbstractClusterNode;
import org.wsn.sennet.AbstractSensor;

/**
 * A sample validator interface for {@link org.wsn.sennet.Cluster}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ClusterValidator {
	boolean validate();

	boolean validateNodes(EList<AbstractClusterNode> value);
	boolean validateResources(EList<AbstractSensor> value);
}
