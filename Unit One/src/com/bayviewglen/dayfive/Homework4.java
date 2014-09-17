/*
 * 	Create a program that can be used to calculate the final velocity of a car given the initial velocity,
 *  the acceleration of the car and the time that has elapsed using the following equation:
 *					
 *					velocityFinal = velocityInitial + acceleration * time
 */

package com.bayviewglen.dayfive;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter an initial velocity of the car (in m/s): ");
		double velocityInitial = keyboard.nextDouble();
		
		System.out.print("Please enter an acceleration of the car (in m/s^2): ");
		double acceleration = keyboard.nextDouble();
		
		System.out.print("Please enter the time elapsed (in s): ");
		double time = keyboard.nextDouble();
		
		double velocityFinal = velocityInitial + acceleration * time;
		
		System.out.println("The final velocity of the car is " + velocityFinal + " m/s.");
		
		keyboard.close();

	}

}
