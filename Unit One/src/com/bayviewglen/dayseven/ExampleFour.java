package com.bayviewglen.dayseven;

import java.util.Random;

public class ExampleFour {

	public static void main(String[] args) {
		double x = Math.random(); 	// returns a double in the following range [0,1)
		// [ inclusive
		// ( exclusive
		// 0 -> 0.999999999999
		
		// Math.random() calls the random method directly through the class
		System.out.println(x);
		
		Random random = new Random();	// Random is a class that generates random numbers
										// to use it you must construct a random object
										// the word new is reserved for constructing/creating 
										// instances of a class (ie. we have also done it
										// with the Scanner)
		
		double y = random.nextDouble();	// nextDouble is called not through the Random class but through
										// one of its objects we created using new
		System.out.println(y);
		
		int z = random.nextInt(12);		// returns an int [0,12) 
										// random.nextInt(n)    returns an int [0, n)
		System.out.println(z);
		
		
		
		/* Get a random number in the range [-10, 10] */
		int r = random.nextInt(21) - 10;		// 21 represents the number of unique integers
		System.out.println(r);					// and -10 represents the lower limit
		
		int s = (int)(Math.random()*21) - 10;		// 21 represents the number of unique integers
		System.out.println(s);					// and -10 represents the lower limit
		
		int q = (int)(random.nextDouble()*21) - 10;		// 21 represents the number of unique integers
		System.out.println(q);					// and -10 represents the lower limit
	
		
	}

}
