package com.bayviewglen.regional2011;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) throws FileNotFoundException {
		validCoins = new HashSet<Integer>(); 
		validCoins.add(3);
		validCoins.add(5);
		validCoins.add(53);
		validCoins.add(353);
		validCoins.add(3553);
		
		//ECOO_2011_Problem3_RegionalDP();
		ECOO_2011_Problem3_RegionalMem();
	}
	
	
	private static void ECOO_2011_Problem3_RegionalDP() throws FileNotFoundException{
		Scanner input = new Scanner(new File("input/regional_q3.dat"));

		while(input.hasNext()){	
			
			Integer finishAmount = Integer.valueOf(input.nextLine());
			
			HashMap<Integer, Integer> solutions = new HashMap<Integer, Integer>();
			for (int i=3; i<=finishAmount; i++){		// let's use dynamic programming not memoization
				if (validCoins.contains(i))
					solutions.put(i, 1);
				else{	// check for the min by looking back after adding.
					int minValue = Integer.MAX_VALUE;	// everything is smaller than this
					for(int j=0; j<coins.length; j++){
						int value = coins[j];
						if (minValue == Integer.MAX_VALUE && (i - value)>3){
							Integer temp = solutions.get(i - value);
							if (temp < minValue){
								minValue = temp + 1;
							}
						}else
							break;
					}
					solutions.put(i, minValue);
					
				}
			}
			
			System.out.println(solutions.get(finishAmount) + " coins totalling " + finishAmount + ": ");
		}
	}
	
	public static HashMap<Integer, Integer> solutions;
	public static HashSet<Integer> validCoins;
	public static int[] coins = {3553, 353, 53, 5, 3};
	
	private static void ECOO_2011_Problem3_RegionalMem() throws FileNotFoundException{
		Scanner input = new Scanner(new File("input/regional_q3.dat"));

		while(input.hasNext()){	
			
			Integer finishAmount = Integer.valueOf(input.nextLine());
			
			solutions = new HashMap<Integer, Integer>();
			
			// Let's not hit a stack overflow
			for (int i=100000; i>=1; --i){
				solveUsingMem((int)(finishAmount/(double)i));
			}
			
			System.out.println(solutions.get(finishAmount) + " coins totalling " + finishAmount + ": ");
		}
	}


	private static Integer solveUsingMem(Integer amt) {
			if (amt < 3)
				return Integer.MAX_VALUE;
		
			if (solutions.get(amt) != null)
				return solutions.get(amt);
			
			if (validCoins.contains(amt)){
				solutions.put(amt, 1);
				return solutions.get(amt);
			}else{	// check for the min by looking back after adding.
				int minValue = Integer.MAX_VALUE;	// everything is smaller than this
				
				for(int j=0; j<coins.length; j++){
					int value = coins[j];
					Integer temp = solveUsingMem(amt - value);
					if ((temp != null) && temp < minValue){
						minValue = temp + 1;
					}
				}
				solutions.put(amt, minValue);
				return solutions.get(amt);
		
		}
		
	}
	
}
