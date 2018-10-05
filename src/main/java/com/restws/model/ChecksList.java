package com.restws.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 	Wrap a list of checks.  When using JAX-B it is always good practice to wrap a list of some object into a wrapper
 * 	class.
 */
@XmlRootElement
public class ChecksList {

	private List<Check> checks;

	public List<Check> getChecks() {
		return checks;
	}

	public void setChecks(List<Check> checks) {
		this.checks = checks;
	}
}
