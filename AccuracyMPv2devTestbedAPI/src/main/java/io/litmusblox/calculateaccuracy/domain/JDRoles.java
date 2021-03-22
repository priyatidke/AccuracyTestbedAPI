package io.litmusblox.calculateaccuracy.domain;

public class JDRoles {

	String score;
    String roleName;
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "JDRoles [score=" + score + ", roleName=" + roleName + "]";
	}
   
    
}
