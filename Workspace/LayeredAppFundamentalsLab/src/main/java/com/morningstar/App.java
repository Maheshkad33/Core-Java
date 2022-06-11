package com.morningstar;

import java.util.List;
import java.util.Scanner;

import com.morningstar.dao.EmployeeDao;
import com.morningstar.dao.EmployeeDaoImpl;
import com.morningstar.model.Employee;

import com.morningstar.service.EmployeeServiceImpl;

public class App {

	public static Employee addEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmployeeId: ");
		int id = sc.nextInt();
		System.out.println("Enter EmployeeName: ");
		String name = sc.next();
		System.out.println("Enter Salary: ");
		double sal = sc.nextDouble();
		System.out.println("Enter DepartmentId: ");
		int deptid = sc.nextInt();
		Employee employee = new Employee(id, name, sal, deptid);
		return employee;
	}

	public static void main(String[] args) {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		service.setDao(employeeDao);

		System.out.println("Welcome To Employee Management");
		System.out.println("1.Add Employee \n" + "2.Read All Employees\n" + "3.Find by Id\n" + "4.Find By Name\n"
				+ "5.Delete Employee\n" + "6.Update Employee\n");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		boolean flag = false;

	do {
		switch (choice) {
		case 1: {
			boolean result = service.addEmployee(addEmployee());
			System.out.println("----");
			if (result)
				System.out.println("Employee is added into databse");
			else
				System.out.println("Employee is not added in database");

			break;

		}

		case 2: {
			List<Employee> list = service.readAllEmployees();
			for (Employee emp : list) {
				System.out.println("EMPId: " + emp.getEmployeeId());
				System.out.println("EMPName: " + emp.getEmployeeName());
				System.out.println("SALARY: " + emp.getSalary());
				System.out.println("DepartmentId: " + emp.getDepartmentId());
				System.out.println("-----------------------------------");
			}
			break;
		}

		case 3: {
			System.out.println("Enter Employee Id : ");
			int id = sc.nextInt();
			Employee emp = service.findById(id);
			System.out.println("EMPId: " + emp.getEmployeeId());
			System.out.println("EMPName: " + emp.getEmployeeName());
			System.out.println("SALARY: " + emp.getSalary());
			System.out.println("DepartmentId: " + emp.getDepartmentId());
			System.out.println("-----------------------------------");

			break;
		}

		case 4: {
			System.out.println("Enter EMployee_name: ");
			String name = sc.next();
			Employee emp = service.findByName(name);

			System.out.println("EMPId: " + emp.getEmployeeId());
			System.out.println("EMPName: " + emp.getEmployeeName());
			System.out.println("SALARY: " + emp.getSalary());
			System.out.println("DepartmentId: " + emp.getDepartmentId());
			System.out.println("-----------------------------------");

			break;

		}

		case 5: {
			System.out.println("Enter EmployeeId : ");
			int id = sc.nextInt();
			boolean result = service.deleteEmployees(id);
			System.out.println("----");
			if (result)
				System.out.println("Employee is deleted ");
			else
				System.out.println("Employee is not deleted");

			break;

		}

		case 6: {
			System.out.println("Enter EmployeeId : ");
			int id = sc.nextInt();
			boolean result = service.updateEmployee(id);
			System.out.println("----");
			if (result)
				System.out.println("Employee is updated ");
			else
				System.out.println("Employee is not updated");

			break;
		}

		default:
		{
			System.out.println("Enter valid choice");
		}	
		}
		
		System.out.println("Do you want to continue: ");
		String input = sc.next();
		if(input.equals("yes"))
		{
			flag=true;
		System.out.println("1.Add Employee \n" + "2.Read All Employees\n" + "3.Find by Id\n" + "4.Find By Name\n"
				+ "5.Delete Employee\n" + "6.Update Employee\n");
		choice = sc.nextInt();
		}
		if(input.equals("no"))
			flag = false;

	}while(flag!=false);
	
	}

}
