package com.bayviewglen.daytwo;

public class MergeSortExamples {

	public static void main(String[] args) {
		int[] numbers = {3,4,7,4,23,3,5,16,5,3,3,3,5,6,7,-2,4};
		display(numbers);
		
		mergesort(numbers,0,numbers.length-1);
		display(numbers);

	}

	private static void mergesort(int a[], int low, int high) {
		if (low == high)
			return;
		int length = high - low + 1;
		int pivot = (low + high) / 2;		// our pivot is the mid point
		mergesort(a, low, pivot);			// sort the left side
		mergesort(a, pivot + 1, high);		// sort the right side
		
		int working[] = new int[length];
		for (int i = 0; i < length; i++)
			working[i] = a[low + i];
		
		int m1 = 0;
		int m2 = pivot - low + 1;
		for (int i = 0; i < length; i++) {
			if (m2 <= high - low)
				if (m1 <= pivot - low)
					if (working[m1] > working[m2])
						a[i + low] = working[m2++];
					else
						a[i + low] = working[m1++];
				else
					a[i + low] = working[m2++];
			else
				a[i + low] = working[m1++];
		}
	}
	
	private static void display(int[] numbers) {
		System.out.print("The numbers: ");
		for (int num : numbers){
			System.out.print(num + " ");
		}
		System.out.println();
		
	}

}
