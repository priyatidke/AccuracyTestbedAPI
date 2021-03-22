package io.litmusblox.resultinDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResultStoreinDBRWImpl implements ResultWriter{

//storeResult(String id,String rolep1,String rolep2,String rolep3, int accuracyInt)

	public void storeResult(String id,String rolep1,String rolep2,String rolep3, int accuracyInt) {
		Connection connection = null;
		try {
			//System.out.println("================== :::::::::::::::::::===================");
			//System.out.println(resumeContent);
			// LOAD THE DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://jmdb-predictor-dev.cptvjl3vuwqy.ap-south-1.rds.amazonaws.com/role_predictor_dev",
					"jmlabsuser", "Testpass10");
			// here sonoo is database litmusbox_wordcount, root is username and
			// password is not set
			//String query = "INSERT INTO `Manufacturing_Keywords` (Resume_Title,KeySkills) VALUE ('"+filename+"','"+resultCommaseperated+"')";
			// create the java statement
			//Statement st = connection.createStatement();

			
			
           // PreparedStatement stmt=connection.prepareStatement("INSERT  INTO `AccTestBedInpOup_MP`(ID,RoleP1,RoleP2,RoleP3,Accuracy) VALUE (?,?,?,?,?)");  
            
           PreparedStatement stmt=connection.prepareStatement("UPDATE `AccTestBedInpOup_MP` SET `RoleP1` = ?,`RoleP2` = ?,`RoleP3` = ?,`Accuracy` = ? WHERE `ID`="+id);  
            //stmt.setString(1,id);
            stmt.setString(1,rolep1);
			stmt.setString(2,rolep2);
			stmt.setString(3,rolep3);
			stmt.setString(4,String.valueOf(accuracyInt));
			//1 specifies the first parameter in the query 
            

              
            int i=stmt.executeUpdate(); 
            
			// iterate through the java resultset
            System.out.println("Database updated successfully ");

			stmt.close();
		} catch (Exception e) {
			System.out.println(e);
		}finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
