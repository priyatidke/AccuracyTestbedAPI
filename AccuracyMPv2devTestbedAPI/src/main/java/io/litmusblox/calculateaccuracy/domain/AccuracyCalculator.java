package io.litmusblox.calculateaccuracy.domain;

import java.util.List;

import io.litmusblox.fetchdatafromDB.TestbedData;

public class AccuracyCalculator {

    public List<TestbedData> calculateAccuracy(List<TestbedData> testbedData){
    	for(TestbedData testData : testbedData ){
    		if(testData.getResRoles().size() == 0){
    			testData.setAccuracyInt(0);
    		}else if(testData.getResRoles().size() == 1){
    			checkMatchforSingleRole(testData);
    		}else if(testData.getResRoles().size() == 2){
    			checkMatchforTwoRole(testData);
    		}else if(testData.getResRoles().size() == 3){
    			checkMatchforThreeRole(testData);
    		}
    	}
    	return testbedData;
    }

	private void checkMatchforTwoRole(TestbedData testData) {
		int matchCount=0;
		for(String resRole: testData.getResRoles()){
			for(String role: testData.getRoles()){
				if(resRole.equals(role)){
					matchCount ++;
				}
			}
		}
		if(matchCount ==0){
			testData.setAccuracyInt(0);
		}else if(matchCount ==1){
			testData.setAccuracyInt(50);
		}else if(matchCount ==2){
			testData.setAccuracyInt(100);
		}
		
	}

	private void checkMatchforThreeRole(TestbedData testData) {
		int matchCount=0;
		for(String resRole: testData.getResRoles()){
			for(String role: testData.getRoles()){
				if(resRole.equals(role)){
					matchCount ++;
				}
			}
		}
		if(matchCount ==0){
			testData.setAccuracyInt(0);
		}else if(matchCount ==1){
			testData.setAccuracyInt(33);
		}else if(matchCount ==2){
			testData.setAccuracyInt(66);
		}else if(matchCount ==3){
			testData.setAccuracyInt(100);
		}
		
	}

	private void checkMatchforSingleRole(TestbedData testData) {
		int matchCount=0;
		for(String resRole: testData.getResRoles()){
			for(String role: testData.getRoles()){
				if(resRole.equals(role)){
					matchCount ++;
				}
			}
		}
		if(matchCount ==0){
			testData.setAccuracyInt(0);
		}else {
			testData.setAccuracyInt(100);
		}
		
	}
	

	
	
}
