package lab01;

import java.util.Scanner;

public class Traffic {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Signal Light Color:");
		String s = sc.next();
		
		String color = s.toLowerCase();		
		
		switch (color) {
		
		case "red":
		{
			System.out.println("Stop");
			break;
		}
		case "green":
		{
			System.out.println("Go");
			break;
		}
		case "yellow":
		{
			System.out.println("Ready");
			break;
		}
		 default:{
			System.out.println("Enter Valid color");
		}
		}

	}

}
