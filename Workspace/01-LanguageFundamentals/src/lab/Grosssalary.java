package lab;

import java.util.Scanner;

public class Grosssalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Traine salary: ");
		int salary = sc.nextInt();
		
		double grossSalary=0;
		
	
		if(salary<=15000)
		{
			grossSalary += salary + (0.20*salary)+(0.70*salary);
		}
		
		else if(salary>15000 && salary<=30000)
		{
			grossSalary += salary + (0.35*salary)+(0.80*salary);
		}
		
		else if(salary>=30001)
		{
			grossSalary += salary + (0.20*salary)+(0.80*salary);
		}
		
		System.out.println("Gross Salary: " + grossSalary);
		}
	
		
	
		
	

}
