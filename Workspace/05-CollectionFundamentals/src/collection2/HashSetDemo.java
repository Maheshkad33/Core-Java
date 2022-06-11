package collection2;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student(100,"Mahesh",90);
		Student student2 = new Student(101,"Sanket",95);
		Student student3 = new Student(101,"Sanket",95);
		
		//every object have different hashcode
		
		System.out.println("Student1 hashcode: "+student1.hashCode());
		System.out.println("Student2 hashcode: "+student2.hashCode());
		System.out.println("Student 3hashcode: "+student3.hashCode());
		
		//it is not compulsary provide student after new hashset 
		HashSet<Student> set = new HashSet<Student>(); //diamond--java 1.7
		set.add(student1);
		set.add(student2);
		boolean status = set.add(student3);
		
		System.out.println("status: "+status);
		System.out.println(set);
	}

}
