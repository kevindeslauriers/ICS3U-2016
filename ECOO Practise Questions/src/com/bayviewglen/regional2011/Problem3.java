package com.bayviewglen.regional2011;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
 * This problem requires a billion ints.
 * 
 * Originally I tried this problem using DP and a hashmap to store the solutions.  It worked but ran too slow for
 * the larger inputs.
 * 
 * So I attempted a memoization solution but this also had issues for large inputs as it blew the stack.
 * 
 * I then decided to modify the DP solution to use a int[] instead of a hashmap.  This sped things up considerably since
 * there was no overhead for autoboxing -> INteger to int and the other way around - as well we did not need to handle the overhead
 * for the HashMap.  Using a int[] which has direct access to the values is faster than a hashmap that does the same thing.
 * 
 * The new issue was for int[1000000000] I blew the heap -> I ran out of memory.  Eclipse puts aside a certain amount of memory for each run.
 * You can change this by right clicking the class, go to run arguments and adding  
 * something to VM argumments that looks like: -Xms1024M -Xmx6000M
 * 
 * The second # will increase the max heap size. I have set it to 6000MB
 * 
 */
public class Problem3 {

	public static void main(String[] args) throws FileNotFoundException {
		validCoins = new HashSet<Integer>(); 
		validCoins.add(3);
		validCoins.add(5);
		validCoins.add(53);
		validCoins.add(353);
		validCoins.add(3553);
		
		ECOO_2011_Problem3_RegionalDP();
		//ECOO_2011_Problem3_RegionalMem();
	}
	
	
	private static void ECOO_2011_Problem3_RegionalDP() throws FileNotFoundException{
		Scanner input = new Scanner(new File("input/regional_q3.dat"));

		while(input.hasNext()){	
			
			int finishAmount = Integer.valueOf(input.nextLine());
			
			//HashMap<Integer, Integer> solutions = new HashMap<Integer, Integer>();
			int[] solutions = new int[finishAmount+1];
			int[] solutions2 = new int[finishAmount+1];		// this is an array stating what coin got us to this solution.
															// we can then just work backwords to get the coins of the previous 
															// solutions.
				
			for (int i=3; i<=finishAmount; i++){		// let's use dynamic programming not memoization
				if (validCoins.contains(i)){
					solutions[i] = 1;
					solutions2[i] = i;
				}else{	// check for the min by looking back after adding.
					int minValue = Integer.MAX_VALUE;	// everything is smaller than this
					for(int j=0; j<coins.length; j++){
						int value = coins[j];
						if (minValue == Integer.MAX_VALUE && (i - value)>3){
							Integer temp = solutions[i - value];
							if (temp != Integer.MAX_VALUE && temp < minValue){
								minValue = temp + 1;
								solutions2[i] = value;		// the coin that got us here!!!!
							}
						}
					}
					
					solutions[i] = minValue;
					
				}
			}
			
			System.out.println(solutions[finishAmount] + " coins totalling " + finishAmount + ": " + displayCoins(finishAmount, solutions2));
		}
	}
	
	
	private static String displayCoins(int finishAmount, int[] solutions2) {
		int num3 = 0;
		int num5 = 0;
		int num53 = 0;
		int num353 = 0;
		int num3553 = 0;
		
		
		int i = finishAmount;
		while (i!=0){
			if (solutions2[i] == 3) num3++;
			if (solutions2[i] == 5) num5++;
			if (solutions2[i] == 53) num53++;
			if (solutions2[i] == 353) num353++;
			if (solutions2[i] == 3553) num3553++;
			i -= solutions2[i];
		}
		
		String result = ""; 
		
		if (num3553 != 0) result += (num3553 + " of 3553  ");
		if (num353 != 0) result += (num353 + " of 353  ");
		if (num53 != 0) result += (num53 + " of 53  ");
		if (num5 != 0) result += (num5 + " of 5  ");
		if (num3 != 0) result += (num3 + " of 3  ");
		
		return result;
	}

	public static HashMap<Integer, Integer> solutions;
	public static HashSet<Integer> validCoins;
	public static int[] coins = {3553, 353, 53, 5, 3};
	
	private static void ECOO_2011_Problem3_RegionalMem() throws FileNotFoundException{
		Scanner input = new Scanner(new File("input/regional_q3.dat"));

		while(input.hasNext()){	
			
			Integer finishAmount = Integer.valueOf(input.nextLine());
			
			solutions = new HashMap<Integer, Integer>();
			solveUsingMem(finishAmount);
			// Let's not hit a stack overflow
			/*
			for (int i=100000; i>=1; --i){
				solveUsingMem((int)(finishAmount/(double)i));
			}
			*/
			
			System.out.println(solutions.get(finishAmount) + " coins totalling " + finishAmount + ": ");
		}
	}


	private static int solveUsingMem(Integer amt) {
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
					int temp = solveUsingMem(amt - value);
					if ((temp != Integer.MAX_VALUE) && temp < minValue){
						minValue = temp + 1;
					}
				}
				solutions.put(amt, minValue);
				return solutions.get(amt);
		
		}
		
	}
	
}
