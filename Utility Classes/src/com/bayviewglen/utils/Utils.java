package com.bayviewglen.utils;

import java.util.HashMap;

import com.bayviewglen.datastructures.Cell;

public class Utils {
	public static boolean isEmpty(String s){
		return s == null || s.trim().equals("");
	}
	
	/* Give me a cell and I will give you a vertex # */
	public static HashMap<Cell,Integer> createGridHashMap(int rows, int cols){
		HashMap<Cell,Integer> temp = new HashMap<Cell,Integer>();
		
		for (int r=0; r<rows; ++r){
			for (int c=0; c<cols; ++c){
				temp.put(new Cell(r,c), r*cols+c);
			}
		}
		
		return temp;
		
	}
	
	/* Give me a vertex and I will give you a Cell */
	public static HashMap<Integer,Cell> createVertexHashMap(int rows, int cols){
		HashMap<Integer,Cell> temp = new HashMap<Integer,Cell>();
		
		for (int r=0; r<rows; ++r){
			for (int c=0; c<cols; ++c){
				temp.put( r*cols+c, new Cell(r,c));
			}
		}
		
		return temp;
		
	}
}
