package exception5;

public class Test1 {
	
	//5 exception
	//valid password
	//valid email
	//valid mobile
	//valid full name
	//valid pan card number
	
	public static void checkName (String name) throws InvalidNameException {
		boolean result = name.matches("[A-Z][a-z]+");
		if(!result) {
			InvalidNameException e = new InvalidNameException("Invalid name: " + name);
			throw e;
		}
		
	}
	
	public static void main(String[] args) {
		String name = "mahesh";
		try {
		checkName(name);
		System.out.println("Valid Name:  " + name);
	}catch (InvalidNameException e) {
		
		System.out.println(e.getMessage());
	}
	}

}
