package com.bayviewglen.daythree;

import java.util.ArrayList;

public class ExampleOne {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(5);
		numbers.add(15);
		numbers.add(25);
		numbers.add(35);
		
		for (Integer i : numbers){
			System.out.println(i);
		}
		
		for (int j=0; j< numbers.size(); j++){
			System.out.println(numbers.get(j));
		}
		
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		
		numbers2.add(5);
		numbers2.add(15);
		numbers2.add(25);
		numbers2.add(35);
		numbers2.addAll(numbers);
		
		numbers2.add(20, 100);
		
		for (Integer i : numbers2){
			System.out.println(i);
		}
		
		

		numbers.remove(1);
		
		numbers.add(1, 12);
		
		for (int j=0; j< numbers.size(); j++){
			System.out.println(numbers.get(j));
		}
		
		
	}

}
