package com.demo.client;

import com.demo.service.EmployeeInterfaceService;
import com.demo.service.EmployeeService;

/**
 * @author Dell
 *
 */
public class EmployeeClientApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creatre the instamce of the Employee class here 
		
		EmployeeInterfaceService service =new EmployeeService();
		service.createEmployee();
		service.deleteEmployee(101);
		service.updateEmployee();
		service.listEmployee();
		
	}

}
