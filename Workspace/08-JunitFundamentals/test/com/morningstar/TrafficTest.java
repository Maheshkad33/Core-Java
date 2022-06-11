package com.morningstar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TrafficTest {

	
	Traffic target = null;
	@Before
	public void setup() {
		target = new Traffic();
	}
	
	@After
	public void teardown() {
		target=null;
	}
	@Test
	public void testMainShouldReturnTrafficSignalInstrctionBasedOnColor() {
		
		String result = target.main("GreeN");
		assertEquals("Go", result);
		
		
	}

}
