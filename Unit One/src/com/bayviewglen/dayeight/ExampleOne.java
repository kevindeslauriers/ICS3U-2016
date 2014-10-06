package com.bayviewglen.dayeight;

public class ExampleOne {

	public static void main(String[] args) {
		byte x = 0b01001101;
		byte y = 0b01111000;
		
		System.out.println((byte)(x+y));		// -122 = - (128 - 6) since 6 = 0000110 represents 6 and you get 10000110
		System.out.println((x+y));		// -122 = - (128 - 6) since 6 = 0000110 represents 6 and you get 10000110
		

	}

}
