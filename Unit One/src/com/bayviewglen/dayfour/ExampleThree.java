/*
 * Syntax Errors, Logic Errors and Runtime Errors
 */
package com.bayviewglen.dayfour;

public class ExampleThree {

	public static void main(String[] args) {
		
		
		/***************** SYNTAX ERRORS ********************/
		// Syntax Error is a compile error - those are the ones in red
		// Those are the ones that have mistakes in the syntax of the code (you used incorrect Java grammer)
		// The code does not make sense to the compiler
		// Java no UNDERSTAND!
		
		// integer x = 7;		integer is not a valid identifier in Java - syntax error - should be int
		
		/***************** LOGIC ERRORS ********************/
		// Does Compile
		// Does NOT crash the program (runtime error)
		
		// AreaOfCircle = 2*Math.PI*radius 	is a Logic error - because the equation is WRONG!
		// This is a BUG
		
		/***************** RUNTIME ERRORS ********************/
		// Crash during runtime
		
		int x = 3/0;
		
		
		
		

	}

}
