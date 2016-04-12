package com.bayviewglen.interfacetest;

import java.awt.Color;

public class Test {

	public static void main(String[] args) { 
		Grid g = new Grid(6,6);
		
		Bug b1 = new Bug(Color.RED, DIRECTION.EAST, new Location(0,0), g);
		Bug b2 = new Bug(Color.RED, DIRECTION.WEST, new Location(2,2), g);
		Rock r2 = new Rock(Color.RED, DIRECTION.EAST, new Location(1,1), g);
		Flower f1 = new Flower(Color.YELLOW, DIRECTION.EAST, new Location(4,5), g);
		GrassHopper g1 = new GrassHopper(Color.RED, DIRECTION.EAST, new Location(1,0), g);
		while(true){
			g.display();
			g.step(); 
			
		}

	}

}
