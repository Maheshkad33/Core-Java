package com.morningstar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CubeSumTest {

	CubeSum target = null;
	@Before
	public void setup() {
		target = new CubeSum();
	}
	
	@After
	public void teardown() {
		target=null;
	}
	
	@Test
	public void testSumOfDigitShouldReturnOfCube() {
		int result = target.sum(105);
		assertEquals(126, result);}

}
