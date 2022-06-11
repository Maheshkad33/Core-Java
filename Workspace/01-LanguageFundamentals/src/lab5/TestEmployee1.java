package lab5;

import java.util.Iterator;

public class TestEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Employee1 emp1 = new Employee1(101, "Mahesh", "Pune", "25000");
		Employee1 emp2 = new Employee1(102, "Mikey", "Katraj", "35000");
		Employee1 emp3 = new Employee1(103, "John", "Germany", "250000");
//		Employee1 emp4 = new Employee1(104, "Sanket", "Kp", "32000");
//		Employee1 emp5 = new Employee1(105, "Nikhil", "Swargate", "45000");
		
		EmployeeDB empdb = new EmployeeDB();
		
		System.out.println("Employee Added In list: " + empdb.addEmployee(emp1));
		System.out.println("Employee Added In list: " + empdb.addEmployee(emp2));
		System.out.println("Employee Added In list: " + empdb.addEmployee(emp3));
//		empdb.addEmployee(emp4);
//		empdb.addEmployee(emp5);
		
		System.out.println("PaySlip of employee : " + empdb.showPaySlip(103));
		
		System.out.println("Employee Deleted  from list: " + empdb.deleteEmployee(emp3));
		
		
		System.out.println("PaySlip of employee : " + empdb.showPaySlip(103));
		
		if(empdb.getEmployee(102)!=null) {
			System.out.println(empdb.getEmployee(102));
		}
		else
			System.out.println("Employee not Found");
		
		Employee1 [] array = empdb.getAllEmployees();
		
		for (int i =0;i<array.length;i++)
		{
			System.out.println("Employee Details**********************");
			System.out.println(array[i]);
		}
	
	

}
}
