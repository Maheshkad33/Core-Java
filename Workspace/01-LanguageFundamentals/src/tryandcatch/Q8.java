package tryandcatch;

//a = 0
//inside the finally block

//runtime exception due to divide by zero so arithmetic exception

public class Q8 {

	
	public static void main (String[] args)
	 {
	 try{
	 int a = 0;
	 System.out.println ("a = " + a);
	 int b = 100 / a;
	 System.out.println ("b = " + b);
	 }
	 finally
	 {
	 System.out.println ("inside the finally block");
	 }
	System.out.println("End of App");
	 }
}
