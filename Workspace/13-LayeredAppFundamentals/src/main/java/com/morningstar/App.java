package com.morningstar;

import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.model.Student;
import com.morningstar.service.StudentService;
import com.morningstar.service.StudentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	StudentServiceImpl service = new StudentServiceImpl();
    	StudentDao studentDao =  new StudentDaoImpl();
    	service.setDao(studentDao);
    	
    	Student student = new Student(103,"Shweta",80);
    	
    	boolean result = service.addStudent(student); 
    	if(result)
    		System.out.println("Student is added into databse");
    	else
    		System.out.println("Student is not added in database");
    
    }
}
