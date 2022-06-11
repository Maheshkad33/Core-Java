package collection3;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student(100,"Mahesh",90);
		Student student2 = new Student(101,"Sanket",95);
		Student student3 = new Student(101,"Sanket",95);
		
		//it is not compulsory provide student after new TreeSet 
		TreeSet<Student> set = new TreeSet<>(); //diamond--java 1.7
		set.add(student1);
		set.add(student2);
		set.add(student3);
			
		System.out.println(set);
	}

}
