package com.bayviewglen.dayone;

import java.util.Scanner;

public class tryCatchExample {

	public static void main(String[] args) {
		
		boolean validInput = false;
		Scanner s = new Scanner (System.in);
		

		while(!validInput ){
			System.out.print("Enter an integer: ");
			int temp = s.nextInt();
			int number = 0;
			
			/*try{
				number = Integer.parseInt(temp);
				validInput = true;
			}catch(NumberFormatException ex){
				System.out.println(temp + " is not a number on earth in any language.");
			}
			*/
		}
		
		System.out.println("I am happy!!!!");

	}

}
