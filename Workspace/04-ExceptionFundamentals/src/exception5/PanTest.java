package exception5;
import java.io.*;
import java.util.Scanner;

public class PanTest {

	public static void checkPANNumber(String num) throws InvalidPANCardException {
		boolean result = num.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		if (!result) {
			InvalidPANCardException e = new InvalidPANCardException("Invalid PAN Number : " + num);
				throw e;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Valid PAN card Number: ");
		
		String pan = sc.next();
		try {
			checkPANNumber(pan);
			System.out.println("Valid PAN Number : " + pan);
		}catch(InvalidPANCardException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
