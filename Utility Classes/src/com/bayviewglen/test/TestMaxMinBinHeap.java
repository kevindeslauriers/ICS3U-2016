/* Creates a max and min PQ using a BinaryHeap */
/* Just checks to ensure that the front element contains the max or min value */

package com.bayviewglen.test;

import com.bayviewglen.datastructures.MaxBinaryHeap;
import com.bayviewglen.datastructures.MinBinaryHeap;

public class TestMaxMinBinHeap {

	public static void main(String[] args) {
		MaxBinaryHeap<Integer> maxLine = new MaxBinaryHeap<Integer>();
		MinBinaryHeap<Integer> minLine = new MinBinaryHeap<Integer>();
		
		for (int i=0; i<10000; i++){
			int x = (int)(Math.random() * 10000) - (int)(Math.random() * 10000);
			maxLine.add(x);
			minLine.add(x);
		}
		
		System.out.println(maxLine.toString());
		System.out.println(minLine.toString());

	}

}
