package lab01;

import java.util.Scanner;

public class CubeSum {
	
	public static double sum(int num) {
		double sum=0;
		while(num>0) {
			int r = num%10;
			sum += (r*r*r);
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter A positive Number");
		int number = sc.nextInt();
		System.out.println(sum(number));
		
	}

}
