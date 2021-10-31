package com.sonata;

public class Tshort {
	String color;
	String material;
	String design;
	Tshort(String color,String material,String design){
		this.color=color;
		this.material=material;
		this.design=design;
		
	}
	public void display() {
		System.out.println("the color of the t short is:"+color);
		System.out.println("the material of t short is:"+material);
		System.out.println("the design od tea short is:"+design);
	}
	public static void main(String [] args) {
		System.out.println("SMALL SIZE");
		Tshort t1=new Tshort("black","cottun","pocket style");
		t1.display();
		
		System.out.println("MEDIUM SIZE");
		Tshort t2=new Tshort("white","linen","plain");
		t2.display();
		
		System.out.println("LARGE SIZE");
		Tshort t3=new Tshort("blue","polyester","Hooded");
		t3.display();
	}
	

}
