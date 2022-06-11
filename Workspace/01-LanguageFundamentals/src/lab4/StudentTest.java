package lab4;

public class StudentTest {
	
	
	
	public static double totalFees(Student s [])
	{
		double sum=0;
		for(int i=0;i<s.length;i++)
		{
			
			sum += s[i].getFees();
			
		}
		return sum;
	}
	

	public static void displayStudent(Student s []) {
		
		for(int i=0;i<s.length;i++)
		{
			String course = s[i].getCourse();
			if(course=="Java")
			{
				System.out.println("Java Student INFO ******************");
				System.out.println("ID: "+ s[i].getStudentID());
				System.out.println("Name: " + s[i].getName());
				System.out.println("contact No; "+ s[i].getContactNo());
				System.out.println("Course Fees: " + s[i].getFees());
			}	
		}
		
		for(int i=0;i<s.length;i++)
		{
			String course = s[i].getCourse();
			if(course=="Dotnet")
			{
				System.out.println("Dotnet Student INFO ******************");
				System.out.println("ID: "+ s[i].getStudentID());
				System.out.println("Name: " + s[i].getName());
				System.out.println("contact No; "+ s[i].getContactNo());
				System.out.println("Course Fees: " + s[i].getFees());
			}	
		}
		
		
	}


	public static void main(String[] args) {
		
		Student Stud [] = new Student [5];

		Stud[0]  = new Student(101,"Mahesh",123447,"Java",10000) ;
		Stud[1]    = new Student(102,"Sanket",123445,"Dotnet",8000) ;
		Stud[2]    = new Student(103,"Ranajit",123496,"Java",10000) ;
		Stud[3]   = new Student(104,"Ajinkya",127896,"Dotnet",8000) ;
		Stud[4]    = new Student(105,"Sagar",126546,"Java",10000) ;
		
		
		displayStudent(Stud);
		
		System.out.println("Total Fees Of students: " + totalFees(Stud) );
		
		
	}

}
