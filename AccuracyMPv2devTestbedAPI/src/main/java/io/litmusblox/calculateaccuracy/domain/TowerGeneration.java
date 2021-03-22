package io.litmusblox.calculateaccuracy.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class TowerGeneration {

	@JsonProperty("rolePrediction")
	private List<String> roles;

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "TowerGeneration [roles=" + roles + "]";
	}
	
	
	
}
