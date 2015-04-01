package com.bayviewglen.boardwise2010;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("input/boardwise_q2_2010.dat"));
		
		while(input.hasNext()){
			String key = input.nextLine();
			String message = input.nextLine();
			
			int[] convertedKey = convert(key.substring(0, 5));
			int decimalKey = convertToDecimal(convertedKey);
			int numSegments = message.length()/5;
			int[][] convertedMessage = new int[numSegments][];
			String decryptedMessage = "";
			int[] decimalMessage = new int[numSegments];
			for (int i=0; i< numSegments; ++i){
				convertedMessage[i] = convert(message.substring(i*5, i*5+5));
				decimalMessage[i] = convertToDecimal(convertedMessage[i]);
				decimalMessage[i] = (14348907 + decimalMessage[i] - decimalKey)%14348907;	// ensure we do not have negatives.
				
				decryptedMessage += decryptDecimal(decimalMessage[i]);
				
			}
			
			/* Remove the extra . at the end of the message */
			int k = decryptedMessage.length()-1;
			while (decryptedMessage.charAt(k) == '.'){
				k--;
			}	
			decryptedMessage = decryptedMessage.substring(0, k+1);
			
			System.out.println(decryptedMessage);
			
		}

	}


	private static String decryptDecimal(int number) {
		String answer = "";
		int i = 0;
		while(number != 0){
			if (number%27 == 0) answer = '.' + answer;
			else answer = (char)((number%27) + 64) + answer;
			number /= 27;
			i++;
		}
		
		if (i != 5) answer = '.' + answer;
		return answer;
	}


	private static int convertToDecimal(int[] convertedKey) {
		int temp = 0;
		for (int i=0; i<5; ++i){
			temp += convertedKey[i] * Math.pow(27, 4-i);
		}
		return temp;
	}


	private static int[] convert(String key) {
		int[] solved = new int[5];
		
		for (int i=0; i<key.length(); ++i){
			solved[i] = (int)key.charAt(i) - 64;
			if (solved[i] < 0) solved[i] = 0;
		}
		
		return solved;
	}

}
