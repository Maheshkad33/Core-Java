package tryandcatch;

//no error

public class Q10 {

	public static int meth1() {
		int result = 0;
		try {
			result = 1;
			System.out.println("return value");
			return result;
		} finally {
			System.out.println("In finally");
		}
	}

	public static void main(String[] args) {
		int result = Q10.meth1();
		System.out.println(result);
	}

}
