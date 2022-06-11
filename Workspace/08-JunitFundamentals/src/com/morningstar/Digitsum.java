package com.morningstar;

import java.util.Scanner;

public class Digitsum {
	
	public  int sumOfDigit(int num) {
		int n=num;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum+=r;
			n=n/10;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		
	//	System.out.println("sum of digit of number "+num+" is " + sum);

	}

}