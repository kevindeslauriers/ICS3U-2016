package com.bayviewglen.dayone;

public class ExampleOne {

	public static void main(String[] args) {
		int x = 1, y = 2;
		
		String s = "alphabet";
		
		char answer = calc(x,y,s);
		
		System.out.println(answer);

	}

	// Precondition: a + b must be less than the length of the string
	// Postcontion: results the character at the index a + b;
	private static char calc(int a, int b, String message) {
		
		int sum = a + b;
		
		char result = message.charAt(sum);
		
		return result;
		
	}

}
