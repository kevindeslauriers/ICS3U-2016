/* Math Class 
 *  Math.PI
 *  Math.pow(base, exponent)	-> Can take double as both the base and the exponent and returns a double as the answer
 *  Math.sqrt(number)			-> Can take a double and returns the square root
 *  Math.abs(number)			-> Returns the absolute value of the number -> there is an integer and double version 
 *  							-> Math.abs(-2) returns 2
 *  							-> Math.abs(-2.0) returns 2.0
 */
package com.bayviewglen.dayone;

public class ExampleOne {

	public static void main(String[] args) {
		int x = 2;
		int y = -2;
		double z = -2.0;
	
		
		
		System.out.println(x);
		System.out.println(Math.sqrt(x));
		
		System.out.println(y);
		System.out.println(Math.abs(y));
		
		System.out.println(z); // comment
		System.out.println(Math.abs(z));
		
		System.out.println(Math.sqrt(z));
		System.out.println(Math.sqrt(y));
		// System.out.println(Math.sqrt("Shon"));	// There is not a sqrt method/function that accepts Strings as arguments/parameters
		
		System.out.println(Math.sqrt(Math.abs(z)));
		
		System.out.println(Math.pow(z,2));
		System.out.println(Math.pow(z,-2));
		System.out.println(Math.pow(z, 1.2));	// because 1.2 is a radical
		System.out.println(Math.pow(Math.abs(z), 1.2));	// because 1.2 is a radical
		
		System.out.println(Math.PI);
		System.out.println(Math.ceil(Math.PI));
		System.out.println(Math.floor(Math.PI));
		System.out.println(Math.round(Math.PI));
		
		
	}

}
