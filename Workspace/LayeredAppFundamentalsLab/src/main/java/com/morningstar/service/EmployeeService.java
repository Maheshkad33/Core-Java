package com.morningstar.service;

import java.util.List;

import com.morningstar.model.Employee;

public interface EmployeeService {
	
	public boolean addEmployee(Employee emp);
	public List<Employee> readAllEmployees();
	public Employee findById(int id);
	public Employee findByName(String name);
	public boolean deleteEmployees(int id);
	public boolean updateEmployee(int id);
	

}
