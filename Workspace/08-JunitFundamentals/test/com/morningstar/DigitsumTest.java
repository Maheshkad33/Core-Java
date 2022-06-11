package com.morningstar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DigitsumTest {
	
	Digitsum target = null;
	@Before
	public void setup() {
		target = new Digitsum();
	}
	
	@After
	public void teardown() {
		target=null;
	}

	@Test
	public void testSumOfDigitShouldReturnSumOfNumberDigit() {
		int result = target.sumOfDigit(1234);
		
		assertEquals(10, result);
	}

}
