package com.babysitter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SimpleTimeToTwentyFourHourConverterTest {
	private SimpleTimeToTwentyFourHourConverter converter = new SimpleTimeToTwentyFourHourConverter();
	
	@Test
	public void whenConverting12AM_convertsTo0() throws Exception {
		int toTwentyFourHours = converter.convertToTwentyFourHours(new SimpleTime(12, true));
		assertEquals(0, toTwentyFourHours);
	}
	
	@Test
	public void whenConverting11AM_convertsTo11() throws Exception {
		int toTwentyFourHours = converter.convertToTwentyFourHours(new SimpleTime(11, true));
		assertEquals(11, toTwentyFourHours);
	}
	
	@Test
	public void whenConverting11PM_convertsTo23() throws Exception {
		int toTwentyFourHours = converter.convertToTwentyFourHours(new SimpleTime(11, false));
		assertEquals(23, toTwentyFourHours);
	}
}
