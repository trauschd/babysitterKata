package com.babysitter;

public class SimpleTimeToTwentyFourHourConverter {

	public int convertToTwentyFourHours(SimpleTime simpleTime) {
		int twentyFourHours = simpleTime.getHour();
		
		if(simpleTime.isAm() && twentyFourHours == 12){
			twentyFourHours = 0;
		} else if(!simpleTime.isAm()){
			twentyFourHours += 12;
		}
		
		
		return twentyFourHours;
	}

}
