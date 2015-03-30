package com.bayviewglen.datastructures;

public class Cell_3D extends Cell {

	private int z;
	private int translation;
	
	public Cell_3D(int row, int col) {
		super(row, col);
		this.z = 0;
	}
	
	public Cell_3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	
	public Cell_3D(int x, int y, int z, int translation){
		super(x, y);
		this.z = z;
		this.translation = translation;
	}
	
	public boolean equals(Object o){
	    if (o instanceof Cell) { 
	    	return ((Cell_3D)o).getRow() == getRow() && ((Cell_3D)o).getCol() == getCol() && ((Cell_3D)o).z == z;
	    }
	    
	    return false;
	}
	
	public String toString(){
		return "("+(getRow()+translation) + ", " + (getCol()+translation) + ", " + (z+translation) + ")";
	}
	
	
	public int hashCode(){
		return Integer.valueOf(getRow()).hashCode() + Integer.valueOf(getCol()).hashCode() + Integer.valueOf(z).hashCode();
	}

	public int getZ(){
		return this.z;
	}
}
