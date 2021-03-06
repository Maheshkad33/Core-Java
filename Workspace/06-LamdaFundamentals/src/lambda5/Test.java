package lambda5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student(100, "Mahesh", 90);
		Student student2 = new Student(101, "Sanket", 93.1);
		Student student3 = new Student(102, "Aman", 92);
		Student student4 = new Student(103, "Sagar", 93);
		Student student5 = new Student(104, "John", 91);

		// it is not compulsory provide student after new TreeSet
		List<Student> list = new ArrayList<>(); // diamond--java 1.7
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		
		
		
//		list.stream().forEach(e->System.out.println(e.getStudentName()));
//		list.stream().forEach(e->System.out.println(e.getStudentId()));
//		list.stream().forEach(e->System.out.println(e.getStudentScore()));

		
		//reduce 
		
		//map take a fumction argument and return score and using max we select max and convert into double
		double max = list.stream().mapToDouble(element->element.getStudentScore() ).max().getAsDouble();
		System.out.println("Max Score: " + max);
		
		
		
		
	}
}
