package com.bayviewglen.interfacetest;

import java.awt.Color;

public class Flower extends Actor {

	@Override
	public void act() {
		Color c = getColor();
		
		int r = c.getRed();
		int g = c.getGreen();
		int b = c.getBlue();
		
		if (r > 0) r--;
		if (g > 0) g--;
		if (b > 0) b--;
		
		setColor(new Color(r, g, b));
		
		if (r == 0 && g == 0 && b == 0)
			removeSelfFromGrid();
		
	}
	
	public Flower(Location loc, Grid g){
		super(Color.BLACK, DIRECTION.NORTH, loc, g);
	}
	
	public Flower(Color col, int direction, Location loc, Grid g){
		super(col, direction, loc, g);
	}
	
	public String toString(){
		return "FLOWER" + getDirection();
	}

}
