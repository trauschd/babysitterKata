package com.babysitter;

import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BabysitterWageCalculatorTest {
	
	private BabysitterWageCalculator calc = new BabysitterWageCalculator();
	
	@Test
	public void whenCallingCalculator_convertsToTwentyFourTime() throws Exception {
		SimpleTime startTime = new SimpleTime(5, false);
		SimpleTime endTime = new SimpleTime(3, true);
		SimpleTime bedTime = new SimpleTime(10, false);
		
		BabysitterWageCalculator calcSpy = spy(calc);
		calcSpy.calculateBabysitterWages(startTime, endTime, bedTime);
		verify(calcSpy).calculateBabysitterWagesInTwentyFourHourTime(17, 3, 22);
	}
}
