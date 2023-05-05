package com.demo.service;

import com.demo.exception.EmployeeIDNotFound;
import com.demo.exception.EmployeeNotUpdated;

public interface EmployeeInterfaceService {
	
	public void deleteEmployee(int empID);
	public void updateEmployee();
	public void listEmployee();
	public void createEmployee();

	
	public void createEmployeeSet();
	public void updateEmployeeSet();
	public void deleteEmployeeSet(int empID);	
	public void listEmployeeSet();
	
	public void createEmployeeMap();
	public void updateEmployeeMap() throws EmployeeNotUpdated;
	public void deleteEmployeeMap(int empID) throws EmployeeIDNotFound;	
	public void listEmployeeMap();
	
	

}
