package com.bayviewglen.daytwo;

public class Exmaples {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		int[] numbers2 = {1,4,5,6,7,8,4,3,3,44};
		int[] numbers3 = new int[100];
		int size = 0;
		
		copyArray(numbers2, numbers);
		
		printEven(numbers);
		
		size = add(numbers3, size, 17);
		size = add(numbers3, size, 117);
		size = add(numbers3, size, 217);
		size = add(numbers3, size, 17);
		size = add(numbers3, size, 117);
		size = add(numbers3, size, 217);
		size = add(numbers3, size, 17);
		size = add(numbers3, size, 117);
		size = add(numbers3, size, 217);
		size = add(numbers3, size, 17);
		size = add(numbers3, size, 117);
		size = add(numbers3, size, 217);
		
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 2);
		size = removeNoOrder(numbers3, size, 0);
		size = removeNoOrder(numbers3, size, 0);
		
	}
	
	private static int removeNoOrder(int[] arr, int size, int index) {
		if (index<0 || index> size-1)
			return size;
		
		arr[index] = arr[--size];
		
		return size;
	}

	private static int add(int[] arr, int size, int el) {
		
		if(arr.length == size)
			return size;
			
		arr[size++] = el;
		
		return size;
	}

	public static void copyArray(int[] src, int[] destination){
		for (int i = 0; i< src.length; i++){
			destination[i] = src[i];
		}
	}
	
	public static void printEven(int[] arr){
		for (int i = 0; i< arr.length; i++){
			if (arr[i] % 2 == 0){
				System.out.print(arr[i] + " ");
			}
		}
	}
}