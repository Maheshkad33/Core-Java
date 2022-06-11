package lab;
import java.io.*;
import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1-12 to see month: ");
		int i = sc.nextInt();
		if(i<=0)
			System.out.println("Invalid Month number");
		if (i<13) {
			if (i==1)
				System.out.println("January");
			else if(i==2)
				System.out.println("Febuary");
			else if(i==2)
				System.out.println("Febuary");
			else if(i==3)
				System.out.println("March");
			else if(i==4)
				System.out.println("April");
			else if(i==5)
				System.out.println("May");
			else if(i==6)
				System.out.println("June");
			else if(i==7)
				System.out.println("July");
			else if(i==8)
				System.out.println("August");
			else if(i==9)
				System.out.println("September");
			else if(i==10)
				System.out.println("October");
			else if(i==11)
				System.out.println("November");
			else if(i==12)
				System.out.println("December");}
		else
			System.out.println("Invalid Month number");
			
			
		}
		
		

	}


