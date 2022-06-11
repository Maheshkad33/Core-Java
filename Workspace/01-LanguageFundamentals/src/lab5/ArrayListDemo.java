package lab5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void printAll(ArrayList l)
	{
		Iterator<String> itr = l.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mahesh");
		list.add("Aman");
		list.add("Sanket");
		//list.add(50);
		
		printAll(list);

	}

}
