package io.litmusblox.fetchdatafromDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FetchDataFromDb {

	
	public List<TestbedData> getTestbedData() {
		List<TestbedData> testBedDataResult= new ArrayList<TestbedData>();
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  		
			Connection connection=DriverManager.getConnection("jdbc:mysql://jmdb-predictor-dev.cptvjl3vuwqy.ap-south-1.rds.amazonaws.com/role_predictor_dev","jmlabsuser","Testpass10");
			Statement statement=connection.createStatement(); //Creating a Statement to execute the query 
			ResultSet  queryResult = statement.executeQuery("select * from `AccTestBedInpOup_MP`");  //Getting th result set for the query 

			while(queryResult.next()){
			TestbedData testbedData=new TestbedData(queryResult.getString(1), 
						queryResult.getString(2), 
						queryResult.getString(3), 
						queryResult.getString(4), 
						queryResult.getString(5), 
						queryResult.getString(6), 
						queryResult.getString(7), 
						queryResult.getString(8), 
						queryResult.getString(9), 
						queryResult.getString(10), 
						queryResult.getString(11),
						queryResult.getString(12),
						queryResult.getString(13));
			
            List<String> roles= new ArrayList<String>();
			roles.add(testbedData.getRole1());
			roles.add(testbedData.getRole2());
			roles.add(testbedData.getRole3());
			testbedData.setRoles(roles);

			testBedDataResult.add(testbedData);
				
				   
			}
	     }catch(Exception e){}

		return testBedDataResult;
	}
}


