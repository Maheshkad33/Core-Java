package lab;

import java.util.Scanner;

public class PrimeNumber {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		boolean flag=true;
		
		if(n==0 || n==1)
		{
			flag=false;
		}
		for (int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
			
		}
		
		if(flag==true)
		{
			System.out.println(n + " is a prime number");
		}
		else 
			System.out.println(n + " not a prime number");
	}

}
