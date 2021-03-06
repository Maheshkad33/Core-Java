package com.morningstar.Dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.morningstar.entities.Employee;

public class EmployeeDaoimpl implements EmployeeDao {

	private static EntityManagerFactory factory = null;

	private static EntityManager em = null;

	public static EntityManager getEntityManager() {
		return em;
	}

	static {
		factory = Persistence.createEntityManagerFactory("JPA-PU");
		em = factory.createEntityManager();
	}

	@Override
	public void addEmployee(Employee emp) throws SQLException {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(emp);
		getEntityManager().getTransaction().commit();
		System.out.println("Data added ..");
	}

	@Override
	public List<Employee> readAllEmployees() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findById(int id) throws SQLException {
		getEntityManager().getTransaction().begin();
		Employee emp1 = getEntityManager().find(Employee.class, id);
		getEntityManager().getTransaction().commit();
		System.out.println("Find by ID ..");
		return emp1;

	}

	@Override
	public Employee findByName(String name) throws SQLException {
		getEntityManager().getTransaction().begin();
		Employee emp1 =getEntityManager().find(Employee.class,"'" + name + "'");
		getEntityManager().getTransaction().commit();
		System.out.println("Find by ID ..");
		return emp1;
	}

	@Override
	public void deleteEmployee(int id) throws SQLException {
		getEntityManager().getTransaction().begin();
		Employee emp1 = getEntityManager().find(Employee.class, id);
		 getEntityManager().remove(emp1);
		getEntityManager().getTransaction().commit();
		System.out.println("delete by ID ..");
	}

	@Override
	public Employee updateEmployee(int id) throws SQLException {
		getEntityManager().getTransaction().begin();
		Employee emp1 = getEntityManager().find(Employee.class, id);
		System.out.println("empname= ");
		Scanner sc =  new Scanner(System.in);
		emp1.setEmployeeName(sc.next());
		System.out.println("empsal= ");
		emp1.setSalary(sc.nextInt());
		System.out.println("Deptid= ");
		emp1.setDepartmentId(sc.nextInt());
		Employee employee = getEntityManager().merge(emp1);
		getEntityManager().getTransaction().commit();
		System.out.println("updated by ID ..");
		return employee;
	}

}
