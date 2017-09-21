package com.bayviewglen.dayseven;

public class ExampleOne {

	public static void main(String[] args) {
		int x = 7;
		int y = 8;	// int and double and boolean are primitive types
		
		System.out.println("x: " + x);  // prints x: 7
		System.out.println("y: " + y);  // prints y: 8
		System.out.println();
		x++;							// x = x + 1;
		y--;							// y = y - 1;
		
		System.out.println("x: " + x);  // prints x: 8
		System.out.println("y: " + y);	// prints y: 7
		System.out.println();
		
		++x;							// x = x + 1;
		--y;							// y = y - 1;
		
		System.out.println("x: " + x);	// prints x: 9
		System.out.println("y: " + y);  // prints y: 6
		System.out.println();
		
		System.out.println("x: " + x++);	// prints x: 9
		System.out.println("y: " + y--);	// prints y: 6
		System.out.println();
		
		System.out.println("x: " + ++x);	// prints x: 11
		System.out.println("y: " + --y);	// prints y: 4
		System.out.println();
		
		System.out.println("x: " + x);	// prints x: 11
		System.out.println("y: " + y);	// prints y: 4
		System.out.println();
		
		
	}

}
