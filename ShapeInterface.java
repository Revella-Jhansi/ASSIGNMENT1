package com.sonta.day_3;

public interface ShapeInterface {
	
	public default float area(float length, float width, float height) {
		return 0;
	}

}
