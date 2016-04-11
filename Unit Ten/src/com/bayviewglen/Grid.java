package com.bayviewglen.interfacetest;

public class Grid {
	Actor[][] actors;
	
	public Grid(){
		actors = new Actor[10][10];
	}
	
	public Grid(int w, int h){
		actors = new Actor[w][h];
	}

	public void step(){
		for (int i=0; i<actors.length; ++i){
			for (int j=0; j<actors[i].length; ++j){
				if (actors[i][j] != null)
					actors[i][j].act();
			}
		}
	}

	public Actor removeFromGrid(Location loc){
		Actor temp = actors[loc.getX()][loc.getY()];
		actors[loc.getX()][loc.getY()] = null;

		return temp;
	}
	
	public Boolean validLocation(Location loc){
		
		return (loc.getY() >= 0) && (loc.getX() >= 0) && (loc.getY() < actors[0].length) && (loc.getX() < actors.length);
	}
	
	public Location getAdjacentLocation(Location loc, int dir){
		int y = 0;
		int x = 0;
		
		if (dir == DIRECTION.NORTH){
			y--;
		}else if (dir == DIRECTION.NORTH_EAST){
			y--;
			x++;
		}else if (dir == DIRECTION.EAST){
			x++;
		}else if (dir == DIRECTION.SOUTH_EAST){
			y++;
			x++;
		}else if (dir == DIRECTION.SOUTH){
			y++;
		}else if (dir == DIRECTION.SOUTH_WEST){
			y++;
			x--;
		}else if (dir == DIRECTION.WEST){
			y--;
		}else if (dir == DIRECTION.NORTH_WEST){
			y--;
			x--;
		}
		
		return new Location (loc.getX() + x, loc.getY() + y);
		
	}
	
	public Actor getActor(Location loc){
		return actors[loc.getX()][loc.getY()];
	}
	
	public void addToGrid(Actor a, Location loc){
		actors[loc.getX()][loc.getY()] = a;
	}

	public void display() {
		for (Actor[] actorRow : actors){
			for (Actor a : actorRow){
				System.out.print(a);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
	}

	public void moveTo(Location oldLoc, Location newLoc) {
		
		actors[newLoc.getX()][newLoc.getY()] = actors[oldLoc.getX()][oldLoc.getY()];
		actors[oldLoc.getX()][oldLoc.getY()] = null;
		
	}
	
}
