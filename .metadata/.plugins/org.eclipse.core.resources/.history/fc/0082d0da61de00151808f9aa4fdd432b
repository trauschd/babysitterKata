package com.babysitter;

public class BabysitterWageCalculator {
	private static final int FIVE_PM = 17;
	private static final int FOUR_AM = 4;
	private static final int TWELVE_AM = 24;
	
	private static final int START_PAY = 12;
	private static final int BED_PAY = 8;
	private static final int MIDNIGHT_PAY = 16;

	public int calculateBabysitterWages(SimpleTime startTime, SimpleTime endTime, SimpleTime bedTime) throws ValidationException {
		SimpleTimeToTwentyFourHourConverter converter = new SimpleTimeToTwentyFourHourConverter();
		int startTime24 = converter.convertToTwentyFourHours(startTime);
		int endTime24 = converter.convertToTwentyFourHours(endTime);
		int bedTime24 = converter.convertToTwentyFourHours(bedTime);
		
		return calculateBabysitterWagesInTwentyFourHourTime(startTime24, endTime24, bedTime24);
	}

	public int calculateBabysitterWagesInTwentyFourHourTime(int startTime, int endTime, int bedTime) throws ValidationException {
		validateStartTimeAndEndTime(startTime, endTime);
		
		int totalPay = 0;
		totalPay += calculateStartTimePay(startTime, bedTime);
		totalPay += calculateBedTimePay(bedTime);
		totalPay += calculateMidnightPay(endTime);
		
		return totalPay;
	}

	private void validateStartTimeAndEndTime(int startTime, int endTime) throws ValidationException {
		if(startTime < FIVE_PM)
			throw new ValidationException();
		
		if(endTime > FOUR_AM)
			throw new ValidationException();
	}
	
	private int calculateStartTimePay(int startTime, int bedTime) {
		return (bedTime - startTime) * START_PAY;
	}
	
	private int calculateBedTimePay(int bedTime) {
		return (TWELVE_AM - bedTime) * BED_PAY;
	}

	private int calculateMidnightPay(int endTime) {
		return endTime * MIDNIGHT_PAY;
	}
	
}
