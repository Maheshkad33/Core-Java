package lab4;

public class Student {
	
	private int studentID;
	private String name;
	private double contactNo;
	private String course;
	private double fees;
	
	
	public Student(int studentID, String name, double contactNo, String course, double fees) {
		
		this.studentID = studentID;
		this.name = name;
		this.contactNo = contactNo;
		this.course = course;
		this.fees = fees;
	}
	
	public double getFees() {
		return fees;
	}
	
	

	public Student() {

	}

	public String getCourse() {
		return course;
	}

	public int getStudentID() {
		return studentID;
	}

	public String getName() {
		return name;
	}

	public double getContactNo() {
		return contactNo;
	}
}


