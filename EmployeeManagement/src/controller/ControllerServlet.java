package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import dao.ManipulateEmp;
import model.Employee;
import service.SeviceEmployees;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    public ControllerServlet() {
        super();
       
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In servlet");
		ManipulateEmp m= new ManipulateEmp();
		m.getAllEmployee();
		ArrayList<Employee> empList = (ArrayList<Employee>) ManipulateEmp.getAllEmployee();
		System.out.println(empList);
		request.setAttribute("e", empList);
	 	request.getRequestDispatcher("showEmployeeDetails.jsp").forward(request, response);
			//	SeviceEmployees.getAllEmployees();
		
	}
}
