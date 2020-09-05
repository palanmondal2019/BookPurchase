package com.home.test;

import com.home.beans.Employee;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpID("E001");
		emp.setEmpName("Pana Mondal");
		System.out.println("Employee ID : "+emp.getEmpID());
		System.out.println("Employee Name : "+emp.getEmpName());
	}
}
