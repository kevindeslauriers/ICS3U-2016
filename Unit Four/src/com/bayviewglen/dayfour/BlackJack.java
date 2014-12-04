package com.bayviewglen.dayfour;
import java.util.Locale;
import java.util.Scanner;


public class BlackJack {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean done = false;
		while (!done){
			int wallet = 500;
			String name = getUserName(s);
			
			String name1 = getUserName('c');
			Locale l = getLocale();
			int bet = getBet(wallet);
			
		}
	}

	private static String getUserName(char c) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	private static int getBet(int wallet) {
		return 0;
	}

	private static Locale getLocale() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static String getUserName(Scanner s){		// method overloading
		return null;
		
	}
	
	private static String getUserName(Integer i){		// method overloading
		return null;
		
	}

	private static String getUserName() {
		Scanner s = new Scanner(System.in);
		return getUserName(s);
		
	}

}
