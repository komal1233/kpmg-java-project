package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.demo.*;
import com.demo.utils.DBUtil;

public class EmployeeDaoImpl implements EmployeeDaoInterface{

	
	@Override
	public void inserData () {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement stmt = null;
		   
		   try{
//			   Class.forName("com.mysql.jdbc.Driver");
//			      System.out.println("Connecting to database...");
			      conn = DBUtil.getConnection();
			   
			      //STEP 4: Execute a query
			      System.out.println("Creating statement...");
			      String sql="insert into employee values(?,?,?)";
			      stmt = conn.prepareStatement(sql);
			   
			      // Hard coded data 
			      
			      String empId="199";
			      String employeeName="Smruti";
			      String employeeAddress="BBSR";
			      //Bind values into the parameters.
			      stmt.setString(1, empId);
			      stmt.setString(2,employeeName);
			      stmt.setString(3, employeeAddress);  // This would set age
			      stmt.executeUpdate();
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }
			   System.out.println("Employee created");
		
	}

	@Override
	public void deleteEmployee(String empID) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement stmt = null;
		   
		   try{
			   
			   // Step 3 Regiater Driver here and create connection 
			   
		   		conn = DBUtil.getConnection();			   
			      //STEP 4: Execute a query
			      System.out.println("Creating statement...");
			      String sql="delete from employee where empId=(?)";
			     // stmt.setInt(1, 101);
			      stmt = conn.prepareStatement(sql);
			   
			      stmt.setString(1, empID);
			      stmt.executeUpdate();
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }
			   System.out.println("Employee Deleted with id - "+empID);
	}

	@Override
	public void updateData(String empID) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement stmt = null;
		   
		   try{
			   
			   conn = DBUtil.getConnection();
			   
			      //STEP 4: Execute a query
			      System.out.println("Creating statement...");
			      String sql="UPDATE employee SET employeeAddress = 'Dubai' WHERE empId=(?)";
			     // stmt.setInt(1, 101);
			      stmt = conn.prepareStatement(sql);
			   
			      stmt.setString(1, empID);
			      stmt.executeUpdate();
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }
			   System.out.println("Employee Updated with id - "+empID);
	}

	@Override
	public void viewData() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement stmt = null;
		   
		   try{
			   			  
			     conn = DBUtil.getConnection();
			   
			      //STEP 4: Execute a query
			      System.out.println("Creating statement...");
			      String sql="select * from employee";
			     // stmt.setInt(1, 101);
			      stmt = conn.prepareStatement(sql);
			      stmt.execute();
				//step5 close the connection object  
				  
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }
			   System.out.println("All employees fetched... ");
	}

	}
	
	


	