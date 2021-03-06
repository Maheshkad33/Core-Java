package com.morningstar.Dao;


import java.sql.SQLException;
import java.util.List;

import com.morningstar.entities.Employee;

public interface EmployeeDao {
	
		public void addEmployee(Employee emp) throws SQLException;
		public List<Employee> readAllEmployees () throws SQLException;
		public Employee findById(int id) throws SQLException;
		public Employee findByName(String name) throws SQLException;
		public void deleteEmployee(int id) throws SQLException;
		public Employee updateEmployee(int id) throws SQLException;

	}


