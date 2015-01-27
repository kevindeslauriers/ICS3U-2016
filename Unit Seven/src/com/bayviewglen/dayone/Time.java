package com.bayviewglen.dayone;

import java.text.DecimalFormat;

public class Time {
	private int minutes;
	private double seconds;
	
	private static final DecimalFormat millisecondFormatter = new DecimalFormat("00.000");
	
	public Time(int minutes, double seconds){	// a constructor called when class is instantiated.
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public Time(){								// a constructor called when class is instantiated (default).
		this.minutes = 0;
		this.seconds = 0;
	}
	
	public Time(double timeInSeconds) {
		this.minutes = (int)timeInSeconds / 60;
		this.seconds = timeInSeconds - this.minutes * 60;	
	}
	
	// the string should be in the format of minutes:seconds
	public Time(String timeAsString){
		try{
			String[] parts = timeAsString.split(":");
			this.minutes = Integer.parseInt(parts[0]);
			this.seconds = Double.parseDouble(parts[1]);
		}catch(Exception ex){
			throw new IllegalArgumentException(timeAsString + " is not in the format of minutes:seconds." );
		}
		
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
	
	public String displayTime(){
		return minutes + ":" + millisecondFormatter.format(seconds);
	}
	
	public Time difference(Time t1, Time t2){
		double timeInSeconds = convertToSeconds(t2) - convertToSeconds(t1); 
		return new Time(timeInSeconds);
	}
	
	private double convertToSeconds(Time t){
		return t.minutes * 60 + t.seconds;
	}
	
	
	
}
