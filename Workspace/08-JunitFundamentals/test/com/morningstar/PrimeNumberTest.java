package com.morningstar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrimeNumberTest {

	PrimeNumber target = null;
	@Before
	public void setup() {
		target = new PrimeNumber();
	}
	
	@After
	public void teardown() {
		target=null;
	}
	
	
	@Test
	public void testIsPrimeShouldReturnNumberIsPrimeOrNot() {
		boolean result = target.isPrime(107);
		
		assertTrue(result);
	}

}
