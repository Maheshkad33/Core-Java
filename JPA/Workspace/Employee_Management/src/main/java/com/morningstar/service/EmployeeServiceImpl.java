package com.morningstar.service;

import java.sql.SQLException;
import java.util.List;

import com.morningstar.Dao.EmployeeDao;
import com.morningstar.Dao.EmployeeDaoimpl;

import com.morningstar.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao = null;

	public EmployeeDao getDao() {
		return dao;
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean addEmployee(Employee emp) {

		try {
			dao.addEmployee(emp);
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
//	public List<Employee> readAllEmployees() {
//		
//		List<Employee> list = null;
//		try {
//			 list = dao.readAllEmployees();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list;
//	}

	@Override
	public Employee findById(int id) {
		Employee employee = null;
		try {
			employee = dao.findById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return employee;
	}

	@Override
	public Employee findByName(String name) {
		Employee employee = null;
		try {
			 employee = dao.findByName(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public boolean deleteEmployees(int id) {
		try {
			 dao.deleteEmployee(id);
			
				return true;
			

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateEmployee(int id) {
		try {
			Employee emp = dao.findById(id);
			Employee result = dao.updateEmployee(id);
			
				return true;
			

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

}
