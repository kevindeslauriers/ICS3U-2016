/*
 * Create a program that can solve the equation y = ax2+bx+c given a, b, c and x.
 */
package com.bayviewglen.daythree;

public class Homework3 {

	public static void main(String[] args) {
		double a, b, c, x;
		double y;
		
		a = 3.2;
		b = 4.3;
		c = 5.3;
		
		x = 2.5;
		
		y = a*x*x + b*x + c;
		
		System.out.println("y = " + a + "x^2 + " + b + "x + " + c + "\n\nwhere x is " + x + " is:\n\ny = " + y);
		
		

	}

}
