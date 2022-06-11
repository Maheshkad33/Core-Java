package lab5;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> set = new TreeSet<String>();

		set.add("Mahesh");
		set.add("Ranjit");
		set.add("Mikey");
		set.add("Aman");
		set.add("Akshay");

		System.out.println(set.descendingSet());

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}

		boolean result = set.contains("Mahsh");

		if (result)
			System.out.println("element Present in Treeset: ");
		else
			System.out.println("element not Present in Treeset: ");

	}
}
