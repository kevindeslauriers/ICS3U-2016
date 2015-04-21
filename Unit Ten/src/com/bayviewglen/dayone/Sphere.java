package com.bayviewglen.dayone;

public class Sphere extends Circle implements Shape3D {		// Circle is the parent of Sphere

	public Sphere(double radius) {
		super(radius);
		
	}

	/* Override my parents getArea method to do what I need it to do for a Sphere */
	public double getArea(){
		return 4 * Math.PI * super.getRadius() * getRadius();	// I can call my parent's method without instantiating an object
														// because I inherited their public stuff - my parents are super!!!!!
	}
	
	
	public double getVolume() {
		return 4.0/3.0 * Math.PI * Math.pow(getRadius(), 3);
	}

	

}
