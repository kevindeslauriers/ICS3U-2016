/*
 * Find and print the area and perimeter of a rectangle that is 4.5 feet long and 2.3 feet wide.
 * Print both rounded to the nearest tenth of a foot.
 */
package com.bayviewglen.daysix;

public class Homework2 {

	public static void main(String[] args) {
		double length = 4.5;
		double width = 2.3;
		
		double area = length * width;
		double perimeter = 2*length + 2*width;
		
		double areaRounded = (int)(area * 10)/10.0;
		double perimeterRounded = (int)(perimeter * 10)/10.0;
		
		System.out.println("The area is: " + areaRounded);
		System.out.println("The perimeter is: " + perimeterRounded);
	}

}
