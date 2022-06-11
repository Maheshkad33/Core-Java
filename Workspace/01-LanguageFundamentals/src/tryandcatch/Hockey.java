package tryandcatch;

public class Hockey {
	
	//compilation error -variable scope is local
	public static void main(String[] args) {
		try {
			int score = 1;
			System.out.println(score++);
		} catch (Exception e) {
			System.out.println(score++);
		} finally {
			System.out.println(score++);
		}
		System.out.println(score++);
	}
}