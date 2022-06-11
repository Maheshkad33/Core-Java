

package lab;

import java.io.*;
import java.util.Scanner;

public class PositiveorNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check positive or negative:");
		int num =  sc.nextInt();
		
		if (num<0)
			System.out.println("Number is Negative");
		else
			System.out.println("Number is positive");
	}

}
