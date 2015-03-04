package com.bayviewglen.algorithms;

import java.io.File;

import com.bayviewglen.datastructures.Graph;
import com.bayviewglen.datastructures.Stack;
import com.bayviewglen.utils.In;
import com.bayviewglen.utils.StdOut;


/*************************************************************************
 *  Compilation:  javac DepthFirstPaths.java
 *  Execution:    java DepthFirstPaths G s
 *  Dependencies: Graph.java Stack.java StdOut.java
 *  Data files:   http://algs4.cs.princeton.edu/41undirected/tinyCG.txt
 *
 *  Run depth first search on an undirected graph.
 *  Runs in O(E + V) time.
 *
 *  %  java Graph tinyCG.txt
 *  6 8
 *  0: 2 1 5 
 *  1: 0 2 
 *  2: 0 1 3 4 
 *  3: 5 4 2 
 *  4: 3 2 
 *  5: 3 0 
 *
 *  % java DepthFirstPaths tinyCG.txt 0
 *  0 to 0:  0
 *  0 to 1:  0-2-1
 *  0 to 2:  0-2
 *  0 to 3:  0-2-3
 *  0 to 4:  0-2-3-4
 *  0 to 5:  0-2-3-5
 *
 *************************************************************************/

/**
 *  The <tt>DepthFirstPaths</tt> class represents a data type for finding
 *  paths from a source vertex <em>s</em> to every other vertex
 *  in an undirected graph.
 *  <p>
 *  This implementation uses depth-first search.
 *  The constructor takes time proportional to <em>V</em> + <em>E</em>,
 *  where <em>V</em> is the number of vertices and <em>E</em> is the number of edges.
 *  It uses extra space (not including the graph) proportional to <em>V</em>.
 *  <p>
 *  For additional documentation, see <a href="/algs4/41graph">Section 4.1</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 */
public class DepthFirstPaths {
    private boolean[] marked;    // marked[v] = is there an s-v path?
    private int[] edgeTo;        // edgeTo[v] = last edge on s-v path
    private final int s;         // source vertex

    /**
     * Computes a path between <tt>s</tt> and every other vertex in graph <tt>G</tt>.
     * @param G the graph
     * @param s the source vertex
     */
    public DepthFirstPaths(Graph G, int s) {
        this.s = s;
        edgeTo = new int[G.V()];
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    // depth first search from v
    private void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    /**
     * Is there a path between the source vertex <tt>s</tt> and vertex <tt>v</tt>?
     * @param v the vertex
     * @return <tt>true</tt> if there is a path, <tt>false</tt> otherwise
     */
    public boolean hasPathTo(int v) {
        return marked[v];
    }

    /**
     * Returns a path between the source vertex <tt>s</tt> and vertex <tt>v</tt>, or
     * <tt>null</tt> if no such path.
     * @param v the vertex
     * @return the sequence of vertices on a path between the source vertex
     *   <tt>s</tt> and vertex <tt>v</tt>, as an Iterable
     */
    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x])
            path.push(x);
        path.push(s);
        return path;
    }

    /**
     * Unit tests the <tt>DepthFirstPaths</tt> data type.
     */
    public static void main(String[] args) {
       
    	//Test #1
    	//test1();
    	
    	// Test #2
    //	test2();
    	
    	// Test #3 - try out the nen Grid Constructotr - since a grid is a great type of application 
    	test3();	// to use a graph. - the dfs crashes quickly with a stack overflow when we have
    				// even a small grid (ie 100x100) and there are no obsticles 
    				// 75 x 75 does work and works quickly.
    }

    private static void test1(){
    	In in = new In(new File("testdata/tinyGraph.dat"));
        Graph G = new Graph(in);
        int start = 0;
        DepthFirstPaths dfs = new DepthFirstPaths(G, start);

        for (int v = 0; v < G.V(); v++) {
            if (dfs.hasPathTo(v)) {
                StdOut.printf("%d to %d:  ", start, v);
                for (int x : dfs.pathTo(v)) {
                    if (x == start) StdOut.print(x);
                    else        StdOut.print("-" + x);
                }
                StdOut.println();
            }

            else {
                StdOut.printf("%d to %d:  not connected\n", start, v);
            }

        }
        in.close();
    }
    
    private static void test2(){
    	In in = new In(new File("testdata/tinyGraph.dat"));
        Graph G = new Graph(in);
        int s = 2;
        DepthFirstPaths dfs1 = new DepthFirstPaths(G, s);
        if (dfs1.hasPathTo(5)) {
	        for (int x : dfs1.pathTo(5)) {
	            if (x == s) StdOut.print(x);
	            else        StdOut.print("-" + x);
	        }
        }
        in.close();
    }
    
    private static void test3(){
    	Graph G = new Graph(100,100, true);	// graph where you can only go up and down and left and right.
    	// top left corner is vertex 0.
    	int s = 0;
    	 DepthFirstPaths dfs1 = new DepthFirstPaths(G, s);
         if (dfs1.hasPathTo(21)) {
 	        for (int x : dfs1.pathTo(21)) {
 	            if (x == s) StdOut.print(x);
 	            else        StdOut.print("-" + x);
 	        }
         }
    }
    
}
