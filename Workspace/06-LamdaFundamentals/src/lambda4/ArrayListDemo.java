package lambda4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {
	
	
	public static void printAll(List<Student> list) {
		
		for(Student student : list)
		{
			System.out.println(student);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student(100,"Mahesh",90);
		Student student2 = new Student(101,"Sanket",95);
		Student student3 = new Student(102,"Aman",92);
		Student student4 = new Student(103,"Sagar",93);
		Student student5 = new Student(104,"John",91);
		
		//it is not compulsory provide student after new TreeSet 
		List<Student> list = new ArrayList<>(); //diamond--java 1.7
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
			
		printAll(list);
		System.out.println("************************");
		//Collections.sort(list,new StudentScoreSorter());
		
		//we are replacing comparator class with comparator lambda expression
		Comparator<Student> comparator = (Student s1,Student s2) -> {
			if (s1.getStudentScore() > s2.getStudentScore())
				return 1;
			else
				return -1;
		};
		
		Collections.sort(list, comparator );
		printAll(list);
		
		System.out.println("************************");
		
		Comparator<Student> comparator2 = (s1,s2) -> (s1.getStudentName().compareTo(s2.getStudentName()));
		
		Collections.sort(list,comparator2);
	
		printAll(list);
		
		System.out.println("************************");
		Collections.sort(list,(stu1,stu2)->(stu1.getStudentId()<stu2.getStudentId()?1:-1));
		printAll(list);
	}

}
