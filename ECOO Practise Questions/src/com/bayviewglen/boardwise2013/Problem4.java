package com.bayviewglen.boardwise2013;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("input/boardwise_q4_2013.dat"));
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.CANADA);
		while(input.hasNext()){
			int numItems = Integer.parseInt(input.nextLine());
			
			double[] prices = new double[numItems];
			for(int i=0; i<numItems; ++i){
				prices[i] = Double.parseDouble(input.nextLine());
			}
			
			int numCoupons = Integer.parseInt(input.nextLine());
			String[] coupons = new String[numCoupons];
			
			for(int i=0; i<numCoupons; ++i){
				coupons[i] = input.nextLine();
			}
			double solution = solveUsingDP(prices, coupons);
			
			System.out.println("The best price is " + formatter.format(solution));
		}
		
		

	}

	private static double solveUsingDP(double[] prices, String[] coupons) {
		double[][] possibleSolutions = new double[prices.length][coupons.length];
		
		
		for (int c=0; c<coupons.length; ++c){
			possibleSolutions[0][c] = 0.0;
		}
		
		for (int p=0; p<prices.length; ++p){
			possibleSolutions[p][0] = 0.0;
		}
		
		for (int i=1;i<prices.length; i++){
			for (int j=0; j<coupons.length; ++j){
				
			}
		}
		

		
		return 0;
	}

}
