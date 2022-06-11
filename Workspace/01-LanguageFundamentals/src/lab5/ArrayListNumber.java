package lab5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListNumber {

		public static void printAll(ArrayList l)
		{
			Iterator<Number> itr = l.iterator();
			while(itr.hasNext()) {
				Number s = itr.next();
				System.out.println(s);
			}
		}
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ArrayList<Number> list = new ArrayList<Number>();
			list.add(22.52);
			list.add(44);
			list.add(31.05);
		//	list.add("Mh");
			
			printAll(list);

		}

	}


