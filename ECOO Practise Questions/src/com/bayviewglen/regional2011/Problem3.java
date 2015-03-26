package com.bayviewglen.regional2011;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) throws FileNotFoundException {
		ECOO_2011_Problem3_Regional();
	}
	
	
	private static void ECOO_2011_Problem3_Regional() throws FileNotFoundException{
		Scanner input = new Scanner(new File("input/regional_q3.dat"));
		
		HashSet<Integer> validCoins = new HashSet<Integer>(); 
		validCoins.add(3);
		validCoins.add(5);
		validCoins.add(53);
		validCoins.add(353);
		validCoins.add(3553);
		
		
		
		while(input.hasNext()){	
			
			Integer finishAmount = Integer.valueOf(input.nextLine());
			
			HashMap<Integer, Integer> solutions = new HashMap<Integer, Integer>();
			for (int i=3; i<=finishAmount; i++){		// let's use dynamic programming not memoization
				if (validCoins.contains(i))
					solutions.put(i, 1);
				else{	// check for the min by looking back after adding.
					int minValue = Integer.MAX_VALUE;	// everything is smaller than this
					for(Integer value : validCoins){
						Integer temp = solutions.get(i - value);
						if ((temp != null) && temp < minValue){
							minValue = temp + 1;
						}
					}
					solutions.put(i, minValue);
				}
			}
			
			System.out.println(solutions.get(finishAmount));
		}
	}
	
}
