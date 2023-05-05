/**
 * 
 */
package com.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.bean.Employee;
import com.demo.exception.EmployeeIDNotFound;
import com.demo.exception.EmployeeNotUpdated;

/**
 * @author Dell
 *
 */
public class EmployeeService implements EmployeeInterfaceService {
	
	// All the service must be delcare here 
	
	// creation of custom array in this emplloyee code !
	
	//Employee myEmployees[]=new Employee[] {new Employee(), new Employee(), new Employee()};
	
	//implementing using array list
	
	List<Employee> myEmployees= new ArrayList<Employee>();
	Set<Employee> setEmployee = new HashSet<>();
	Map<Integer,Employee> hashmap= new HashMap<>();
		
	public void createEmployee() {
		
		
		System.out.println("employee is craeted -->");
		
		// Record first 
		
//		myEmployees[0].setEmpId(101);    // end used by io oject or scanner class
//		myEmployees[0].setEmpName("nupur");
//		myEmployees[0].setEmpAddress("blore");
//		
//		myEmployees[1].setEmpId(102);
//		myEmployees[1].setEmpName("adarsh");
//		myEmployees[1].setEmpAddress("blore");
//
//		myEmployees[2].setEmpId(103);
//		myEmployees[2].setEmpName("komal");
//		myEmployees[2].setEmpAddress("Delhi");
		
		Employee emp1= new Employee();
		Employee emp2= new Employee();
		emp1.setEmpId(1);    // end used by io oject or scanner class
		emp1.setEmpName("Komal");
		emp1.setEmpAddress("blore");
		emp2.setEmpId(1);    // end used by io oject or scanner class
		emp2.setEmpName("pathak");
		emp2.setEmpAddress("delhi");
		
		myEmployees.add(emp1);
		myEmployees.add(emp2);
		System.out.println("employee data is -->"+myEmployees.size());
		
		for(Employee emp: myEmployees) {
			
			System.out.println("Employees Details with list-->" );
		}
		//System.out.println("mm"+my);
		
		//myEmployees.stream().forEach(e->System.out.println(););
		System.out.println("testing"+myEmployees.toString());
	}

	
	
	
	public void deleteEmployee(int empID) {//do this
	  empID =102;
	  myEmployees.remove(0);
	  System.out.println("employee deleted here by id-->" +myEmployees);
	   
	}
	
	
	public void updateEmployee() {//do this
		
		//myEmployees[1].setEmpId(90);
		//myEmployees[1].setEmpAddress("new address");
		System.out.println(myEmployees);
		System.out.println("Employee is updated -->");
	}
	
	public void listEmployee() {
		
		
		System.out.println("list of em[ployee here e-->");
		
		// morden Java loop for iterate the collection & Array object
		
		for(Employee emp: myEmployees) {
			
			System.out.println("Employees Details with list-->" +emp );
		}
		
		
	}




	@Override
	public void createEmployeeSet() {
		// TODO Auto-generated method stub
		
		Employee emp1= new Employee();
		Employee emp2= new Employee();
		emp1.setEmpId(1);    // end used by io oject or scanner class
		emp1.setEmpName("Set1 Komal");
		emp1.setEmpAddress("Set1 blore");
		emp2.setEmpId(2);    // end used by io oject or scanner class
		emp2.setEmpName("Set2 pathak");
		emp2.setEmpAddress("Set2 delhi");
		
		setEmployee.add(emp1);
		setEmployee.add(emp2);
		
		System.out.println("set data has been created "+ setEmployee);
	}




	@Override
	public void updateEmployeeSet() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void deleteEmployeeSet(int empID) {
		// TODO Auto-generated method stub
		
		Employee emp1= new Employee();
		emp1.setEmpId(1);    // end used by io oject or scanner class
		emp1.setEmpName("Set3 Komal");
		emp1.setEmpAddress("Set1 blore");		
		System.out.println("updated set --------------->>>");
		setEmployee.remove(1);
		setEmployee.add(emp1);
		for(Employee empSetTest: setEmployee) {
			System.out.println("set delete"+empSetTest);
		}
		//setEmployee.add(emp1);
		
	}




	@Override
	public void listEmployeeSet() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void createEmployeeMap() {
		// TODO Auto-generated method stub
		Employee emp1= new Employee();
		Employee emp2= new Employee();
		
		
		emp1.setEmpId(1234);    
		emp1.setEmpName("rani");
		emp1.setEmpAddress("hashmap1--address");
		
		
		emp2.setEmpId(100);    // end used by io oject or scanner class
		emp2.setEmpName("komal");
		emp2.setEmpAddress("hashmap2--address");
		hashmap.put( 1,emp1);
		hashmap.put(2,emp2);
		for(Map.Entry m:hashmap.entrySet()){  
			System.out.println("------------------------------------");
			   System.out.println(m.getKey()+" hashmap "+m.getValue());  
			  }  
		  
		
		
		
		
		
		
	}




	@Override
	public void updateEmployeeMap() throws EmployeeNotUpdated {
		// TODO Auto-generated method stub
		Employee emp1= new Employee();
		System.out.println("enter the empy id which you want to update");
		Scanner sc=new Scanner(System.in);
		int empId=sc.nextInt();
        int keyToBeChecked = empId;
        System.out.println("please neter name which you want to update");

       // boolean isKeyPresent;
        if( hashmap.containsKey(keyToBeChecked)) {
		String name=sc.next();
		for(Map.Entry m:hashmap.entrySet()){ 
				Employee emp=	(Employee) m.getValue();
				if(emp.getEmpId()==empId)
				{
					emp.setEmpName(name);
					hashmap.put((Integer) m.getKey(),emp);
				}
			  }  
		
		hashmap.forEach((k,v) -> System.out.println(k + " updated employee is" + v) );
        
        }
        else {
        	System.out.println("cant update ");
        	throw new EmployeeNotUpdated(null);
        }
	}




	@Override
	public void deleteEmployeeMap(int empID) throws EmployeeIDNotFound {
		// TODO Auto-generated method stub
		 int keyToBeChecked = empID;
	       
		boolean isKeyPresent;
        if(isKeyPresent= hashmap.containsKey(keyToBeChecked)) {
		
				
				for(Map.Entry m:hashmap.entrySet()){  //contais
						Employee emp=	(Employee) m.getValue();
						if(emp.getEmpId()==empID)
						{
							hashmap.remove(m.getKey());
						}
					  }  
				
				hashmap.forEach((k,v) -> System.out.println(k + " " + v) );
        }
        else {
        	System.out.println("cant delete ");
        	throw new EmployeeIDNotFound();
        }
			}





	@Override
	public void listEmployeeMap() {
		// TODO Auto-generated method stub
		
	}




	/*
	 * @Override public void deleteEmployeeMap(int empID) { // TODO Auto-generated
	 * method stub System.out.println("++++++++++++++++++++++++++++++++++");
	 * 
	 * HashMap<Employee, Integer> testMap= new HashMap<>(); testMap.se
	 * 
	 * Employee emp1= new Employee(); Employee emp2= new Employee();
	 * emp1.setEmpId(1234); emp1.setEmpName("hashmap1--Name");
	 * emp1.setEmpAddress("hashmap1--address");
	 * 
	 * emp2.setEmpId(100); // end used by io oject or scanner class
	 * emp2.setEmpName("hashmap1--name"); emp2.setEmpAddress("hashmap2--address");
	 * hashmap.put(emp1, 1); hashmap.put(emp2, 2);
	 * 
	 * hashmap.remove(emp1);//remove
	 * 
	 * for(Map.Entry m:hashmap.entrySet()){
	 * System.out.println("++++++++++++++++++++++++++++++++++");
	 * System.out.println(m.getKey()+" hashmap removed "+m.getValue()); }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * @Override public void listEmployeeMap() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * //-------
	 */	
	
	
	
	
	
}
