/*
 * Write a program to calculate the slope of a line give (x1, y1) and (x2,y2).
 */
package com.bayviewglen.daythree;

public class Homework4 {

	public static void main(String[] args) {
		double x1, y1, x2, y2;
		double slope;
		
		x1 = 3.1;
		y1 = 2.2;
		
		x2 = 5.2;
		y2 = -3.4;
		
		slope = (y2 - y1)/(x2 - x1);
		
		System.out.println("The slope of the two points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + slope + ".");

	}

}
