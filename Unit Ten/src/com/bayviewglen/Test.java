package com.bayviewglen.interfacetest;

import java.awt.Color;

public class Test {

	public static void main(String[] args) { 
		Grid g = new Grid(6,6);
		
		Bug b1 = new Bug(Color.RED, DIRECTION.EAST, new Location(2,5), g);
		Bug b2 = new Bug(Color.RED, DIRECTION.WEST, new Location(5,5), g);
		Rock r2 = new Rock(Color.RED, DIRECTION.EAST, new Location(5,2), g);
		Flower f1 = new Flower(Color.YELLOW, DIRECTION.EAST, new Location(5,4), g);
		
		while(true){
			g.step(); 
			g.display();
		}

	}

}
