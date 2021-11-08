package com.sonta.day_3;

public class Square extends Shape implements ShapeInterface{

	Square(){};
	
	@Override
	public float area(float length,float width,float height) {
		return length*length;
	}

	public static void main(String args[]) {
		Square s1=new Square();
		System.out.println( "Area of Square is:"+ s1.area(20, 0, 0));
	}

}
