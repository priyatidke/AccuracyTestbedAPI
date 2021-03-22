package io.litmusblox.calculateaccuracy.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestAPIResponse {

	private TowerGeneration towerGeneration;
	private RolePrediction rolePrediction;
	public TowerGeneration getTowerGeneration() {
		return towerGeneration;
	}
	public void setTowerGeneration(TowerGeneration towerGeneration) {
		this.towerGeneration = towerGeneration;
	}
	public RolePrediction getRolePrediction() {
		return rolePrediction;
	}
	public void setRolePrediction(RolePrediction rolePrediction) {
		this.rolePrediction = rolePrediction;
	}
	@Override
	public String toString() {
		return "RestAPIResponse [towerGeneration=" + towerGeneration + ", rolePrediction=" + rolePrediction + "]";
	}
	
	
	
}
