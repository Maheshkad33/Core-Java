package com.morningstar;

import java.util.Scanner;

public class Monthsswitchcase {

	public static String month(int i) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 1-12 to see month: ");
//		int i = sc.nextInt();

		switch (i) {
		case 1: {
			return "January";
		}
		case 2: {
			return "Feb";
		}

		case 3: {
			return "March";
		}

		case 4: {
			return "April";
		}

		case 5: {
			return "May";
		}

		case 6: {
			return "June";
		}

		case 7: {
			return "July";
		}

		case 8: {
			return "August";
		}

		case 9: {
			return "September";
		}

		case 10: {
			return "Octomber";
		}

		case 11: {
			return "November";
		}

		case 12: {
			return "December";
		}
		default: {
			return null;
		}

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1-12 to see month: ");
		int i = sc.nextInt();

		System.out.println(Monthsswitchcase.month(i));

	}

}
