package lab6;

import java.util.Scanner;

@FunctionalInterface
interface Check{
	public boolean checkuserpass(String user,String pass);
}

public class UserLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName: ");
		String user1 = sc.next();
		System.out.println("Enter Password: ");
		String pass1 = sc.next();
		
		
		String username = "Mahesh@gmail.com";
		String password = "Mahesh@123";
		
		Check ref = (s1,s2)->{
			
			if(s1.matches(username) && s2.matches(password))
				return true;
			else
				return false;		
		};
		
		if(ref.checkuserpass(user1,pass1))
		{
			System.out.println("user login Successfully...!!!");
		}
		else
			System.out.println("Enter Valid UserName and PassWord");
	}

}
