package oop07;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		Test t2 = t;
		t = null;
		System.gc();
		System.out.println("end main");

	}

	@Override
	protected void finalize() {
		System.out.println("Finalize method called");
	}
}
