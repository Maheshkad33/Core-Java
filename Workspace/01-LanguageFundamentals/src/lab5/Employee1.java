package lab5;

public class Employee1 {
	
	private int empCode;
	private String name;
	private String address;
	private String salary;
	
	
	public Employee1(int empCode, String name, String address, String salary) {
		super();
		this.empCode = empCode;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [empCode=" + empCode + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	

}
