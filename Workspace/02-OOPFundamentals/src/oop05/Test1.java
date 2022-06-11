package oop05;

class A{
	public A() {
		System.out.println("A()");
	}
public A(int a) {
	System.out.println("A(int a)");	
	}
}

class B extends A{
	public B() {
		System.out.println("A()");
	}
	public B(int a) {
		System.out.println("Bc(int a)");
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj1=new A();
		B obj2 = new B();
		
		
	}

}
