package com.sonata.assignment4;

class Employee implements Comparable<Employee>{
    long employeeId;
    String employeeName;
    double employeeSalary;
    
    //generate compareTo and hashcode methods
    
    Employee(long employeeId, String employeeName,double employeeSalary)
    {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;
    }

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(o.employeeId==this.employeeId)
			return 0;
			else return 1;
	}
}
