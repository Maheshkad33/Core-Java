package exceptionTest;
public class Test {
	public static void meth1() {
		try {
			String str = "Makarand";
			char ch = str.charAt(10);
			System.out.println(ch);
		}
		catch(Exception e) {
			System.out.println("Exception occured.");
		}finally {
			System.out.println("Always executed.");
		}
	}
	public static void main(String[] args) {
		Test.meth1();
	}
}
