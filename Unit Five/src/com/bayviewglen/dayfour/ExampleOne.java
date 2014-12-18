package com.bayviewglen.dayfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		sampleOne();
		sampleTwo();
		int playerPoints = 11;	// A,A,9
		int playerNumAces = 2;
		
		int dealerPoints = 19;	// A, 7, Q, A
		int dealerNumAces = 2;
		
		System.out.println("Dealer: " + calculateScore(dealerPoints, dealerNumAces));
		System.out.println("Player: " + calculateScore(playerPoints, playerNumAces));
		
		if (calculateScore(dealerPoints, dealerNumAces) > calculateScore(playerPoints, playerNumAces)){
			System.out.println("Dealer Wins!");
		}else {
			System.out.println("Player Wins!");
		}
		
		
		
	}
	
	private static int calculateScore(int currentTotal, int numAces) {
		int score = currentTotal;
		
		for (int i=0; i<numAces; ++i){
			if (score + 10 <=21)
				score+=10;
		}
		
		return score;
	}

	public static void sampleOne(){
		String fName = "input/data2222.dat";
		int sum = 0;
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(fName));
			while(scanner.hasNext()){
				int x = scanner.nextInt();
				sum += x;
			}
			
			System.out.println(sum);
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		} finally{
			if (scanner != null){
				scanner.close();
			}
		}
	}
	
	public static void sampleTwo(){
		String fName = "input/data2.dat";
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(fName));
			int num = Integer.valueOf(scanner.nextLine());
			
			String word = "";
			for (int i = 0; i<num; i++){
				word += scanner.nextLine();
			}
			
			System.out.println(word);
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		} finally{
			if (scanner !=null)
				scanner.close();
		}
	}

}
