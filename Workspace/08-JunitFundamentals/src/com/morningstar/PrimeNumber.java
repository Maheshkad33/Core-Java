package com.morningstar;

import java.util.Scanner;

public class PrimeNumber {
	
	public boolean isPrime(int num) {
boolean flag=true;
		
		if(num==0 || num==1)
		{
			flag=false;
		}
		for (int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
			
		}
		return flag;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
//		boolean flag = isPrime(n);
//		
//		if(flag==true)
//		{
//			System.out.println(n + " is a prime number");
//		}
//		else 
//			System.out.println(n + " not a prime number");
	}

}
