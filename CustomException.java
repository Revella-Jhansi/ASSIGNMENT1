package com.sonta.day_3;

public class CustomException extends Exception {
	public CustomException(String str) {
		super(str);
	}

 public static void main(String[] args) throws CustomException {
	int salary = 2000;
	if(salary<1000)
		throw new CustomException("salary is lessthan 1000");
	else
		System.out.println("salary is greater than 1000");
}
}
