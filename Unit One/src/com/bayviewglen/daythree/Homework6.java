/*
 * Math.sqrt(x), where x is a value can be used to calculate the square root. 
 * Give an equation in the format from question 3.  Obtain the two roots.
 */
package com.bayviewglen.daythree;

public class Homework6 {

	public static void main(String[] args) {
		int a = 3, b = -20, c = -50;	// although these could be declared as doubles.
		
		double root1, root2;
		
		root1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
		root2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
		
		System.out.println("The roots are: " + root1 + " and " + root2);	// The roots are: 77.4341649025257 and -17.434164902525687

	}

}
