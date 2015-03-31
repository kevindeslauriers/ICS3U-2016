package com.bayviewglen.boardwise2013;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("input/boardwise_q2_2013.dat"));
		
		while(input.hasNext()){
			String line = input.nextLine();
			String[] data = line.split(" ");
			
			String checkDigits = "";
			for (String s : data){
				checkDigits += getCheckDigit(s);
			}
			System.out.println(checkDigits);
		}
	}

	// char 48 -> int 0
	private static int getCheckDigit(String s) {
		
		
		int sumPartA = 0;
		
		for (int i=s.length()-1; i>=0; i-=2){
			String temp = "" + (s.charAt(i) - 48)*2;
			
			for (int j=0; j<temp.length(); ++j){
				sumPartA += (temp.charAt(j) - 48);
			}
		}

		for (int i=s.length()-2; i>=0; i-=2){
			sumPartA += (s.charAt(i) - 48);
		}
		
		
		return (10 - (sumPartA%10))%10;
		
	}

}
