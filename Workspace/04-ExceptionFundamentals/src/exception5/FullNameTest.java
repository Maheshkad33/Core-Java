package exception5;

import java.util.Scanner;

public class FullNameTest {

public static void checkFullName(String num) throws InvalidFullNameException {
	boolean result = num.matches("[A-Za-z ?]+([A-Za-z] ?)+([A-Za-z ?])+");     // allow whitespace after word
	if (!result) {
		InvalidFullNameException e = new InvalidFullNameException("Invalid Full name : " + num);
			throw e;
	}
}

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Valid Full Name: ");
	
	String fullname = sc.nextLine();
	try {
		checkFullName(fullname);
		System.out.println("Valid Full Name : " + fullname);
	}catch(InvalidFullNameException e)
	{
		System.out.println(e.getMessage());
	}
	

}

}

