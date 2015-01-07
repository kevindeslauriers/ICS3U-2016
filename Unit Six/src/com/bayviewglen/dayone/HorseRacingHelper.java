package com.bayviewglen.dayone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HorseRacingHelper {
	public static void main(String[] args) {
		
		String[] horses = getHorses();

	}
	
	/* 
	 * Reads the horses from a file assume the file exists and is in the format specified in the
	 * assignment.
	 */
	public static String[] getHorses(){
		String[] horses = null;
		try {
			Scanner scanner = new Scanner(new File("input/horseData.dat"));
			int numHorses = Integer.parseInt(scanner.nextLine());
			horses = new String[numHorses];
			
			for (int i = 0; i<numHorses; i++){
				horses[i] = scanner.nextLine();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return horses;
	}
	
	/* 
	 * Check if a horse is already in the race - uses a modified search method
	 */
	public static boolean alreadyInRace(String horse, String[] horsesInRace){
		
		for (int i = 0; i < horsesInRace.length; i++){
			if (horsesInRace[i].equalsIgnoreCase(horse)){
				return true;
			}
		}
			
		return false;
	}
}
