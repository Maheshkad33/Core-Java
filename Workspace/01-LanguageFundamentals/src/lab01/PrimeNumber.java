package lab01;


import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = sc.nextInt();
		findPrimes(a);

	}

	static void findPrimes(int a) {
		for (int i = 2; i <= a; i++) {
			if (checkPrime(i)) {
				System.out.print(i + " ");
			}

		}
	}

	static boolean checkPrime(int num) {
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0)
				return false;

		}
		return true;
	}

}
