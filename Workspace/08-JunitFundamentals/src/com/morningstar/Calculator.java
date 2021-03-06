package com.morningstar;

public class Calculator {
	
	public int addition(int num1,int num2) {
		return num1 + num2;
	}
	
	public int sum(int ... num) throws IllegalArgumentException{
		
		if (num.length<=1)
			throw new IllegalArgumentException("Enter more than one numbers");
		
		int sum = 0;
		for (int i : num) {
			sum +=i;
		}
		return sum;
	}

}
