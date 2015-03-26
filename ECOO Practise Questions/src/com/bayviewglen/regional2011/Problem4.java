package com.bayviewglen.regional2011;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import com.bayviewglen.algorithms.BreadthFirstPaths;
import com.bayviewglen.datastructures.Cell;
import com.bayviewglen.datastructures.Graph;
import com.bayviewglen.utils.StdOut;
import com.bayviewglen.utils.Utils;

public class Problem4 {

	/* 
	 * This question required a modification to the BFS algorithm. To exclude vertices that woudld cause the knight to be attacked.
	 * Since the chess board uses (1,1) as the top left - when I create a cell after reading from a file I must subtract 1 from the x and y.
	 * Then when I display the cell later I need to add the 1 to the x and y.
	 * 
	 * This was accomplished my adding a new Cell constructor that accepted a translation value. A value to subtract from the row and col before it stores 
	 * it. Then in the toString method of the Cell we add it back before displaying.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		ECOO_2011_Problem4_Regional();
	}
	
	private static void ECOO_2011_Problem4_Regional() throws FileNotFoundException{
		Scanner input = new Scanner(new File("input/regional_q4.dat"));
		
    	Graph G = new Graph(8,8, false, false, true);	
    	// top left corner is vertex 0.
    	HashMap<Cell, Integer> cellVertexMap = Utils.createGridHashMap(8,8);
    	HashMap<Integer, Cell> vertexCellMap = Utils.createVertexHashMap(8,8);
    	while(input.hasNext()){
    		// we subtract one because our grid uses 0,0 as the starting position and the question uses 1,1
    		String startLine = input.nextLine();
    		Cell startingCell = new Cell(Integer.parseInt(startLine.split(" ")[0]), Integer.parseInt(startLine.split(" ")[1]),1);
    		String finishLine = input.nextLine();
    		Cell finishCell = new Cell(Integer.parseInt(finishLine.split(" ")[0]), Integer.parseInt(finishLine.split(" ")[1]),1);
    	
    		int start = cellVertexMap.get(startingCell);
    	
	    	Cell[] rookMoves = new Cell[8];
	    	int xVal = 0;
	    	int yVal = 0;
	    	
	    	// Create all of the move for the rook.
	    	for (int i=0; i<rookMoves.length; ++i){
	    		rookMoves[i] = new Cell(xVal, yVal);
	    		if (i%2 == 0)
	    			xVal += 2;
	    		else
	    			yVal += 2;
	    	}
	    	
	    	BreadthFirstPaths bfs = new BreadthFirstPaths(G, start, rookMoves, 8, 8);
	    	
	    	Integer v = cellVertexMap.get(finishCell);
	    	
	    	if (bfs.hasPathTo(v)) {
	            StdOut.printf("There are  %d knight moves from %s to %s", bfs.distTo(v), startingCell.toString(), finishCell.toString());
	           /*
	            for (int x : bfs.pathTo(v)) {
	                if (x == start) StdOut.print(vertexCellMap.get(x));
	                else        StdOut.print(" -> " + vertexCellMap.get(x));
	            }
	            */
	            StdOut.println();
	        }
	
	        else {
	            StdOut.printf("%d to %d (-):  not connected\n", start, v);
	        }
    	}
    }

}
