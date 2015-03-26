package com.bayviewglen.datastructures;

public class Cell {
	private int row;
	private int col;
	private int translation;
	
	public int getRow() {
		return row;
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public int getCol() {
		return col;
	}
	
	public void setCol(int col) {
		this.col = col;
	}
	
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
		this.translation = 0;
	}
	
	public Cell(int row, int col, int translation) {
		this.row = row - translation;
		this.col = col - translation;
		this.translation = translation;
	}
	
	public boolean equals(Object o){
	    if (o instanceof Cell) { 
	    	return ((Cell)o).row == row && ((Cell)o).col == col;
	    }
	    return false;
	}
	
	public String toString(){
		return "("+(row + translation) + ", " + (col + translation) + ")";
	}
	
	
	public int hashCode(){
		return Integer.valueOf(row).hashCode() + Integer.valueOf(col).hashCode();
	}
	
}
