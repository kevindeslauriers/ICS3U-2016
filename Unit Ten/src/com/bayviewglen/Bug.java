package com.bayviewglen.interfacetest;

import java.awt.Color;

public class Bug extends Actor {

	public Bug(Location loc, Grid g){
		super(Color.BLACK, DIRECTION.NORTH, null, null);
	}
	
	public Bug(Color col, int direction, Location loc, Grid g){
		super(col, direction, loc, g);
	}
	

	@Override
	public void act() {
		if (canMove()){
			Grid g = getGrid();
			Location adjLoc = g.getAdjacentLocation(getLocation(), getDirection());
			Actor a = g.getActor(adjLoc);
			if (a != null){
				a.removeSelfFromGrid();
			}
			move(adjLoc);
		}else {
			rotate();
		}
		
	}

	private boolean canMove() {
		Grid g = getGrid();
		// check it is a valid location
		Location adjLoc = g.getAdjacentLocation(getLocation(), getDirection());
		 
		if (g.validLocation(adjLoc)){
			Actor a = g.getActor(adjLoc);
			if (a instanceof Rock){
				return false;
			}else if (a instanceof Flower){
				return true;
			}else if (a instanceof Bug){
				return false;
			} else if (a == null){
				return true;
			}
		}
		
		return false;
	}

	private void move(Location newLoc) {
		Grid g = getGrid();
		g.moveTo(getLocation(), newLoc);
		
	}

	private void rotate() {
		int newDirection = (getDirection() + 90)%360;
		setDirection(newDirection);
		
	}
	
	public String toString(){
		return "BUG - " + getDirection();
	}

}
