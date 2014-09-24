package com.bayviewglen.dayeight;

public class ExmapleOne {

	public static void main(String[] args) {
		byte x = 0b01111111;
		byte y = 0b00000111;
		
		System.out.println((byte)(x+y));		// -122 = - (128 - 6) since 6 = 0000110 represents 6 and you get 10000110
		

	}

}
