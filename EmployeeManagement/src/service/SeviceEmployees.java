package service;

import java.util.ArrayList;

import dao.ManipulateEmp;
import model.Employee;

public class SeviceEmployees {

	public static void  getAllEmployees() {
		ArrayList<Employee> empList = (ArrayList<Employee>) ManipulateEmp.getAllEmployee();
		
		for(Employee e: empList) {
			System.out.println(e);
		}
	}

}
