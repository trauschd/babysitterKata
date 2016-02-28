package com.babysitter;

public class SimpleTime {
	public static final boolean AM = true;
	public static final boolean PM = false;
	
	private int hour;
	private boolean isAm;	
	
	public SimpleTime(int hour, boolean isAm){
		this.hour = hour;
		this.isAm = isAm;
	}

	public int getHour() {
		return hour;
	}

	public boolean isAm() {
		return isAm;
	}
}
