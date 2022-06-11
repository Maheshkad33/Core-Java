package exception5;
import java.util.Scanner;

public class TestNumberException {
	public static void checkNumber(String number) throws InvalidNumberException {
		boolean result=number.matches("[0-9]{10}");

	if(!result) {
		InvalidNumberException e = new InvalidNumberException("Invalid Number:" +number);
		throw e;
	}
	}
	public static void main(String[] args) {
		System.out.println("Enter 10-digit mobile number");
		Scanner sc = new Scanner(System.in);
		
		String number=sc.next();
		
		try {
			checkNumber(number);
			System.out.println("Valid Number : "+number);
		}
		catch(InvalidNumberException e) {
			System.out.println(e.getMessage());
	}
	}
}
