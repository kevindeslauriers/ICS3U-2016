package com.bayviewglen.dayone;

import java.text.DecimalFormat;

public class Time {
	private int minutes;
	private double seconds;
	private static DecimalFormat milliSecondFormatter = new DecimalFormat("00.000");
	
	public Time(int minutes, double seconds) {
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public Time(String timeAsString){
		try{
			String[] temp = timeAsString.split(":");
			minutes = Integer.parseInt(temp[0]);
			seconds = Double.parseDouble(temp[1]);
		}catch(Exception ex){
			throw new IllegalArgumentException(timeAsString + " is not in the format mm:ss.sss");
		}
	}
	
	private Time(){
		
	}
	
	public Time(double timeInSeconds) {
		this.minutes = (int)timeInSeconds / 60;
		this.seconds = timeInSeconds - this.minutes * 60;
	}

	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public double getSeconds() {
		return seconds;
	}
	public void setSeconds(double seconds) {
		this.seconds = seconds;
	}
	
	public static Time difference(Time t2, Time t1){
		double diff = convertToSeconds(t2) - convertToSeconds(t1);
		
		return new Time(diff);
	}
	
	private static double convertToSeconds(Time t){
		return t.minutes * 60 + t.seconds;
	}
	
	public String toString(){
		return minutes + ":" + milliSecondFormatter.format(seconds);
	}
	
}
