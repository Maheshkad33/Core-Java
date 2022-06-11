package lab5;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map =  new HashMap<String, String>();
		
		map.put("Maharshtra", "Mumbai");
		map.put("Karnataka", "Banglore");
		map.put("MadhyPradesh", "Bhopal");
		map.put("Rajasthan", "Jaipur");
		
		Set<Entry<String, String>> entries = map.entrySet();
		
		Iterator<Entry<String,String>> itr = entries.iterator();
		while(itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println("State: " +  entry.getKey() + " Capital : " + entry.getValue());
		}
	}

}
