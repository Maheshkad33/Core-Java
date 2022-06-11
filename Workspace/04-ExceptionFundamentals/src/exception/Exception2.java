package exception;

public class Exception2 {

	public static void main(String[] args) {
		int number1,number2,result=0;
		System.out.println("Started of Program...");
		
		if(args.length==2) {
			try {
		number1 = Integer.parseInt(args[0]);
		number2 = Integer.parseInt(args[1]);
		result = number1 / number2;
		}
			catch(NumberFormatException e) {
				System.out.println("please pass the number only");
			}
		}
		
		else 
			System.out.println("please pass exact 2 arguments");
			
		System.out.println("Result: "+ result);
		System.out.println("End of Program...");

	}

}
