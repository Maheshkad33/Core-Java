package tryandcatch;

public class Remember {
	
	//it gives runtime error
	public static void think() throws Exception {
		throw new Exception();
	}

	public static void main(String[] args) throws Exception {
		think();
	}
}
