package com.sonata.assignments3;

public class TechnicalEmployee extends Employee {
	String technicalskills;
	 double Salary;

	@Override
	double calculatesalary() {
		// TODO Auto-generated method stub
		this.Salary=this.basicpay+(this.basicpay*0.12);
		return this.Salary;
	}

	public TechnicalEmployee(String technicalskills, double salary) {
		super();
		this.technicalskills = technicalskills;
		Salary = salary;
	}

	@Override
	public String toString() {
		return "TechnicalEmployee [technicalskills=" + technicalskills + ", Salary=" + Salary + "]";
	}
	
	
	

}
