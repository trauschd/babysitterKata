package com.babysitter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SimpleTimeCalculationConverterTest {
	private SimpleTimeCalculationConverter converter = new SimpleTimeCalculationConverter();
	
	@Test
	public void whenConverting12AM_convertsTo12() throws Exception {
		int calcTime = converter.convertToCalculationTime(new SimpleTime(12, true));
		assertEquals(12, calcTime);
	}
	
	@Test
	public void whenConverting11AM_convertsTo23() throws Exception {
		int calcTime = converter.convertToCalculationTime(new SimpleTime(11, true));
		assertEquals(23, calcTime);
	}
	
	@Test
	public void whenConverting11PM_convertsTo11() throws Exception {
		int calcTime = converter.convertToCalculationTime(new SimpleTime(11, false));
		assertEquals(11, calcTime);
	}
}
