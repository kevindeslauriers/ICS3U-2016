<<<<<<< HEAD
package com.bayviewglen.utils;

import java.util.HashMap;

import com.bayviewglen.datastructures.Cell;
import com.bayviewglen.datastructures.Cell_3D;

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
	
	/* Give me a cell and I will give you a vertex # */
	public static HashMap<Cell_3D,Integer> create3DGridHashMap(int x, int y, int z){
		HashMap<Cell_3D,Integer> temp = new HashMap<Cell_3D,Integer>();
		
		// add another for loop
		for (int h=0;h<z;h++){
			for (int r=0; r<x; ++r){
				for (int c=0; c<y; ++c){
					temp.put(new Cell_3D(r,c,h), r*y+c+h*x*y);
				}
			}
		}
		
		return temp;
		
	}
	
	/* Give me a vertex and I will give you a Cell */
	public static HashMap<Integer,Cell_3D> create3DVertexHashMap(int x, int y, int z){
		HashMap<Integer,Cell_3D> temp = new HashMap<Integer,Cell_3D>();
		
		// add another for loop
		for (int h=0;h<z;h++){
			for (int r=0; r<x; ++r){
				for (int c=0; c<y; ++c){
					temp.put( r*y+c+h*x*y, new Cell_3D(r,c,h));
				}
			}
		}
		return temp;
		
	}
	
	public static void main(String[] args){
		HashMap<Cell_3D, Integer> vertexMap = Utils.create3DGridHashMap(4, 4, 4);
		HashMap<Integer, Cell_3D> cellMap = Utils.create3DVertexHashMap(4, 4, 4);
		
		System.out.println(cellMap.get(15));
		
		
	}
}
=======
package com.bayviewglen.utils;

import java.util.HashMap;

import com.bayviewglen.datastructures.Cell;
import com.bayviewglen.datastructures.Cell_3D;

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
	
	/* Give me a cell and I will give you a vertex # */
	public static HashMap<Cell_3D,Integer> create3DGridHashMap(int x, int y, int z){
		HashMap<Cell_3D,Integer> temp = new HashMap<Cell_3D,Integer>();
		
		// add another for loop
		for (int h=0;h<z;h++){
			for (int r=0; r<x; ++r){
				for (int c=0; c<y; ++c){
					temp.put(new Cell_3D(r,c,h), r*y+c+h*x*y);
				}
			}
		}
		
		return temp;
		
	}
	
	/* Give me a vertex and I will give you a Cell */
	public static HashMap<Integer,Cell_3D> create3DVertexHashMap(int x, int y, int z){
		HashMap<Integer,Cell_3D> temp = new HashMap<Integer,Cell_3D>();
		
		// add another for loop
		for (int h=0;h<z;h++){
			for (int r=0; r<x; ++r){
				for (int c=0; c<y; ++c){
					temp.put( r*y+c+h*x*y, new Cell_3D(r,c,h));
				}
			}
		}
		return temp;
		
	}
	
	public static void main(String[] args){
		HashMap<Cell_3D, Integer> vertexMap = Utils.create3DGridHashMap(4, 4, 4);
		HashMap<Integer, Cell_3D> cellMap = Utils.create3DVertexHashMap(4, 4, 4);
		
		System.out.println(cellMap.get(15));
		
		
	}
}
>>>>>>> origin/master
