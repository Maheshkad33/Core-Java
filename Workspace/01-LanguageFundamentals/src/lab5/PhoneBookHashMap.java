package lab5;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in)
;
		System.out.println("Enter the Name : " );
		
		String name = sc.next().toLowerCase();
		
		
		
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	map.put("mahesh", 992394826);
	map.put("sanket", 844646833);
	map.put("rani", 12345678);
	map.put("ankita", 78456123);
	map.put("ranjit", 65478123);
	
	
	
	boolean result = map.containsKey(name);
		if(result) {
			int number = map.get(name);
			System.out.println(name + " phone is : " + number);
		}
		else
			System.out.println("Name not exist in map");
	}

}
