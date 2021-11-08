package com.sonta.day_3;

public class Triangle extends Shape implements  ShapeInterface {

Triangle(){};
	
	@Override
	public float area(float length,float width,float height) {
		return ((length*height)/2);
	}

	public static void main(String args[]) {
		Triangle t1=new Triangle();
		System.out.println( "Area of Triangle  is:"+ t1.area(20, 30, 40));
	}

}
