package tryandcatch;

public class Hockey1 {
	
	
	//it will throw exception char not allowed due exception throw in catch block

	public static void main(String[] args) {
		try {
			System.out.println('A');
			throw new RuntimeException("Char not allowed!");
		} catch (Exception e) {
			System.out.println('B');
			throw e;
		} finally {
			System.out.println('C');
		}
	}

}
