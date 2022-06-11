package com.morningstar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		
			String sql  = "Select Employee_Id,Last_Name,Salary from Employees";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int employeeId =  rs.getInt("Employee_Id");
				String employeeName = rs.getString("Last_Name");
				double salary = rs.getDouble("Salary");
				System.out.println("Employee ID = " + employeeId);
				System.out.println("Employee Name = " + employeeName);
				System.out.println("Employee salary = " + salary);
				System.out.println("------------------------------------");
			
			}
			
			
		
		
		} catch (ClassNotFoundException  | SQLException e) {

			System.out.println("There is problem related to database");
		} 

		


	}

}
