package com.bayviewglen.blackjack;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class BlackJack {
	String[] cards;
	int[] values;
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		initialiseCards();
		
		introduction();
		
		String userName = getUserName(scanner);
		while(!userName.equalsIgnoreCase("quit")){
			int wallet = 500;
			boolean done = false;
			NumberFormat formatter = getFormatter(scanner);
			 
			
			while(!done){
				wallet = playOneHand(scanner, wallet, formatter);
				
				done = (wallet == 0 || playAgain(scanner));
			}


			userName = getUserName(scanner);
		}


		closingMessage();
		scanner.close();
	}

	private static void initialiseCards() {
		// TODO Auto-generated method stub
		
	}

	private static NumberFormat getFormatter(Scanner scanner) {

		return NumberFormat.getCurrencyInstance(getLocale(scanner));
	}

	private static Locale getLocale(Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void closingMessage() {
		// TODO Auto-generated method stub
		
	}

	private static boolean playAgain(Scanner scanner) {
		// TODO Auto-generated method stub
		return false;
	}

	private static int playOneHand(Scanner scanner, int wallet, NumberFormat formatter) {
		int bet = getPlayerBet(scanner, wallet);
		String[] playerCards = new String[25];
		String[] dealerCards = new String[25];
		int numPlayerCards = 0;
		int numDealerCards = 0;
		int numPlayerAces = 0;
		int numDealerAces = 0;
		
		
		dealCard(playerCards);
		numPlayerCards++;
		if (isLastCardIsAnAce(playerCards[numPlayerCards-1])){
			numPlayerAces++;
		}
		
		return wallet; 
		
	}
	
	private static boolean isLastCardIsAnAce(String lastCard) {
		return lastCard.startsWith("A");
	}

	private static void dealCard(String[] playerCards) {
		// TODO Auto-generated method stub
		
	}

	private void display(NumberFormat formatter, int money){
		System.out.print(formatter.format(money));
	}

	private static int getPlayerBet(Scanner scanner, int wallet) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static String getUserName(Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void introduction() {
		// TODO Auto-generated method stub
		
	}
	
	private static int calculateScore(int currentTotal, int numAces) {
		int score = currentTotal;
		
		for (int i=0; i<numAces; ++i){
			if (score + 10 <= 21)
				score += 10;
		}
		
		return score;
	}
	
	


}
