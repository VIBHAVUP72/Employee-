package org.jsp.employee.controller;

import org.jsp.employee.dao.EmployeeDao;
import org.jsp.employee.dto.Employee;

public class SaveEmployee 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.setName("ABC");
		e.setPassword("a123");
		e.setPhone(12345);
		e.setDesg("HR");
		e.setSal(50000);
		EmployeeDao dao = new EmployeeDao();
		e=dao.saveEmployee(e);
		System.out.println("Your details are registered with ID: "+e.getId());
	}
}
