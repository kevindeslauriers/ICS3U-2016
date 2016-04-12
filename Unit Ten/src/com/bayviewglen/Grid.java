package com.bayviewglen.interfacetest;

public class Grid {
	Actor[][] actors;
	
	public Grid(){
		actors = new Actor[10][10];
	}
	
	public Grid(int h, int w){
		actors = new Actor[h][w];
	}

	public void step(){
		for (int i=0; i<actors.length; ++i){
			for (int j=0; j<actors[i].length; ++j){
				if (actors[i][j] != null && !actors[i][j].hasActed()){
					Actor a = actors[i][j];
					actors[i][j].act();
					a.setActed(true);
				}
			}
		}
		
		/* ensure after each step that the actors can act again */
		for (int i=0; i<actors.length; ++i){
			for (int j=0; j<actors[i].length; ++j){
				if (actors[i][j] != null){
					actors[i][j].setActed(false);
				}
			}
		}
	}

	public Actor removeFromGrid(Location loc){
		Actor temp = actors[loc.getRow()][loc.getCol()];
		actors[loc.getRow()][loc.getCol()] = null;

		return temp;
	}
	
	public Boolean validLocation(Location loc){
		
		return (loc.getCol() >= 0) && (loc.getRow() >= 0) && (loc.getCol() < actors[0].length) && (loc.getRow() < actors.length);
	}
	
	public Location getAdjacentLocation(Location loc, int dir){
		int row = 0;
		int col = 0;
		
		if (dir == DIRECTION.NORTH){
			row--;
		}else if (dir == DIRECTION.NORTH_EAST){
			row--;
			col++;
		}else if (dir == DIRECTION.EAST){
			col++;
		}else if (dir == DIRECTION.SOUTH_EAST){
			row++;
			col++;
		}else if (dir == DIRECTION.SOUTH){
			row++;
		}else if (dir == DIRECTION.SOUTH_WEST){
			row++;
			col--;
		}else if (dir == DIRECTION.WEST){
			col--;
		}else if (dir == DIRECTION.NORTH_WEST){
			row--;
			col--;
		}
		
		return new Location (loc.getRow() + row, loc.getCol() + col);
		
	}
	
	public Actor getActor(Location loc){
		return actors[loc.getRow()][loc.getCol()];
	}
	
	public void addToGrid(Actor a, Location loc){
		actors[loc.getRow()][loc.getCol()] = a;
	}

	public void display() {
		for (int i = 0; i< actors.length; ++i){
			for (int j = 0; j< actors[i].length; ++j){
				System.out.print(actors[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Step Completed\n");
		
	}

	public void moveTo(Location oldLoc, Location newLoc) {
		
		actors[newLoc.getRow()][newLoc.getCol()] = actors[oldLoc.getRow()][oldLoc.getCol()];
		actors[oldLoc.getRow()][oldLoc.getCol()] = null;
		
	}
	
}
