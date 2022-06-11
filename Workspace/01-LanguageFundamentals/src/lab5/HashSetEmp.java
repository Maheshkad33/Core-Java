package lab5;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> empname = new HashSet<String>();
		
		empname.add("Mahesh Kad");
		empname.add("ranajit patil");
		empname.add("Ganesh Thakur");
		empname.add("Ragav Juyal");
		
		Iterator<String> itr = empname.iterator();
		while(itr.hasNext()) {
			System.out.println("Employee Name : " + itr.next());
		}

	}

}
