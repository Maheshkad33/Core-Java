package lab5;

import java.util.ArrayList;
import java.util.Iterator;

public class Employeedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> employee  = new ArrayList<Employee>();
		
		Employee emp1 = new Employee(101, "Mahesh", "Pune", 50000);
		Employee emp2 = new Employee(102, "Mikey", "Mumbai", 30000);
		Employee emp3 = new Employee(103, "John", "Germany", 100000);
		
		employee.add(emp1);
		employee.add(emp3);
		employee.add(emp2);
		
		System.out.println(employee);
		
		int searchId = 102;
		
		Iterator<Employee> itr = employee.iterator();
		while (itr.hasNext()) {
			
			Employee e = itr.next();
			 e.getEmpId();
			
			if ( e.getEmpId()== searchId)
			{
				System.out.println("Employee Contain in list");
				System.out.println(e);
			}
			
			
			
		}

	}}

