package com.sonta.day_3;

public class Rectangle extends Shape implements ShapeInterface{
	
	Rectangle(){};
	
	@Override
	public float area(float length,float width,float height) {
		return length*width;
	}

	public static void main(String args[]) {
		Rectangle r1=new Rectangle();
		System.out.println( "Area of Rectangle is:"+ r1.area(10, 20, 0));
	}
}