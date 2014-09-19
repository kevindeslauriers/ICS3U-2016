/*
 * The kinetic energy of a moving object is given by the formula:
 * 
 * KE = 1/2mv^2
 * 
 * Given the mass (m) and speed v of an object, find its kinetic energy. 
 */
package com.bayviewglen.daysix;

import java.util.Scanner;

public class Homework11 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the mass of the object: ");
		double mass = keyboard.nextDouble();
		
		System.out.print("Please enter the velocity of the object: ");
		double velocity = keyboard.nextDouble();

		double kineticEnergy = 0.5 * mass * velocity * velocity;

		System.out.println("The kinetic energy of the object is "
				+ kineticEnergy + " J");

		keyboard.close();
	}

}
