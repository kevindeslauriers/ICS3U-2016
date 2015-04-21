package com.bayviewglen.dayone;

public class Tester {

	public static void main(String[] args) {
		Box box1 = new Box(5,4,3);
		System.out.println("Box 1: " + box1.getVolume());
		System.out.println("Box 1 (length): " + box1.getLength());
		
		Sphere sphere = new Sphere(2);
		System.out.println("Spehere: " + sphere.getVolume());
		
		Box box2 = box1;
		System.out.println("Box 2: " + box2.getVolume());
		
		Shape3D shape3d = box1;
		System.out.println("Shape3D: " + shape3d.getVolume());
		System.out.println("Box 1 (length): " + ((Box)shape3d).getLength());
		System.out.println("Box 1 (length): " + ((Rectangle)shape3d).getLength());
		
		shape3d = sphere;
		System.out.println("Shape3D: " + shape3d.getVolume());
		
		if (shape3d instanceof Rectangle)
			System.out.println("Shape (length): " + ((Rectangle)shape3d).getLength());
		else if (shape3d instanceof Circle)
			System.out.println("Shape (radius): " + ((Circle)shape3d).getRadius());

	}




}


