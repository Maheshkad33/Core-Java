package com.morningstar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MonthsswitchcaseTest {

	Monthsswitchcase target = null;

	@Before
	public void setup() {
		target = new Monthsswitchcase();
	}

	@After
	public void teardown() {
		target = null;
	}

	
	@Test
	public void testMonthShouldReturnMonthName() {
		String result = target.month(1);
		assertEquals("January", result);
	}

}
