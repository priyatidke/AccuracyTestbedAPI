package io.litmusblox.mainclasscalacc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import io.litmusblox.calculateaccuracy.domain.AccuracyCalculator;
import io.litmusblox.calculateaccuracy.domain.RequestBodyGenerator;
import io.litmusblox.calculateaccuracy.domain.RestAPIResponse;
import io.litmusblox.calculateaccuracy.domain.RestAPIResponseMapper;
import io.litmusblox.calculateaccuracy.domain.RestCallExecutor;
import io.litmusblox.calculateaccuracy.domain.TowerGeneration;
import io.litmusblox.fetchdatafromDB.FetchDataFromDb;
import io.litmusblox.fetchdatafromDB.TestbedData;
import io.litmusblox.resultinDB.ResultStoreinDBRWImpl;
import io.litmusblox.resultinDB.ResultWriter;

public class MainClassAccCal {

	private FetchDataFromDb fetchDataFromDb= new FetchDataFromDb();
	RestAPIResponseMapper restAPIResponseMapper = new RestAPIResponseMapper();
	RestCallExecutor restCallExecutor= new RestCallExecutor();
	private RequestBodyGenerator requestBodyGenerator = new RequestBodyGenerator();
	private RestAPIResponseMapper responseMapper = new RestAPIResponseMapper();
	private AccuracyCalculator accuracyCalculator = new AccuracyCalculator();
	//ResultStoreinDBRWImpl resultStoreinDBRWImpl= new ResultStoreinDBRWImpl();
	private ResultWriter resultWriter = new ResultStoreinDBRWImpl();
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MainClassAccCal accuracyCalculate= new MainClassAccCal();
		List<TestbedData> testbedData=accuracyCalculate.fetchDataFromDb.getTestbedData();
		int i=1;
		for(TestbedData testData : testbedData ){
			//System.out.println(testData.getResume_Text());
			//System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX");
			RestAPIResponse reponse =accuracyCalculate.restCallExecutor.sendGet(i,accuracyCalculate.requestBodyGenerator.getRewuestBody("",testData.getResume_Text(),""));
			//Thread.sleep(20);
			//System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX"+i++);
			//System.out.println(reponse);
//			System.out.println(testData.getResume_Text());
			/*if(null !=reponse.getTowerGeneration() && null !=reponse.getTowerGeneration().getRoles()){
				System.out.println(reponse.getTowerGeneration().getRoles());	
			testData.setResRoles(reponse.getTowerGeneration().getRoles());*/
			
			if(null !=reponse.getRolePrediction() && null !=reponse.getRolePrediction().getJdRoles()){
			//reponse.getRolePrediction().getJdRoles().stream().map(m -> m.getRoleName()).collect(toList()));
			List<String> roles	= reponse.getRolePrediction().getJdRoles().stream().map(m -> m.getRoleName()).collect(Collectors.toList());
			testData.setResRoles(roles);
			//System.out.println("out"+testData);
			
			}
			else{
				testData.setResRoles(new ArrayList());
				//System.out.println("out"+testData);
			}

		}
		
		accuracyCalculate.accuracyCalculator.calculateAccuracy(testbedData);
		for(TestbedData testData : testbedData ){
			//System.out.println(testData);
			
			if(testData.getResRoles().size() == 0){
				accuracyCalculate.resultWriter.storeResult(testData.getId(),"","","",testData.getAccuracyInt());
				//System.out.println(testData);
			}else if(testData.getResRoles().size() == 1){
    			accuracyCalculate.resultWriter.storeResult(testData.getId(),testData.getResRoles().get(0), "","",testData.getAccuracyInt());
    			//System.out.println(testData);
			}else if(testData.getResRoles().size() == 2){
    			accuracyCalculate.resultWriter.storeResult(testData.getId(),testData.getResRoles().get(0), testData.getResRoles().get(1), "",testData.getAccuracyInt());
    			//System.out.println(testData);
			}else if(testData.getResRoles().size() == 3){
    			accuracyCalculate.resultWriter.storeResult(testData.getId(),testData.getResRoles().get(0), testData.getResRoles().get(1), testData.getResRoles().get(2),testData.getAccuracyInt());
    			//System.out.println(testData);
			}
			/*String resrole1,resrole2,resrole3;
			if(testData.getResRoles().get(0)==null)
			{
				resrole1="";
			}
			else
				resrole1=testData.getResRoles().get(0);
			if(testData.getResRoles().get(1)==null)
			{
				resrole2="";
			}
			else
				resrole2=testData.getResRoles().get(1);
			if(testData.getResRoles().get(2)==null)
			{
				resrole3="";
			}
			else
				resrole3=testData.getResRoles().get(2);*/
			//Store result
			
			////accuracyCalculate.resultWriter.storeResult(testData.getId(),testData.getRoles().get(0), testData.getRoles().get(1), testData.getRoles().get(2), testData.getAccuracyInt());
//			accuracyCalculate.resultWriter.storeResult(testData.getId(),resrole1,resrole2,resrole3,testData.getAccuracyInt());
			//System.out.println("store output====>"+testData.getResRoles().get(0));

			//System.out.println("id"+testData.getId());

		}
	}

}
