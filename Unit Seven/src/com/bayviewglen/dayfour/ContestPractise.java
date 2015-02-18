package com.bayviewglen.dayfour;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContestPractise {

	private static long[] soln;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	/*	
		HashMap<String, String> students = new HashMap<String, String>();
		students.put("1126804", "DesLauriers");
		
		for (int i=0;i<5;++i){
			System.out.println("Enter a student number and name: ");
			String num = scanner.nextLine();
			students.put(num.split(" ")[0],num.split(" ")[1]);
		}
		
		Set<String> keys = students.keySet();
		
		for (String key : keys){
			System.out.println(students.get(key));
		}
		*/
		/*
		System.out.println("Jack".compareTo("Henry"));
		System.out.println("Jack".compareTo("Jack"));
		System.out.println("Henry".compareTo("Jack"));

		String s = "the shjhjs shjhjhs shgjhgjhs";
		s = s.replaceAll(" ", "");
		
		
		
		
		int[] arr = {1,5,3,2,45,7,4};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 77));
		
		GregorianCalendar birthday = new GregorianCalendar(1972,05,03);
		GregorianCalendar wifeBirthday = new GregorianCalendar(1975,05,20);
		
		birthday.compareTo(wifeBirthday);

		
		
		
		
		
		int n = 50;
		soln = new long[n+1];
		
		for (int i=0; i<= n; ++i){
			soln[i]=-1;
		}
		
		System.out.println(fibDP(n));
		System.out.println(fib(n));
		*/
		HashSet<String> pastCoordinates = new HashSet<String>();
		pastCoordinates.add("0-1");
		pastCoordinates.add("0-2");
		pastCoordinates.add("0-3");
		pastCoordinates.add("1-3");
		pastCoordinates.add("2-3");
		pastCoordinates.add("3-3");
		pastCoordinates.add("3-4");
		pastCoordinates.add("3-5");
		pastCoordinates.add("4-5");
		pastCoordinates.add("5-5");
		pastCoordinates.add("5-4");
		pastCoordinates.add("5-3");
		pastCoordinates.add("6-3");
		pastCoordinates.add("7-3");
		pastCoordinates.add("7-4");
		pastCoordinates.add("7-5");
		pastCoordinates.add("7-6");
		pastCoordinates.add("7-7");
		pastCoordinates.add("6-7");
		pastCoordinates.add("5-7");
		pastCoordinates.add("4-7");
		pastCoordinates.add("3-7");
		pastCoordinates.add("2-7");
		pastCoordinates.add("1-7");
		pastCoordinates.add("0-7");
		pastCoordinates.add("-1-7");
		pastCoordinates.add("-1-6");
		pastCoordinates.add("-1-5");
		
		int x = -1;
		int y = -5;
		
		String answer = "";
		
		boolean done = false;
		while(!done){
			boolean safe = true;
			String command = scanner.nextLine();
			String dir = command.split(" ")[0];
			Integer amount = Integer.parseInt(command.split(" ")[1]);
			
			if (dir.equals("u")){
				for (int i=0;i<amount; ++i){
					y+=1;
					if (pastCoordinates.contains(""+x+y))
						safe=false;
					pastCoordinates.add(""+x+y);
				}
				
			}else if (dir.equals("d")){
				for (int i=0;i<amount; ++i){
					y-=1;
					if (pastCoordinates.contains(""+x+y))
						safe=false;
					pastCoordinates.add(""+x+y);
				}
			}else if (dir.equals("l")){
				for (int i=0;i<amount; ++i){
					x-=1;
					if (pastCoordinates.contains(""+x+y))
						safe=false;
					pastCoordinates.add(""+x+y);
				}
			}else if (dir.equals("r")){
				for (int i=0;i<amount; ++i){
					x+=1;
					if (pastCoordinates.contains(""+x+y))
						safe=false;
					pastCoordinates.add(""+x+y);
				}
			}else{
				done = true;
			}
			if (!done){
				if (safe)
					answer += ("" + x + " " + y + " " + "SAFE\n");
				else
					answer += ("" + x + " " + y + " " + "DANGER\n");
			}
		}

		System.out.println(answer);
		
		
		
		
		
	}

	private static long fib(int n) {
		if (n==1 || n== 2)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}

	private static long fibDP(int n) {
		if (n==1 || n== 2)
			return 1;
		
		if (soln[n] != -1)
			return soln[n];
		else{
			soln[n] = fibDP(n-2) + fibDP(n-1);
			return soln[n];
		}
	}

	
	
}
