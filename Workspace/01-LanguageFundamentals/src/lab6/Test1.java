package lab6;

@FunctionalInterface
interface Number {
	
	public double meth(int x,int y);
}

public class Test1 {

	public static void main(String[] args) {
		
		
		Number ref = (x,y)->
			Math.pow(x, y);
		
		System.out.println("Result : " + ref.meth(2, 5));

	}

}
