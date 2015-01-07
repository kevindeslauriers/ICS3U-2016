package com.bayviewglen.dayone;

public class Examples {

	public static void main(String[] args) {
		
		// Declare an array called testScores of size 10;
		
		double[] testScores = new double[10];
		
		System.out.println(testScores[5]);	// displays what is in the sixth element - should be 0
		// Why? By default if you do not initialize a number it is 0 - ALWAYS
		
		// let's traverse the array - go through it and hit every element
		// another word for this is iterate the array
		
		// there are NO METHODS for an array because it is not a class/object
		// but there is 1 (one) property called length - in this case it is 10
		for (int i = 0; i < testScores.length; i++){
			System.out.println("Element at index " + i + " - " + testScores[i]);
		}
		
		// Create an array of primitives and initialise it in one step.
		
		String[] words = {"Hi", "Bye", "Another Word", "Happy", "New", "Year", "Justin", "Borrow", "Mayo", "Top"};
		
		for (int i = 0; i < words.length; i++){
			System.out.println("Element at index " + i + " - " + words[i]);
		}
		
		
		// Spit out all of the words with the letter t in it or T
		for (int i = 0; i < words.length; i++){
			String inLowerCase = words[i].toLowerCase();
			if (inLowerCase.indexOf('t')!=-1)
				System.out.println("Element at index " + i + " - " + words[i]);
			
		}
		
		System.out.println(search("Happy", words));
		
		System.out.println(search("Steve", words));
		
		int[] testMarks = {88, 99, 67, 87, 95, 99, 100};
		System.out.println(search(4, testMarks));
		
		System.out.println(search(67, testMarks));
		System.out.println(getAverage(testMarks));
	}
	
	public static int search(String findMe, String[] array){
		
		for (int i = 0; i < array.length; i++){
			if (array[i].equalsIgnoreCase(findMe)){
				return i;
			}
		}
			
		return -1;
	}	
	
	public static int search(int findMe, int[] array){
		
		for (int i = 0; i < array.length; i++){
			if (array[i] == findMe){
				return i;
			}
		}
			
		return -1;
	}
	
	public static double getAverage(int[] array){
		int sum = 0;
		for (int i = 0; i < array.length; i++){
			sum += array[i];
		}
			
		return (double)sum/array.length;
	}
}
