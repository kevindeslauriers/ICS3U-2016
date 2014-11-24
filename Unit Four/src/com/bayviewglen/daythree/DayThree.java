package com.bayviewglen.daythree;
import java.util.ArrayList;
import java.util.List;


public class DayThree {

	public static String scrambleWord(String word){
			String s = "";
			for (int i=0;i<word.length()-1; ++i){
				if(word.charAt(i) == 'A' && word.charAt(i+1) != 'A'){
					// yeah swap them
					s += word.charAt(i+1);
					s += word.charAt(i);
					i++;
				}else{
					s += word.charAt(i);
					if (i == word.length()-2)
						s += word.charAt(i+1);
				}
			}
			
			if (word.length() < 2)
				return word;
			
			return s;
	}
	
	public static void scrambleOrRemove(List<String> wordList) {
		//ArrayList<String> newList = new ArrayList<String>(); 
		
		for (int i=0; i<wordList.size();++i){
			if (scrambleWord(wordList.get(i)).equals(wordList.get(i))){
				wordList.remove(i--);
			}else{
				wordList.set(i, scrambleWord(wordList.get(i)));
			}
		}
		
		//wordList = newList;
	}
	
	public static void main(String[] args) {
		/*
		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("TAN");
		wordList.add("ABRACADABRA");
		wordList.add("WHOA");
		wordList.add("APPLE");
		wordList.add("EGGS");
		
		scrambleOrRemove(wordList);
		
		for (int i=0; i<wordList.size(); ++i){
			System.out.println(wordList.get(i));
		}
		*/
		
		System.out.println(scrambleWord("TAN"));
		System.out.println(scrambleWord("ABRACADABRA"));
		System.out.println(scrambleWord("WHOA"));
		System.out.println(scrambleWord("AARDVARK"));
		System.out.println(scrambleWord("EGGS"));
		System.out.println(scrambleWord("A"));
		System.out.println(scrambleWord(""));
		
	}

}
