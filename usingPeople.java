package com.sonata.assignments3;

public class usingPeople {
	public static void main (String [] args) {
		TechnicalEmployee technicalemployee=new TechnicalEmployee("jva",2000);
		Address address=new Address("10-1-A","Astreet","gova",123);
		System.out.println(technicalemployee);
		System.out.println("salary is:"+technicalemployee.calculatesalary());
		Staff staff=new Staff("manager",300000);
		System.out.println(staff);
		System.out.println("salary is:"+staff.calculatesalary());
		
	}

}
