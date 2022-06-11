package oop05;

interface I1{
	int X = 1000;//public static final int x = 1000;
	
	void fun();//public abstract void fun();
}

class C1 implements I1{
	@Override
	public void fun() {
		System.out.println("C1: fun");
	}
}
public class Test {

	public static void main(String[] args) {

			I1 ref = new C1();
			ref.fun();
	}

}
