package com.morningstar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest2 {
	
	Calculator target = null;
	
	@Before
	public void setup() {
		 target = new Calculator();
	}
	
	@After
	public void teardown() {
		target = null;
	}

	@Test
	public void testAdditionShouldReturnSumOfTwoNumber() {
	
		int result = target.addition(1000, 2000);
		assertEquals(3000, result);
		assertEquals(1200, target.addition(1000, 200));
		assertEquals(1200, target.addition(1100, 100));
		assertEquals(1200, target.addition(1200, 0));
		
	}
	
	@Test
	public void testSumShouldReturnsSumofAllNumbers() {
		
		
		int result = target.sum(1,2,3,4);
		assertEquals(10, result);
		assertEquals(20, target.sum(3,17,0));
		assertEquals(15,target.sum(1,2,3,4,5));
		
	}
	
	
	//check exception test case pass or not 
	@Test (expected=IllegalArgumentException.class)
	public void testSumShouldThrowIllegalArgumentException() {
	
		
		target.sum(10);
	}


}
