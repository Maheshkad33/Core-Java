package exception5;
public class EmailTest {

	public static void checkEmail(String email) throws InvalidEmailException
	{
		boolean result=email.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+"); //ALLowed regular expression
		if (!result) {         
			throw new InvalidEmailException("Invalid email: "+email);
			
		}
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String email="chinmay.raorane@morningstar.com";
          try {
			checkEmail(email);
			System.out.println("valid email: "+email);
		} catch (InvalidEmailException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
