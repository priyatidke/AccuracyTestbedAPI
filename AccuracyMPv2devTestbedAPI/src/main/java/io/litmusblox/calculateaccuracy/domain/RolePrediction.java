package io.litmusblox.calculateaccuracy.domain;

import java.util.List;

public class RolePrediction {

	List<JDRoles> jdRoles;

	public List<JDRoles> getJdRoles() {
		return jdRoles;
	}

	public void setJdRoles(List<JDRoles> jdRoles) {
		this.jdRoles = jdRoles;
	}

	@Override
	public String toString() {
		return "RolePrediction [jdRoles=" + jdRoles + "]";
	}
	
}
