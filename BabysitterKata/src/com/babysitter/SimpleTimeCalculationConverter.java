package com.babysitter;

public class SimpleTimeCalculationConverter {

	public int convertToCalculationTime(SimpleTime simpleTime) {
		int calcTime = simpleTime.getHour();
		
		if(simpleTime.isAm() && calcTime != 12){
			calcTime += 12;
		}
				
		return calcTime;
	}

}
