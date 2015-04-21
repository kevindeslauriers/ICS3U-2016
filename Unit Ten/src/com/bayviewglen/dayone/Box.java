package com.bayviewglen.dayone;

public class Box extends Rectangle implements Shape3D{

	private double height;
	
	public Box(double length, double width, double height) {
		super(length, width);
		this.height = height;
	}

	public double getArea(){
		return 2* (getLength()*getHeight()) + 2*(getWidth()*getHeight()) + 2*(getLength()*getWidth());
	}
	
	public double getVolume() {
		return super.getArea() * height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public boolean isCube(){
		return ((getLength() == getHeight()) && (isSquare())); 
	}

}
