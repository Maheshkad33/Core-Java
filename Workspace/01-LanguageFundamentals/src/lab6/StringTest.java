package lab6;

interface SpaceTest{
	public void spaceadd(String s);
}

public class StringTest {

	public static void main(String[] args) {
		
		String s1 = "Test";

		SpaceTest ref1 = s->{
			
			StringBuilder result = new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
			   if (i > 0) {
			      result.append(" ");
			    }

			   result.append(s.charAt(i));
			}

			System.out.println('"' + result.toString() + '"');
			
		};
		
		ref1.spaceadd(s1);
	}

}
