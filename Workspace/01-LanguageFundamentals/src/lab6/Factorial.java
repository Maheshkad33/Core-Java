package lab6;

@FunctionalInterface
interface Fact {
	public double factorial (int i);
}

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fact ref1 = i ->{
			int fact = 1;
			for(int a = 1;a<=i;a++)
				fact *= a;
			return fact;
		};
		
		System.out.println("Factorial of number  : " + ref1.factorial(4));
	}

}
