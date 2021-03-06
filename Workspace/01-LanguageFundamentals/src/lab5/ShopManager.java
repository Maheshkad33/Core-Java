package lab5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ShopManager {

	public static void main(String[] args) {
	
		System.out.println("Welcome to Global Net Electronics");
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Dell Inspiron");
		list.add("Lenovo Ideapad");
		list.add("HP Pavillion");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Model name of Laptop: ");
		String name = sc.next();
		name += " ";
		name +=sc.next();
		sc.close();
		
		boolean result = list.contains(name);
		
		if (result) {
			System.out.println( "Yes, Model is Available, would you like to buy?");
		}
		else
		{
			System.out.println(" Sorry, Model is not available ");
			list.add(name);
		}
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("Model Available : " + itr.next());
		}
	}

}
