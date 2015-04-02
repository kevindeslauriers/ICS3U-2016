package com.bayviewglen.boardwide2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("input/boardwide_q2_2015.dat"));
		
		while(input.hasNext()){	
			int width = Integer.parseInt(input.nextLine());
			
			String theMessage = input.nextLine();
			String[] words = theMessage.split(" ");
			
			String theLine = "";
			
			for (int j=0; j<words.length; j++){
				String s = words[j];
				if (!theLine.isEmpty())
					theLine += " ";
				
				
				
				
				if (theLine.length() + s.length() <= width){
					theLine += s;
					if (j == words.length-1 || theLine.length() + words[j+1].length() <= width){
						System.out.println(theLine);
					}
					
				}else if (s.length() > width){
					int numSegments = s.length() / width;
					for (int i=0; i< numSegments; ++i){
						System.out.println(s.substring(i*numSegments, i*numSegments + numSegments));
					}
					
					if (s.length() % width != 0){
						theLine = s.substring(numSegments*numSegments);
					}

				}else {
					System.out.println(theLine);
					theLine = "";
					j--;
				}
				
				
			}
			
		}

	}

}
