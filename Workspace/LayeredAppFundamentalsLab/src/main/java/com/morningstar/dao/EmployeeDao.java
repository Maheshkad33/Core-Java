package com.morningstar.dao;

import java.sql.SQLException;
import java.util.List;

import com.morningstar.model.Employee;

public interface EmployeeDao {
	
	public int addEmployee(Employee emp) throws SQLException;
	public List<Employee> readAllEmployees () throws SQLException;
	public Employee findById(int id) throws SQLException;
	public Employee findByName(String name) throws SQLException;
	public int deleteEmployee(int id) throws SQLException;
	public int updateEmployee(int id) throws SQLException;

}
