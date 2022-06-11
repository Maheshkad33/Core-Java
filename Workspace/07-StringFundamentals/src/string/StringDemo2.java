package string;

public class StringDemo2 {

	public static void main(String[] args) {
		String str1 = new String("MorningStar");
		String str2 = "MorningStar";
		String str3 = "MorningStar";
		
		if(str1 == str2) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}

		if(str2 == str3) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}
		
		System.out.println("-----------------------------------------------------");
		
		if(str1.equals(str2)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}

		if(str2.equals(str3)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}
		
	}

}
