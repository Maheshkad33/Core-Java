package string;

public class StringDemo3 {
	public static void main(String[] args) {
		String str1 = new String("MorningStar");
		
		System.out.println(str1);
		str1 = str1 + " Mumbai";
		//return string from zero position upto 8 th position
		str1 = str1.substring(0, 8);
		System.out.println(str1);
		
	}
}
