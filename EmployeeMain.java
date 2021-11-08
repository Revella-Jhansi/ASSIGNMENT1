package com.sonta.day_3;


class Employee {
	
	
	int empid;
	String empname;
	double empsal;
	double comm;
     Employee(){}
	Employee(int eid,String ename,double esal){		
		this.empid=eid;
		this.empname=ename;		
       this.empsal=esal;
	}
	public void salcal() {
		System.out.println("the total salary of emplyee is"+empsal+comm);
	}
	public void display() {
		
		System.out.println("the employee id is"+empid);
		System.out.println("the employee name is"+empname);
		System.out.println("the employee salary is"+empsal);
	}
	Object calculatesalary() {
		// TODO Auto-generated method stub
		return null;
	}
}
	class Manager extends Employee{
		double comm;
		
		Manager(int empid, String empname, double empsal,double comm){
			
			super( empid, empname,empsal);
		}
		public double salcal(double comm) {
			this.comm=comm;
			return this.empsal;
			
		}
	}
	class Developer extends Employee{
		double comm;
		Developer(int empid, String empname, double empsal,double comm){
			super( empid, empname, empsal);
		}
		public double salcal(double comm) {
			this.comm=comm;
			return this.empsal+comm;
			
		}
	}
	class Tester extends Employee{
		double comm;
		Tester(int empid, String empname, double empsal,double comm){
			super( empid, empname,empsal );
			this.comm=comm;
		}
		public double salcal(double comm) {
			
			return this.comm+this.empsal;
			
		}
	}

	 public class EmployeeMain {
		public static void main(String args[]) {
			System.out.println("TESTER");
			Tester t1=new Tester(1,"priya",2000,0.0);
			t1.display();
			t1.salcal();
			System.out.println("MANAGER");
			Manager m1=new Manager(2,"jan",3000.0,0.0);
			m1.display();
			m1.salcal();
			System.out.println("DEVELOPER");
			Developer d1=new Developer(3,"jyo",2000.0,0.0);
			d1.display();
			d1.salcal();
		}
	}
	
   

