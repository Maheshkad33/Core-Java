package com.morningstar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringManipulationTest {
	
	 StringManipulation target = null;
	
	@Before
	public void setup() {
		target = new StringManipulation();
	}
	
	@After
	public void teardown() {
		target=null;
	}

	@Test
	public void testDoOperationShouldReturnConcatinationOfTwoString() {
		
		String result = target.doOperation("Morningstar", "+", "India");
		
		assertEquals("MorningstarIndia", result);
	}
	
	@Test
	public void testDoOperationShouldMinusSecondStringFromFirstName() {
		String result = target.doOperation("HelloWorld", "-", "World");
		assertEquals("Hello", result);
		assertEquals("Morningstar", target.doOperation("Morningstar", "-", "India"));
	
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDoOperationShouldThrowIlleagalArgumentException() {
		target.doOperation("Morningstar", "*", "India");
	}
}
