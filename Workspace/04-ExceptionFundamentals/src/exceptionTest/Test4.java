package exceptionTest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class Parent{
	public void meth1() throws IOException{
		System.out.println("Parent");
	}
	public void meth2() throws IOException{
		System.out.println("Parent");
	}
	public void meth3() throws IOException{
		System.out.println("Parent");
	}
	public void meth4() throws IOException{
		System.out.println("Parent");
	}
	public void meth5() throws NullPointerException{
		System.out.println("Parent");
	}
}
class Child extends Parent{
	@Override
	public void meth1() throws IOException{
		System.out.println("Child");
	}
	@Override
	public void meth2() throws FileNotFoundException{
		System.out.println("Parent");
	}
	@Override
	public void meth3() //throws SQLException
	{
		System.out.println("Parent");
	}
	@Override
	public void meth4() {
		System.out.println("Parent");
	}
	public void meth5() throws ArrayIndexOutOfBoundsException{
		System.out.println("Parent");
	}
}


public class Test4 {
	public static void main(String[] args) {
		Parent p = new Parent();
		Parent c = new Child();
		try {
		p.meth1();
		c.meth1();
		c.meth2();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	
	}
}
