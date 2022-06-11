package lab5;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {
	
	ArrayList<Employee1> list = new ArrayList<Employee1>();
	
	public boolean  addEmployee (Employee1 e) {
		
		return list.add(e);
	}
	
	public boolean deleteEmployee(Employee1 e) {
		return list.remove(e);
	}
	
	public String showPaySlip (int ecode) {
		
		Iterator<Employee1> itr = list.iterator();
		while(itr.hasNext()) {
			
			Employee1 emp = itr.next();
			
			if(emp.getEmpCode()==ecode)
			{
				return emp.getSalary();
			}
			
		}
		
			String s = "Emp not found";
			return s;
		
		
	}
	
	public Employee1 getEmployee(int ecode) {
		
		Iterator<Employee1> itr = list.iterator();
		while(itr.hasNext()) {
			
			Employee1 emp = itr.next();
			
			if(emp.getEmpCode()==ecode)
			{
				return emp;
			}
			
		}
		
		return null;
	}
	
	public Employee1 [] getAllEmployees() {
		Employee1 [] arr = (Employee1[]) list.toArray();
		return arr;
		
	}
	

}
