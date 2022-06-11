package tryandcatch;

class Test extends Exception {
}

class Test1 {
	
	//method signature does not throws any exception
	static public void meth1() {
		System.out.println("meth1 Called");
			throw new Test();
		}

	public static void main(String args[]) {
		try {
			Test1.meth1();
		} catch (Test t) {
			System.out.println("Got the Test Exception");
		} finally {
			System.out.println("Inside finally block ");
		}
	}
}