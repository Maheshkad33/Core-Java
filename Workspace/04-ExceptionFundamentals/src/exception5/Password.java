package exception5;
import java.util.*;

public class Password {

	public static void checkPassword(String num) throws InvalidPasswordException {
	boolean result = num.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");//
	if (!result) {
		throw new InvalidPasswordException("Invalid Password : " + num);
			
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Valid Password: ");
		
		String pan = sc.next();
		try {
			checkPassword(pan);
			System.out.println("Valid Password : " + pan);
		}catch(InvalidPasswordException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
