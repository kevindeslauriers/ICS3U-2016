/*
 * A 10 kilogram object is traveling at 12 meters per second. Compute and print its momentum.
 * (momentum is mass times velocity)
 */
package com.bayviewglen.daysix;

public class Homework6 {

	public static void main(String[] args) {
		int mass = 10;
		int velocity = 12;
		
		int momentum = mass * velocity;
		
		System.out.println("The momentum of the object is " + momentum + " kg*m/s");

	}

}
