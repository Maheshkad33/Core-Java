package com.morningstar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.morningstar.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static Connection connection = null;

	public static Connection getConnection() {
		return connection;
	}

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			connection.setAutoCommit(false);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("There is Some Problem");
			e.printStackTrace();// log the stack trace
		}

	}

	@Override
	public int addEmployee(Employee emp) throws SQLException {

		String sql = "Insert Into emptab (Employee_Id,Employee_Name,Employee_salary,Department_Id) values (?,?,?,?)";

		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, emp.getEmployeeId());
		pstmt.setString(2, emp.getEmployeeName());
		pstmt.setDouble(3, emp.getSalary());
		pstmt.setInt(4, emp.getDepartmentId());

		int result = pstmt.executeUpdate();
		pstmt.close();
		return result;
	}

	@Override
	public List<Employee> readAllEmployees() throws SQLException {
		String sql = "Select Employee_Id, Employee_Name , Employee_salary ,Department_Id from emptab";
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		List<Employee> list = new ArrayList<>();
		while (rs.next()) {
			int empId = rs.getInt("Employee_Id");
			String emp_Name = rs.getString("Employee_Name");
			double sal = rs.getDouble("Employee_salary");
			int deptId = rs.getInt("Department_Id");
			Employee employee = new Employee(empId, emp_Name, sal, deptId);
			list.add(employee);
		}
		return list;
	}

	@Override
	public Employee findById(int id) throws SQLException {
		String sql = "select * from emptab where Employee_Id =" + id;
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Employee employee = null;
		while (rs.next()) {
			int empId = rs.getInt("Employee_Id");
			String emp_Name = rs.getString("Employee_Name");
			double sal = rs.getDouble("Employee_salary");
			int deptId = rs.getInt("Department_Id");
			employee = new Employee(empId, emp_Name, sal, deptId);
		}
		stmt.close();
		return employee;
	}

	@Override
	public Employee findByName(String name) throws SQLException {
		String sql = "select * from emptab where Employee_Name = " + "'" + name + "'";
		System.out.println(sql);
		Statement stmt = connection.createStatement();

		ResultSet rs = stmt.executeQuery(sql);
		Employee employee =null;
		while (rs.next()) {
			int empId = rs.getInt("Employee_Id");
			String emp_Name = rs.getString("Employee_Name");
			double sal = rs.getDouble("Employee_salary");
			int deptId = rs.getInt("Department_Id");
			 employee = new Employee(empId, emp_Name, sal, deptId);

		}
		stmt.close();
		return employee;
	}

	@Override
	public int deleteEmployee(int id) throws SQLException {
		String sql = "delete from emptab where Employee_Id = " + id;
		PreparedStatement pstmt = connection.prepareStatement(sql);
		int result = pstmt.executeUpdate();
		pstmt.close();
		return result;

	}

	@Override
	public int updateEmployee(int id) throws SQLException {
		String sql = "update emptab set Employee_Name = ?,Employee_salary = ?,Department_Id = ? where Employee_Id = ?";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		Scanner sc = new Scanner(System.in);
		System.out.println("EmployeeName:");
		String name = sc.next();

		System.out.println("salary");
		double sal = sc.nextDouble();
		System.out.println("DepartmentId: ");
		int deptid = sc.nextInt();

		pstmt.setString(1, name);
		pstmt.setDouble(2, sal);
		pstmt.setInt(3, deptid);
		pstmt.setInt(4, id);
		System.out.println("------");

		int result = pstmt.executeUpdate();

		pstmt.close();
		return result;

	}

}
