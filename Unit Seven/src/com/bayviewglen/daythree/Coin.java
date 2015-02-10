package com.bayviewglen.daythree;

public class Coin {
	private String face;

	public Coin(){
		flip();
	}
	
	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}
	
	public void flip(){
		if (1 == (int) (Math.random() * 2))
			face = "heads";
		else 
			face = "tails";
	}
	
	public boolean isHeads(){
		return face.equals("heads");
	}
	
	public String toString(){
		return face;
	}
	
}
