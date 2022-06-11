package com.morningstar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="emptab")
public class Employee {

		@Id
		@Column (name="employee_id")
		private int employeeId;
		@Column(name="employee_name")
		private String employeeName;
		@Column(name="employee_salary")
		private double salary;
		@Column(name="Department_id")
		private int departmentId;
		
		public Employee() {
			
		}
		
		public Employee(int employeeId, String employeeName, double salary, int departmentId) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.salary = salary;
			this.departmentId = departmentId;
		}

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public int getDepartmentId() {
			return departmentId;
		}

		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}
		
		
		
		

	}


