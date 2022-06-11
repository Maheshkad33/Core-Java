package tryandcatch;

class Base extends Exception {
}

class Derived extends Base {
}

//compilation error already handled by base class catch block

public class Q7 {

	public static void main(String args[]) {
		try {
			throw new Derived();
		} catch (Base b) {
			System.out.println("Base");
		} catch (Derived d) {
			System.out.println("Derived");
		}
	}
}
