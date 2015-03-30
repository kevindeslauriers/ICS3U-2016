package com.bayviewglen.boardwide2014;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem2 {

	// this is how you can take a string and convert it to a int - we assume that the string is starting 
	// in base 2
	// int decimal = Integer.parseInt("101101101010111", 2);
	// int decimal = Integer.parseInt("01023374", 8);	// would assume it starts in base 8
	// int decimal = Integer.parseInt("0F4E2", 16);	// would assume it starts in base 16 - hex
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("input/regional_q2_2014.dat"));
		
		
		
		while(input.hasNext()){	
			String firstLine = input.nextLine();	// grab the lines since the go in pairs I can
			String secondLine = input.nextLine();	// realistically throw away the second line.
			
			String converted1 = "";			// when A/T is a 1 and C/G is a 0
			String converted2 = "";			// when A/T is a 0 and C/G is a 1
			for (int i = 0; i< firstLine.length(); ++i){
				if (firstLine.charAt(i) == 'A' || firstLine.charAt(i) == 'T'){
					converted1 += '1';
					converted2 += '0';
				}else{
					converted1 += '0';
					converted2 += '1';
				}
			}
			
			String solution = solveProblem(converted1);
			if (solution == null) solution = solveProblem(converted2);
			System.out.println(solution);
			
		}
	}

	private static String solveProblem(String converted) {
		
		
		for(int j=0; j<7; ++j){		// keep trying from the beginning
			boolean bad = false;
			int i = j;
			String solution = "";
			while (i<=converted.length() && !bad){
				if (converted.substring(i).length() <= 7) return solution;
				String s = converted.substring(i, i+8);
				int d = Integer.parseInt(s, 2);
				if (d == 32 || (d>=65 && d<=90)){
					solution += (char)d;
					i+=8;	// because we already add one
				}else {
					// we could not do it
					bad = true;
					
				}
			}
		}
		
		
		return null;
	}

}

