package com.morningstar.service;

import java.util.List;

import com.morningstar.model.Student;

public interface StudentService {
	public boolean addStudent(Student student);
	public Student findByStudenId(int studentid);
	public List<Student> findAllStudents();
}
