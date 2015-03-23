package com.bayviewglen.dayone;

public class SortingAlgorithms {

	public static void main(String[] args) {
		int[] numbers = {3,4,7,4,23,3,5,16,5,3,3,3,5,6,7,-2,4};
		int[] numbers2 = {3,4,7,4,23,3,5,16,5,3,3,3,5,6,7,-2,4};
		
		display(numbers);
		selectionSort(numbers);
		display(numbers);
		
		
		
		display(numbers2);
		insertionSort(numbers2);
		display(numbers2);
		System.out.println("It is at: " + binarySearch(numbers2,16,0,numbers2.length-1));
		System.out.println("It is at: " + sequentialSearch(numbers2,16));

	}

	private static void insertionSort(int[] numbers) {
		for (int i=1;i<numbers.length; ++i){	// tracks the sorted/unsorted side
			int nextNumber = numbers[i];
			int j;
			for (j=i-1; j>=0; j--){	// does the shifting
				if (numbers[j] > nextNumber)	// keep shifting if we are smaller than current element in the sorted side
					numbers[j+1] = numbers[j];
				else
					break;	// we don't need to shift anymore
				
			}
			numbers[j+1] = nextNumber;
		}
	}

	private static void selectionSort(int[] numbers) {
		for (int i=0;i<numbers.length; ++i){	// moves the dashed line
			int smallestIndex = i;
			for (int j=i+1; j<numbers.length;++j){
				if (numbers[j] < numbers[smallestIndex])
					smallestIndex = j;
			}
			int temp = numbers[i];
			numbers[i] = numbers[smallestIndex];
			numbers[smallestIndex] = temp;
		}
		
	}

	private static void display(int[] numbers) {
		System.out.print("The numbers: ");
		for (int num : numbers){
			System.out.print(num + " ");
		}
		System.out.println();
		
	}
	
	// returns the index of the int findMe or -1 if not there
	private static int binarySearch(int[] numbers, int findMe, int low, int high){
		if (high<low)
			return -1;
		
		int mid = (high + low)/2;
		if (numbers[mid] == findMe)
			return mid;
		else if (numbers[mid] > findMe)
			return binarySearch(numbers, findMe, low, mid-1);
		else if (numbers[mid] < findMe)
			return binarySearch(numbers, findMe, mid+1, high);
		
		return -1;
	}
	
	private static int sequentialSearch(int[] numbers, int findMe){
		for (int i=0; i<numbers.length; ++i){
			if (numbers[i] == findMe)
				return i;
		}
		
		return -1;
	}
	
	

}
