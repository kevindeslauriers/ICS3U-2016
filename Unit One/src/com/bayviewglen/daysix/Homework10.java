/*
 * Given the length and width of a rectangle, print its perimeter and area.
 */
package com.bayviewglen.daysix;

import java.util.Scanner;

public class Homework10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the length: ");
		double length = keyboard.nextDouble();

		System.out.print("Please enter the width: ");
		double width = keyboard.nextDouble();

		double area = length * width;
		double perimeter = 2 * length + 2 * width;

		double areaRounded = (int) (area * 10) / 10.0;
		double perimeterRounded = (int) (perimeter * 10) / 10.0;

		System.out.println("The area is: " + areaRounded);
		System.out.println("The perimeter is: " + perimeterRounded);

		keyboard.close();
	}

}
