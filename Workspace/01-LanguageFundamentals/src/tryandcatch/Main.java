package tryandcatch;

class Main {
	
	//Compilation error
	public static void main(String args[]) {
		try {
			throw 404;
		} catch (int e) {
			System.out.println("int exception " + e);
		}
	}
}