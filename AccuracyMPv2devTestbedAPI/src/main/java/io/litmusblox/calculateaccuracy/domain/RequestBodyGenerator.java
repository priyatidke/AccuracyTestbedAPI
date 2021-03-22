package io.litmusblox.calculateaccuracy.domain;

public class RequestBodyGenerator {

	public String getRewuestBody(String jobTitle, String jobDescription, String industry){
		return "{"+
                "\"rolePrediction\":" +
		        "{"+
	            "\"jobTitle\":\""+jobTitle.replace('"', '\"')+"\","+
                "\"jobDescription\":\""+jobDescription.replace('"', '\"')+"\","+

                "\"recruiterRoles\":[],"+
                "\"industry\":\""+industry+"\","+
                
    		 "}"+
           "}";
	
      }
}
