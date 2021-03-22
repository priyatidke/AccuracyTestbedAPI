/*package io.litmusblox.fetchdatafromDB;

import java.util.List;

import lambdaJavaPredictor.demo;
import lambdaJavaPredictor.*;

public class Testbed {

	private FetchDataFromDb fetchdatafromDB = new FetchDataFromDb();

	public static void main(String[] args) {
		Testbed testbed = new Testbed();
		List<TestbedData> TestbedDataResult = testbed.fetchdatafromDB.getTestbedData();
		for (TestbedData testbedData : TestbedDataResult)
			for (String role : testbedData.getRoles()) {
				System.out.println("//////////////////////////////////////");
				System.out.println("Resume : "+ testbedData.getResume_Text());
				System.out.println("Role : "+ role);
				System.out.println("Industry : "+ testbedData.getIndustry());

				System.out.println("//////////////////////////////////////");
				// if(role != null){
					demo predictor = new demo();
				    predictor.executor(testbedData.getResume_Text(), role, "", testbedData.getIndustry());
				//}
			}
	}

}*/
