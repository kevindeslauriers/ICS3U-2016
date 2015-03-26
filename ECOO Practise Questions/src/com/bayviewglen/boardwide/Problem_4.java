package com.bayviewglen.boardwide;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

import com.bayviewglen.datastructures.Cell;
/*
 * Imagine a forest full of trees. Some trees are considered interior trees, and some are trees on the
 * perimeter. A tree is considered interior, if for every imaginary straight line drawn through the tree, there
 * will always be some trees on either side of the line. For a tree to be on the perimeter, a line may be
 * drawn is such a way, that all trees are either on one side of the line or on the line itself. Given the x-y
 * coordinates of a grove of trees, write a program that will count the number of trees that are on the
 * perimeter.
 */
public class Problem_4 {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("input/q4.dat"));
		HashSet<Cell> marked = new HashSet<Cell>();	
		// we will store the trees that are perimeter trees
		
		int numCells = Integer.parseInt(input.nextLine());
		Cell[] cells = new Cell[numCells];
		
		// we have the cells
		for (int i=0; i<numCells; ++i){
			String t = input.nextLine();
			cells[i] = new Cell(Integer.parseInt(t.split(" ")[0]), Integer.parseInt(t.split(" ")[1]));
		}
		
		for (Cell c1 : cells){
			for (Cell c2 : cells){
				if (!c1.equals(c2) && (!marked.contains(c1) || !marked.contains(c1))){	// as long as both are not already perm trees
					if (isPermTree(c1,c2,cells)){
						marked.add(c1);
						marked.add(c2);
					}	
				}
			}
		}
		
		System.out.println("The are " + marked.size() + " perimeter trees in this grove of " + numCells + " trees.");
		input.close();
	}

	private static boolean isPermTree(Cell c1, Cell c2, Cell[] cells) {
		boolean hasLeft = false;
		boolean hasRight = false;
		
		int Ax = c1.getRow();
		int Bx = c2.getRow();
		
		int Ay = c1.getCol();
		int By = c2.getCol();
		
		for (Cell c : cells){
			int Y = c.getCol();
			int X = c.getRow();
			if (((Bx-Ax)*(Y-Ay) - (By-Ay)*(X-Ax)) < 0)
				hasLeft = true;
			else if (((Bx-Ax)*(Y-Ay) - (By-Ay)*(X-Ax)) > 0)
				hasRight = true;
		}
		
		return !hasLeft || !hasRight;
		
	}
}
