package collection4;

import java.util.Comparator;

//if we have to add multiple sorting sequence so used comparator interface
//in comparable we only sort once so used comparator
public class StudentScoreSorter implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getStudentScore() > o2.getStudentScore())
			return -1;
		else
			return 1;
	}
	
	

	

}
