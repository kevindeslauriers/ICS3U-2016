package com.bayviewglen.interfacetest;

import java.awt.Color;

public class Rock extends Actor {

	@Override
	public void act() {
		
		
	}
	
	public Rock(Location loc, Grid g){
		super(Color.BLACK, DIRECTION.NORTH, null, null);
	}
	
	public Rock(Color col, int direction, Location loc, Grid g){
		super(col, direction, loc, g);
	}
	
	public String toString(){
		return "ROCK";
	}

}
