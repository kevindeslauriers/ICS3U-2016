package com.bayviewglen.regional2011;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import com.bayviewglen.algorithms.BreadthFirstPaths;
import com.bayviewglen.datastructures.Cell;
import com.bayviewglen.datastructures.Cell_3D;
import com.bayviewglen.datastructures.Graph;
import com.bayviewglen.utils.StdOut;
import com.bayviewglen.utils.Utils;

public class Problem4_Central {

	public static void main(String[] args) throws FileNotFoundException {
		ECOO_2011_Problem4_Regional_Central();
	}
	
	private static void ECOO_2011_Problem4_Regional_Central() throws FileNotFoundException{
		Scanner input = new Scanner(new File("input/regionalCentral_q4.dat"));
		
    	Graph G = new Graph(5, 5, 5, false, false, true);	
    	// top left corner is vertex 0.
    	HashMap<Cell_3D, Integer> cellVertexMap = Utils.create3DGridHashMap(5, 5, 5);
    	while(input.hasNext()){
    		// we subtract one because our grid uses 0,0 as the starting position and the question uses 1,1
    		String startLine = input.nextLine();
    		Cell_3D startingCell = new Cell_3D(Integer.parseInt(startLine.split(" ")[0]), Integer.parseInt(startLine.split(" ")[1]), Integer.parseInt(startLine.split(" ")[2]),1);
    		String finishLine = input.nextLine();
    		Cell_3D finishCell = new Cell_3D(Integer.parseInt(finishLine.split(" ")[0]), Integer.parseInt(finishLine.split(" ")[1]), Integer.parseInt(finishLine.split(" ")[2]),1);
    	
    		int start = cellVertexMap.get(startingCell);
    	
	    	Cell_3D[] queenMoves = new Cell_3D[7];
	    	
	    	queenMoves[0] = new Cell_3D(4,4,4);
	    	queenMoves[1] = new Cell_3D(2,2,2);
	    	queenMoves[2] = new Cell_3D(0,4,4);
	    	queenMoves[3] = new Cell_3D(2,2,2);
	    	queenMoves[4] = new Cell_3D(0,0,4);
	    	queenMoves[5] = new Cell_3D(2,2,2);
	    	queenMoves[6] = new Cell_3D(0,0,0);
	    	
	    	BreadthFirstPaths bfs = new BreadthFirstPaths(G, start, queenMoves, 5, 5, 5);
	    	
	    	Integer v = cellVertexMap.get(finishCell);
	    	
	    	if (bfs.hasPathTo(v)) {
	            StdOut.printf("There are  %d knight moves from %s to %s", bfs.distTo(v), startingCell.toString(), finishCell.toString());
	            StdOut.println();
	        }
	
	        else {
	            StdOut.printf("%d to %d (-):  not connected\n", start, v);
	        }
    	}
    }

}
