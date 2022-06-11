package lab4;

import java.util.Scanner;

public class PasswordApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password:");
		String s1= sc.next();
		System.out.println("Confirm Password:");
		
		
		String s2=sc.next();
		
		if(s1.equals(s2))
			System.out.println("Password are equal");
		else
			System.out.println("Password are not  equal");
	}

}
