package lab02;

import java.util.Scanner;

public class SumofSquares {
	
	public static int diffOfSquares(int num) {
		int sum1 =0;
		int sum2=0;
		int add =0;
		for(int i=1;i<=num;i++) {
			
			sum1 +=i*i;
			
		}
		for (int j =1;j<=num;j++) {
			add +=j;	
		}
		sum2 = add *add;
		
		int diff = sum2 - sum1;
		return diff;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int number = sc.nextInt();
		
		System.out.println("difference of square: " + diffOfSquares(number));

	}

}
