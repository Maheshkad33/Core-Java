package lambda2;

public class MinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Min ref1 = (x1,x2) -> {
			int result = (x1<x2) ? x1 : x2 ;
			return result;
		};
		System.out.println("Min: " + ref1.min(100, 200));

	}

}
