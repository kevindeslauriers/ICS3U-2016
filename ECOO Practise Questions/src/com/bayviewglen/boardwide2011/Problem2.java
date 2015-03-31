package com.bayviewglen.boardwide2011;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Problem2 {

	// Let's keep an hashmap where the key is a string of x and o and the value is the letter.
	
	static HashMap<String, String> letterMap = new HashMap<String, String>(); 
	/*
	 * xo
	 * xx
	 * oo
	 * 
	 * is stored as xoxxoo and is the H
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		letterMap.put("xooooo", "A");		
		letterMap.put("xoxooo", "B");
		letterMap.put("xxoooo", "C");
		letterMap.put("xxoxoo", "D");
		letterMap.put("xooxoo", "E");
		letterMap.put("xxxooo", "F");
		letterMap.put("xxxxoo", "G");
		letterMap.put("xoxxoo", "H");
		letterMap.put("oxxooo", "I");
		letterMap.put("oxxxoo", "J");
		letterMap.put("xoooxo", "K");
		letterMap.put("xoxoxo", "L");
		letterMap.put("xxooxo", "M");
		letterMap.put("xxoxxo", "N");
		letterMap.put("xooxxo", "O");
		letterMap.put("xxxoxo", "P");
		letterMap.put("xxxxxo", "Q");
		letterMap.put("xoxxxo", "R");
		letterMap.put("oxxoxo", "S");
		letterMap.put("oxxxxo", "T");
		letterMap.put("xoooxx", "U");
		letterMap.put("xoxoxx", "V");
		letterMap.put("oxxxox", "W");
		letterMap.put("xxooxx", "X");
		letterMap.put("xxoxxx", "Y");
		letterMap.put("xooxxx", "Z");
		letterMap.put("oooooo", " ");
		
		Scanner input = new Scanner(new File("input/boardwise_q2_2011.dat"));
		
		while(input.hasNext()){	
			String firstLine = input.nextLine();
			String secondLine = input.nextLine();
			String thirdLine = input.nextLine();
			
			int numSegments = firstLine.length()/2 ;
			String temp = "";
			String message = "";
			for (int i=0;i<numSegments;i++){
				temp = (firstLine.substring(i*2,i*2 + 2) + secondLine.substring(i*2,i*2 + 2) + thirdLine.substring(i*2,i*2 + 2));
				message += letterMap.get(temp);
			}
			
			System.out.println(message);
		}

	}

}
