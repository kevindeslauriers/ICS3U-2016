package com.bayviewglen.cemc.Junior;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class junior2014 {

	public static void main(String[] args) throws FileNotFoundException {
		junior1("input/junior2014_1.dat");

	}
	
	public static void junior1(String fileName) throws FileNotFoundException{
		Scanner scanner = new Scanner(new File(fileName));
		
		int numFriends = Integer.parseInt(scanner.nextLine());
		int[] myFriends = new int[numFriends+1];
		
		for (int i = 0; i< myFriends.length; ++i){
			myFriends[i] = i;
		}
		
		int numRounds = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i< numRounds; ++i){
			int r = Integer.parseInt(scanner.nextLine());
			int count = 0;
			for (int j = 1; j< myFriends.length; ++j){
				if (j%r==0){
					myFriends[j] = -1;	// place holder so I know to remove
					count++;
				}
			}
			
			int[] tempArray = new int[myFriends.length-count];
			int k = 0;
			for (int j = 0; j< myFriends.length; ++j){
				if (myFriends[j] !=- 1)
					tempArray[k++] = myFriends[j];	// place holder so I know to remove
			}
			
			myFriends = tempArray;
		}
		
		for (int j = 0; j< myFriends.length; ++j){
			if (j !=0)
				System.out.println(myFriends[j]);
		}
	}

}

