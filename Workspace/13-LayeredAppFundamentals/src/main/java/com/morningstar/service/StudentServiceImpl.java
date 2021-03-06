package com.morningstar.service;

import java.sql.SQLException;
import java.util.List;

import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.model.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao = null;

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean addStudent(Student student) {
		try {
			int result = dao.createStudent(student);
			if (result >= 1) {
				StudentDaoImpl.getConnection().commit();
				return true;
			}

		} catch (SQLException e) {
			try {
				StudentDaoImpl.getConnection().rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Student findByStudenId(int studentid) {

		Student student = null;
		try {
			student = dao.readStudent(studentid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return student;
		
		
	}

	@Override
	public List<Student> findAllStudents() {
		
		List<Student> list = null;
		try {
			 list = dao.readAllStudents();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
