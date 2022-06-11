package collection1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map
		//HashSet<Object> hs = new HashSet<Object>();
		HashSet<String> hs = new HashSet<String>();
		hs.add("Morning Star");
		hs.add("JPM");
		hs.add("TCS");
		hs.add("Capgemini");
		hs.add("TCS");
		
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			//String str = (String)itr.next();
			String str = itr.next();
			System.out.println("Company Name : " + str +",Length: "+ str.length() );
		}
	}

}
