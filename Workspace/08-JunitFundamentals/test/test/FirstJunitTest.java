package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

//import static org.junit.Assert.*;

import org.junit.Test;

public class FirstJunitTest {
	
	@Before
	public void setup() {
		System.out.println("setup method");
	}
	
	@After
	public void teardown() {
		System.out.println("teardown method");
	}

	@Test
	public void test1() {
		System.out.println("Test case 1");
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		System.out.println("Test case 2");
		//fail("Not yet implemented");
	}
	
	@Test
	public void test3() {
		System.out.println("Test case 3");
		//Assert.fail("Not yet implemented");
	}

}
