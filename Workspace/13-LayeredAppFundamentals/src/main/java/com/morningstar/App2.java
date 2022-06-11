package com.morningstar;

import java.util.List;

import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.model.Student;
import com.morningstar.service.StudentServiceImpl;

public class App2 {

	public static void main(String[] args) {
		
		StudentServiceImpl service = new StudentServiceImpl();
    	StudentDao studentDao =  new StudentDaoImpl();
    	service.setDao(studentDao);
    	
    	List<Student> list = service.findAllStudents();
    	for(Student student : list) {
    		System.out.println("STudentId: " + student.getStudentId());
    		System.out.println("StudentName: " + student.getStudentName());
    		System.out.println("StudentScore: " + student.getStudentScore());
    		System.out.println("-----------------------------------");
    	}
	}

}
