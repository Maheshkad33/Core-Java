package exception;

public class Exception1 {

	public static void main(String[] args) {
		int number1,number2,result;
		System.out.println("Started of Program...");
		
		number1 = Integer.parseInt(args[0]);
		number2 = Integer.parseInt(args[1]);
		result = number1 / number2;
		
		System.out.println("Result: "+result);
		System.out.println("End of Program...");

	}

}
