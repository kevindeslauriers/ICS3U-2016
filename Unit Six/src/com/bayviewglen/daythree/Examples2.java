package com.bayviewglen.daythree;

public class Examples2 {

	public static void main(String[] args) {
		int[][] numbers = {{10,11,12,13},
							{14,15,16,17},
							{18,19,20,21},
							{22,23,24,25},
							{26,27,28,29}};
		
			
		display(numbers);
		
		int[][] numbers2 = new int[5][4];
		
		System.out.println();
		intArray(numbers2, 111);
		display(numbers2);
		
		int[][] triangleArray = new int[5][];
		
		for (int i=0; i < triangleArray.length; ++i){
			triangleArray[i] = new int[i+1];
		}
		
		display(triangleArray);
}

	private static void intArray(int[][] arr, int start) {
		for (int col=0;col<5;col++){
			for (int row=0;row<4;row++){
				arr[col][row] = start++;
			}
		}
		
	}
	
	private static void display(int[][] arr){
		for (int i=0;i<arr.length;i++){
			for (int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
