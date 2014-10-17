package com.bayviewglen.dayfour;

import java.util.Scanner;

public class QuestionC {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		
		int range = Math.abs(y - x);
		int lowerBound = Math.min(x, y);
		int upperBound = Math.max(x, y);
		
		int randomNum = (int)(Math.random() * range) + lowerBound;
		
		System.out.println("A random number between " + lowerBound + " and " + upperBound + " is " + randomNum);
		
		keyboard.close();
	}

}
