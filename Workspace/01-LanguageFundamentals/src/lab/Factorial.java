package lab;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		double sum=1;
		for (int i = 1;i<=n;i++)
		{
			sum *=i;
		}
		
		System.out.println("factorial of " + n +"  is " + sum);

	}

}
