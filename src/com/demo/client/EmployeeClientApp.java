//package com.demo.client;
//
//import java.util.Scanner;
//
//import com.demo.exception.EmployeeIDNotFound;
//import com.demo.exception.EmployeeNotUpdated;
//import com.demo.service.EmployeeInterfaceService;
//import com.demo.service.EmployeeService;
//
///**
// * @author Dell
// *
// */
//public class EmployeeClientApp {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		// creatre the instamce of the Employee class here 
//		
//		EmployeeInterfaceService service =new EmployeeService();
//		//service.createEmployee();
////		service.deleteEmployee(101);
////		service.updateEmployee();
////		service.listEmployee();
////		service.createEmployeeSet();
//		service.createEmployeeMap();
//		
//		try {
//			service.updateEmployeeMap();
//		} catch (EmployeeNotUpdated e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("enter the empy id which you want to Delete");
//		Scanner sc=new Scanner(System.in);
//		int empId=sc.nextInt();
//		try {
//			service.deleteEmployeeMap(empId);
//		} catch (EmployeeIDNotFound e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//}
