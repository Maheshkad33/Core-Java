package lab02;

import java.util.Scanner;

public class DivisibleOf4and7 {
	
	static int calculateSum(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%4==0 || i%7==0)
			{
				sum+=i;
			}
		
		}
		return sum;
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter A positive Number");
		int number = sc.nextInt();
		System.out.println("sum of natural number upto " + number + " is : " + calculateSum(number));
		
		

	}

}
