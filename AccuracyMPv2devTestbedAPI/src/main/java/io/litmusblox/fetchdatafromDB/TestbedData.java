package io.litmusblox.fetchdatafromDB;

import java.util.List;

public class TestbedData {
	

	private String ID;//this.ID
	private String Resume_Title;
	private String Resume_Text;
	private String Current_Designation;
	private String Role1;
	private String Role2;
	private String Role3;
	private String RoleP1;
	private String RoleP2;
	private String RoleP3;
	private String Accuracy;
	private String Industry;
	private String Key_skills;

	private List<String> roles;
	private List<String> resRoles;
    private int accuracyInt;


	
	
	public int getAccuracyInt() {
		return accuracyInt;
	}

	public void setAccuracyInt(int accuracyInt) {
		this.accuracyInt = accuracyInt;
	}

	public List<String> getResRoles() {
		return resRoles;
	}

	public void setResRoles(List<String> resRoles) {
		this.resRoles = resRoles;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public TestbedData(String id, String resume_title, String resume_text, String currentDesignation, String role1, String role2, String role3,String rolep1, String rolep2, String rolep3,String accuracy, String industry,
			 String keyskills) {
		super();
		this.ID = id;
		this.Resume_Title = resume_title;
		this.Resume_Text = resume_text;
		this.Current_Designation = currentDesignation;
		this.Role1 = role1;
		this.Role2 = role2;
		this.Role3 = role3;
		this.RoleP1 = rolep1;
		this.RoleP2 = rolep2;
		this.RoleP3 = rolep3;
		this.Accuracy = accuracy;
		this.Industry = industry;
		this.Key_skills = keyskills;
	}
	
	public String getId() {
		return ID;
	}
	public void setId(String id) {
		this.ID = id;
	}
	public String getResume_Title() {
		return Resume_Title;
	}
	public void setResume_Title(String resume_title) {
		this.Resume_Title = resume_title;
	}
	public String getResume_Text() {
		return Resume_Text;
	}
	public void setResume_Text(String resume_text) {
		this.Resume_Text = resume_text;
	}
	public String getCurrent_Designation() {
		return Current_Designation;
	}
	public void setCurrent_Designation(String currentDesignation) {
		this.Current_Designation = currentDesignation;
	}
	public String getRole1() {
		return Role1;
	}
	public void setRole1(String role1) {
		this.Role1 = role1;
	}
	public String getRole2() {
		return Role2;
	}
	public void setRole2(String role2) {
		this.Role2 = role2;
	}
	public String getRole3() {
		return Role3;
	}
	public void setRole3(String role3) {
		this.Role3 = role3;
	}
	public String getRoleP1() {
		return RoleP1;
	}
	public void setRoleP1(String rolep1) {
		this.RoleP1 = rolep1;
	}
	public String getRoleP2() {
		return RoleP2;
	}
	public void setRoleP2(String rolep2) {
		this.RoleP2 = rolep2;
	}
	public String getRoleP3() {
		return RoleP3;
	}
	public void setRoleP3(String rolep3) {
		this.RoleP3 = rolep3;
	}
	public String getAccuracy() {
		return Accuracy;
	}
	public void setAccuracy(String accuracy) {
		this.Accuracy = accuracy;
	}
	public String getIndustry() {
		return Industry;
	}
	public void setIndustry(String industry) {
		this.Industry = industry;
	}
	public String getKey_skills() {
		return Key_skills;
	}
	public void setKey_skills(String keyskill) {
		this.Key_skills = keyskill;
	}


	@Override
	public String toString() {
		/*return "TestbedData [ID=" + ID + ", Resume_Title=" + Resume_Title + ", Resume_Text=" + Resume_Text
				+ ", Current_Designation=" + Current_Designation + ", Role1=" + Role1 + ", Role2=" + Role2 + ", Role3="
				+ Role3 + ", RoleP1=" + RoleP1 + ", RoleP2=" + RoleP2 + ", RoleP3=" + RoleP3 + ", Accuracy=" + Accuracy
				+ ", Industry=" + Industry + ", Key_skills=" + Key_skills + ", roles=" + roles + ", resRoles="
				+ resRoles + ", accuracy=" + accuracy + "]";
				*/
		return "TestbedData [ID=" + ID + ", roles=" + roles + ", resRoles="
				+ resRoles + ", accuracy=" + accuracyInt + "]";
	}
	
	
	
	
}
