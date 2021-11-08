package com.sonata.assignment4;

import java.util.ArrayList;
import java.util.List;

public class UserEmployee
{
	public static void main(String[] args) {
		try{
		    Employee e1=new Employee(10000001,"john",5000);
		Employee e2=new Employee(10000002,"mike",15000);
		Employee e3=new Employee(10000003,"jack",25000);
		Employee e4=new Employee(10000004,"prabha",89000);
		
		EmployeeImpl employee=new EmployeeImpl();
		
		employee.addEmployee(e2);
		employee.addEmployee(e3);
		employee.addEmployee(e4);
		System.out.println("After adding all employees employee list is:");
		System.out.println(employee.listOfEmployee);
		employee.deleteEmployee(e3);
		System.out.println("After deleting 3rd employee employee list is:");
		System.out.println(employee.listOfEmployee);
		System.out.println("montly salary of 1st employee is : "+employee.appSalary(e1));
		System.out.println("yearly salary of 4th employee is : "+employee.yearSalary(e4));
		Employee e5=new Employee(10000001,"jyosh",78000);
		employee.addEmployee(e5);
		}
		catch(Exception e)
	    {
	        System.out.println(e.getMessage());
	    }
		
		
	}
}


