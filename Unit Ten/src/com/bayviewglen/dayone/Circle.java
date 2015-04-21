package com.bayviewglen.dayone;

public class Circle implements Shape2D {

	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	
	
}
