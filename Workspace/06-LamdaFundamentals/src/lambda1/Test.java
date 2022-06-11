package lambda1;


@FunctionalInterface
interface I1{
	void meth1();
	default void meth2() {
		System.out.println("default Method");
	}
	static void meth3() {
		System.out.println("static Method");
	}
}

class C1 implements I1{
	@Override
	public void meth1() {
		System.out.println("meth1 from claa C1");
	}
}

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		I1 obj = new C1();
		obj.meth1();
		
		I1 obj2 = new I1() {
			
			@Override
			public void meth1() {
				// TODO Auto-generated method stub
				System.out.println("meth1 from annonumus inner class");
			}
		};
		
		obj2.meth1();
		
		//lambda expression - above two replace by lambda expression 
		//so no need to write class and override and use of annonumus class
		//it can be do with lambda expression
		I1 obj3 = ()-> System.out.println("meth1 from lamda expression");
		obj3.meth1();

	}

}
