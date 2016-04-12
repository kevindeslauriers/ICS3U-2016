package com.bayviewglen.interfacetest;

import java.awt.Color;

public class GrassHopper extends Bug {

	public GrassHopper(Color col, int direction, Location loc, Grid g) {
		super(col, direction, loc, g);
	}
	
	public GrassHopper(Location loc, Grid g){
		super(Color.BLACK, DIRECTION.NORTH, null, null);
	}
	
	@Override
	public void act() {
		if (canMove()){
			Grid g = getGrid();
			Location adjLoc = g.getAdjacentLocation(getLocation(), getDirection());
			Actor a = g.getActor(adjLoc);
			if (a == null){
				move(adjLoc);
			} else if (a instanceof Flower){
				a.removeSelfFromGrid();
				move(adjLoc);
			} else {
				Location nextLocation = g.getAdjacentLocation(adjLoc, getDirection());
				a = g.getActor(nextLocation);
				if (a == null){
					move(nextLocation);
				}else{
					a.removeSelfFromGrid();
					move(nextLocation);
				}
			}
		}else {
			rotate();
		}
		
	}
	 
	protected boolean canMove() {
		Grid g = getGrid();
		// check it is a valid location
		Location adjLoc = g.getAdjacentLocation(getLocation(), getDirection());
		 
		if (g.validLocation(adjLoc)){
			Actor a = g.getActor(adjLoc);
			if (a instanceof Flower || a == null){
				return true;
			} else {
				Location nextLocation = g.getAdjacentLocation(adjLoc, getDirection());
				if (g.validLocation(nextLocation)){
					a = g.getActor(nextLocation);
					if (a instanceof Flower || a == null){
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	public String toString(){
		return "GrassHopper - " + getDirection();
	}

}
