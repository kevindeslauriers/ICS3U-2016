/*
 * Declaring a Scanner to read input from the Keyboard.
 * 
 * Reading double data.
 * 
 * Calculate the Surface Area of a box.  
 * 
 * You must prompt the user of the length and width of the base and the height of the box - these can have a decimal.
 * 
 * You can assume the box has a lid.
 */

package com.bayviewglen.dayfive;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		double length, width, height;
		double surfaceArea;
		
		System.out.print("Please enter the length: ");
		length = in.nextDouble();
		
		System.out.print("Please enter the width: ");
		width = in.nextDouble();
		
		System.out.print("Please enter the height: ");
		height = in.nextDouble();
		
		surfaceArea = (2 * length * width) + (2 * width * height) + (2 * length * height);
		
		System.out.println("The surface area of a box with (width, length, height) of (" + width + ", " + length + ", "+ height + ") is "  + surfaceArea);
		
		
		

	}

}
