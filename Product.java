package com.sonata;

public class Product {
	int proid;
	String proname;
	double proprice;
	
	Product(){}
	
	public double proprice(double gst) {
	
		return this.proprice+gst;
	} 
	public void display() {
		System.out.println("product id is:"+proid);
		System.out.println("product name is:"+proname);
		System.out.println("product price is:"+proprice);
		
	}
	public static void main(String [] arg) {
		Product p1=new Product ();
		p1.proid=1;
		p1.proname="abc";
		p1.proprice=10;
		p1.display();
		System.out.print("total price is:");
		System.out.println(p1.proprice(12.0));
		
		
	}
}
	

