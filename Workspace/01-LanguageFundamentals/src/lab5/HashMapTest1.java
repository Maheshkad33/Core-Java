package lab5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(1, "Mahesh");
		map.put(2, "Sanket");
		map.put(4, "Ranajit");
		map.put(5, "Rutuja");
		map.put(3, "Rani");
		// if we assign value to key again then it save latest value in map
		map.put(2, "Pallavi");
		
		
		boolean key = map.containsKey(2);
		
		if(key)
			System.out.println("Key present in map...");
		else
			System.out.println("key is not present in map..");
		
		
		boolean result = map.containsValue("mahesh");
		if(result)
			System.out.println("Value present in map...");
		else
			System.out.println("Value is not present in map..");
		
		
		//put key data type in set
		Set<Integer> keys = map.keySet();
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()) {
			int key1 = itr.next();
			String value = map.get(key1);
			System.out.println("Key is : " + key1 + " Value is : " + value);
			
		}
		

	}

}
