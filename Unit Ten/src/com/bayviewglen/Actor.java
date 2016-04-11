package com.bayviewglen.interfacetest;

import java.awt.Color;

public abstract class Actor implements Locatable{
	private Color color;
	private int direction; // 0 - 359
	private Location location;
	private Grid myGrid;
	
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Actor(){
		color = Color.BLACK;
		direction = DIRECTION.NORTH;
	}
	
	public Actor(Color color, int direction, Location loc, Grid g) {
		this.color = color;
		this.direction = direction;
		this.location = loc;
		this.myGrid = g;
		if (g != null)
			this.myGrid.addToGrid(this, loc);
		
	}
	
	public abstract void act();
	
	public void removeSelfFromGrid(){
		myGrid.removeFromGrid(location);
		myGrid = null;
		location = null;
		
	}
	
	public Grid getGrid(){
		return myGrid;
	}
	
}
