/*
 * Looked at some of the 'quirky' things about concatenation.
 */

package com.bayviewglen.daythree;

public class ExampleThree {

	public static void main(String[] args) {
		int x = 1;		// declared x and initialized in the same line
		int y = 2;

		System.out.println(x + y + " are my values");		// starts with integer math
		System.out.println("" + x + y + " are my values");	// concatenate "" with x to start
		System.out.println(x + " " + y + " are my values");	// concatenate x with " ' to start
		System.out.println(x + (y + " are my values"));		// BEDMAS applies
	}

}
