package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String args[]){  
		
		
		EmployeeDaoInterface emp= new EmployeeDaoImpl();
		emp.inserData();
		//emp.deleteEmployee("199");
		//emp.updateData("199");
		emp.viewData();
		
		}  
		

}
