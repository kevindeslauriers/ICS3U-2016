/*
 * Example: While Loop without an if statement.
 * 
 * Write a program that will sum all of numbers between two numbers that the user enters.
 * 
 */
package com.bayviewglen.dayone;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Two numbers please: ");
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		
		int low, high;
		if (x > y){
			low = y;
			high = x;
		}else{
			low = x;
			high = y;
		}
		
		int sum = 0;
		int i = low;
		while(i<=high){
			sum += i;
			i++;
		}
		System.out.println(sum);
		
	}

}
