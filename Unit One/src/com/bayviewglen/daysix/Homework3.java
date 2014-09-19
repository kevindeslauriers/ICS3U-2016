/*
 * Compute and print the number of minutes in a year.
 */

package com.bayviewglen.daysix;

public class Homework3 {

	public static void main(String[] args) {
		int minutesPerHour = 60;
		int hoursPerDay = 24;
		int daysPerYear = 365;
		
		int minutesPerYear = daysPerYear * hoursPerDay * minutesPerHour;
		
		System.out.println("The number of minutes in a year is " + minutesPerYear);
	}

}
