package lab;

import java.util.Scanner;

public class Floyds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
//		
//		for (int i =1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(" * ");
//}
//			System.out.print("\n");
//			}
		
		int i=1;
		
		while (i<=n)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(" * ");
				j++;
			}
			System.out.print("\n");
				i++;
			
		}

	}

}
