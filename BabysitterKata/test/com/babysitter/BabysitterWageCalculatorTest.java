package com.babysitter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
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
	
	
	@Test(expected = ValidationException.class)
	public void whenValidatingStartTime_throwsValidationException() throws Exception {
		calc.calculateBabysitterWagesInTwentyFourHourTime(4, 0, 0);
	}
	
	@Test(expected = ValidationException.class)
	public void whenValidatingEndTime_throwsValidationException() throws Exception {
		calc.calculateBabysitterWagesInTwentyFourHourTime(17, 5, 0);
	}
	
	@Test
	public void whenCalculatingPay_calculatesNonEdgeCases() throws Exception {
		int totalPay = calc.calculateBabysitterWagesInTwentyFourHourTime(17, 4, 20);

		int startingPay = 36;
		int bedtimePay = 32;
		int midnightPay = 64;
		
		int expectedPay = startingPay + bedtimePay + midnightPay;
		assertEquals(expectedPay, totalPay);
	}
}
