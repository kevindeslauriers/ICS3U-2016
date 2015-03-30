
package com.bayviewglen.datastructures;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

import com.bayviewglen.utils.In;
import com.bayviewglen.utils.StdOut;
import com.bayviewglen.utils.Utils;

/*************************************************************************
 *  Compilation:  javac Graph.java        
 *  Execution:    java Graph input.txt
 *  Dependencies: Bag.java In.java StdOut.java
 *  Data files:   http://algs4.cs.princeton.edu/41undirected/tinyG.txt
 *
 *  A graph, implemented using an array of sets.
 *  Parallel edges and self-loops allowed.
 *
 *  % java Graph tinyG.txt
 *  13 vertices, 13 edges 
 *  0: 6 2 1 5 
 *  1: 0 
 *  2: 0 
 *  3: 5 4 
 *  4: 5 6 3 
 *  5: 3 4 0 
 *  6: 0 4 
 *  7: 8 
 *  8: 7 
 *  9: 11 10 12 
 *  10: 9 
 *  11: 9 12 
 *  12: 11 9 
 *
 *  % java Graph mediumG.txt
 *  250 vertices, 1273 edges 
 *  0: 225 222 211 209 204 202 191 176 163 160 149 114 97 80 68 59 58 49 44 24 15 
 *  1: 220 203 200 194 189 164 150 130 107 72 
 *  2: 141 110 108 86 79 51 42 18 14 
 *  ...
 *  
 *************************************************************************/


/**
 *  The <tt>Graph</tt> class represents an undirected graph of vertices
 *  named 0 through <em>V</em> - 1.
 *  It supports the following two primary operations: add an edge to the graph,
 *  iterate over all of the vertices adjacent to a vertex. It also provides
 *  methods for returning the number of vertices <em>V</em> and the number
 *  of edges <em>E</em>. Parallel edges and self-loops are permitted.
 *  <p>
 *  This implementation uses an adjacency-lists representation, which 
 *  is a vertex-indexed array of {@link Bag} objects.
 *  All operations take constant time (in the worst case) except
 *  iterating over the vertices adjacent to a given vertex, which takes
 *  time proportional to the number of such vertices.
 *  <p>
 *  For additional documentation, see <a href="http://algs4.cs.princeton.edu/41undirected">Section 4.1</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 */
public class Graph {
    private final int V;
    private int E;
    private Bag<Integer>[] adj;
    
    
    public Graph(){
    	this.V = 0;
        this.E = 0;
    }
    
    /**
     * Initializes an empty graph with <tt>V</tt> vertices and 0 edges.
     * param V the number of vertices
     * @throws java.lang.IllegalArgumentException if <tt>V</tt> < 0
     */
    public Graph(int V) {
        if (V < 0) throw new IllegalArgumentException("Number of vertices must be nonnegative");
        this.V = V;
        this.E = 0;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }
    
    public Graph(int rows, int cols, boolean allowAdjacent, boolean allowDiagonals, boolean allowKnights) {
        
    	if (rows < 0 || cols < 0) throw new IllegalArgumentException("Rows and Cols of grid must be nonnegative");
    	
        this.V = rows*cols;
        this.E = 0;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
        
        // now we need to add the edges
        // if allowDiagonals is false || true then we can only go up down left and right.
        if (allowAdjacent){
	        for (int i=0;i<rows*cols; i++){
		        if ((i+1)%cols != 0)
		        	addEdge(i,i+1);	// adds an edge to the right and vice versa
		        
		        if (i%cols != 0)
		        	addEdge(i,i-1);	// adds an edge to the left and vice versa
		        
		        if (i<rows*cols-cols)
		        	addEdge(i,i+cols);
		        
		        if (i>cols)
		        	addEdge(i,i-cols);
	        }
        }
        
        // if allowDiagonals is true then we can also go in the four diagonals -> adjacent Diagonals
        if (allowDiagonals){
        	for (int i=0;i<rows-1;i++){		// bottom right
        		for (int j=0;j<cols-1;j++){
        			//System.out.println((i*cols+j) + " -> " + ((i+1)*cols+j+1));
        			addEdge(i*cols+j,(i+1)*cols+j+1);
        		}
        	}
        	
        	for (int i=0;i<rows-1;i++){		// bottom left
        		for (int j=1;j<cols;j++){
        			//System.out.println((i*cols+j) + " -> " + ((i+1)*cols+j-1));
        			addEdge(i*cols+j,(i+1)*cols+j-1);
        		}
        	}
        }
        
        if (allowKnights){
        	
        	HashMap<Cell, Integer> cellVertexMap = Utils.createGridHashMap(rows,cols);
        	HashMap<Integer, Cell> vertexCellMap = Utils.createVertexHashMap(rows,cols);
        	
        		for (int i=0;i<rows*cols; i++){	// we have row x col vertices
        			Cell v = vertexCellMap.get(i);
        			Integer j = cellVertexMap.get(new Cell(v.getRow()+2,v.getCol()+1));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell(v.getRow()+2,v.getCol()-1));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell(v.getRow()-2,v.getCol()+1));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell(v.getRow()-2,v.getCol()-1));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell(v.getRow()+1,v.getCol()+2));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell(v.getRow()+1,v.getCol()-2));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell(v.getRow()-1,v.getCol()+2));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell(v.getRow()-1,v.getCol()-2));
        			if (j != null)
        				addEdge(i,j);
        		}
        	
        }
        
    }
    
    public Graph(int x, int y, int z, boolean allowAdjacent, boolean allowDiagonals, boolean allowKnights) {
        
    	if (x < 0 || y < 0 || z < 0) throw new IllegalArgumentException("x, y and z of grid must be nonnegative");
    	
        this.V = x*y*z;
        this.E = 0;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
        
        // now we need to add the edges
        // if allowDiagonals is false || true then we can only go up down left and right.
        if (allowAdjacent){
        	int numCellsInLayer = x*y;
        	for (int j=0;j<z; j++){
        		int translation = numCellsInLayer * j;

		        for (int i=0;i<x*y; i++){
			        if ((i+1)%y != 0)
			        	addEdge(i+translation,i+translation+1);	// adds an edge to the right and vice versa (East)
			        
			        if (i%y != 0)
			        	addEdge(i+translation,i+translation-1);	// adds an edge to the left and vice versa (West)
			        
			        if (i<x*y-y)		// adds an edge to the north if you can 
			        	addEdge(i+translation,i+translation+y);
			        
			        if (i>y)			// adds an edge to the south if you can
			        	addEdge(i+translation,i+translation-y);
			        
			        // add up
			        if (j != 0){
			        	// we can go up
			        	addEdge(i+translation, i+translation-numCellsInLayer);
			        }
			        
			        // add down
			        if (j<z-1){
			        	addEdge(i+translation, i+translation+numCellsInLayer);
			        	// we can go down			        	
			        }
		        }
        	}
        }

        /* Does not work for 3d yet only 2d */
        if (allowDiagonals){
        	for (int i=0;i<x-1;i++){		// bottom right
        		for (int j=0;j<y-1;j++){
        			//System.out.println((i*cols+j) + " -> " + ((i+1)*cols+j+1));
        			addEdge(i*y+j,(i+1)*y+j+1);
        		}
        	}
        	
        	for (int i=0;i<x-1;i++){		// bottom left
        		for (int j=1;j<y;j++){
        			//System.out.println((i*cols+j) + " -> " + ((i+1)*cols+j-1));
        			addEdge(i*y+j,(i+1)*y+j-1);
        		}
        	}
        }
        
        if (allowKnights){
        	
        	HashMap<Cell_3D, Integer> cellVertexMap = Utils.create3DGridHashMap(x,y,z);
        	HashMap<Integer, Cell_3D> vertexCellMap = Utils.create3DVertexHashMap(x,y,z);
        	
        		for (int i=0;i<x*y*z; i++){	// we have row x col vertices
        			Cell_3D v = vertexCellMap.get(i);
        			
        			Integer j = cellVertexMap.get(new Cell_3D(v.getRow()+2,v.getCol()+1, v.getZ()));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()+2,v.getCol()-1, v.getZ()));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()-2,v.getCol()+1, v.getZ()));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()-2,v.getCol()-1, v.getZ()));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()+1,v.getCol()+2, v.getZ()));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()+1,v.getCol()-2, v.getZ()));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()-1,v.getCol()+2, v.getZ()));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()-1,v.getCol()-2, v.getZ()));
        			if (j != null)
        				addEdge(i,j);
        			
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()+1,v.getCol(), v.getZ()+2));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()-1,v.getCol(), v.getZ()+2));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow(),v.getCol()+1, v.getZ()+2));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow(),v.getCol()-1, v.getZ()+2));
        			if (j != null)
        				addEdge(i,j);
        			
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()+1,v.getCol(), v.getZ()-2));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()-1,v.getCol(), v.getZ()-2));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow(),v.getCol()+1, v.getZ()-2));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow(),v.getCol()-1, v.getZ()-2));
        			if (j != null)
        				addEdge(i,j);
        			
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()+2,v.getCol(), v.getZ()+1));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()-2,v.getCol(), v.getZ()+1));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow(),v.getCol()+2, v.getZ()+1));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow(),v.getCol()-2, v.getZ()+1));
        			if (j != null)
        				addEdge(i,j);
        			
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()+2,v.getCol(), v.getZ()-1));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow()-2,v.getCol(), v.getZ()-1));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow(),v.getCol()+2, v.getZ()-1));
        			if (j != null)
        				addEdge(i,j);
        			
        			j = cellVertexMap.get(new Cell_3D(v.getRow(),v.getCol()-2, v.getZ()-1));
        			if (j != null)
        				addEdge(i,j);
        		}
        	
        }
        
        
    }
    

    /**  
     * Initializes a graph from an input stream.
     * The format is the number of vertices <em>V</em>,
     * followed by the number of edges <em>E</em>,
     * followed by <em>E</em> pairs of vertices, with each entry separated by whitespace.
     * @param in the input stream
     * @throws java.lang.IndexOutOfBoundsException if the endpoints of any edge are not in prescribed range
     * @throws java.lang.IllegalArgumentException if the number of vertices or edges is negative
     */
    public Graph(In in) {
        this(in.readInt());
        int E = in.readInt();
        if (E < 0) throw new IllegalArgumentException("Number of edges must be nonnegative");
        for (int i = 0; i < E; i++) {
            int v = in.readInt();
            int w = in.readInt();
            addEdge(v, w);
        }
    }

    /**
     * Initializes a new graph that is a deep copy of <tt>G</tt>.
     * @param G the graph to copy
     */
    public Graph(Graph G) {
        this(G.V());
        this.E = G.E();
        for (int v = 0; v < G.V(); v++) {
            // reverse so that adjacency list is in same order as original
            Stack<Integer> reverse = new Stack<Integer>();
            for (int w : G.adj[v]) {
                reverse.push(w);
            }
            for (int w : reverse) {
                adj[v].add(w);
            }
        }
    }

    /**
     * Returns the number of vertices in the graph.
     * @return the number of vertices in the graph
     */
    public int V() {
        return V;
    }

    /**
     * Returns the number of edges in the graph.
     * @return the number of edges in the graph
     */
    public int E() {
        return E;
    }

    // throw an IndexOutOfBoundsException unless 0 <= v < V
    private void validateVertex(int v) {
        if (v < 0 || v >= V)
            throw new IndexOutOfBoundsException("vertex " + v + " is not between 0 and " + (V-1));
    }

    /**
     * Adds the undirected edge v-w to the graph.
     * @param v one vertex in the edge
     * @param w the other vertex in the edge
     * @throws java.lang.IndexOutOfBoundsException unless both 0 <= v < V and 0 <= w < V
     */
    public void addEdge(int v, int w) {
        validateVertex(v);
        validateVertex(w);
        
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext()){
        	if (it.next() == w)
        		return;
        }
        
        E++;
        adj[v].add(w);
        adj[w].add(v);
    }
    
    /**
     * Removes a vertex from the graph.
     * @param v one vertex in the edge
     * @throws java.lang.IndexOutOfBoundsException unless both 0 <= v < V and 0 <= w < V
     */
    public void disconnectVertex(int v){
    	validateVertex(v);
    	
    	
    	// go through the vertex - and remove all of the edges edges connecting it to some other vertex.
    	Bag<Integer> edges = adj[v];
    	
    	for (Integer w : edges){
    		removeEdge(v,w);
    	}
    }
    /**
     * Removes the undirected edge v-w from the graph.
     * @param v one vertex in the edge
     * @param w the other vertex in the edge
     * @throws java.lang.IndexOutOfBoundsException unless both 0 <= v < V and 0 <= w < V
     */
    public void removeEdge(int v, int w){
    	validateVertex(v);
        validateVertex(w);
        
        E--;
        adj[v].remove(w);
        adj[w].remove(v);
    }


    /**
     * Returns the vertices adjacent to vertex <tt>v</tt>.
     * @return the vertices adjacent to vertex <tt>v</tt> as an Iterable
     * @param v the vertex
     * @throws java.lang.IndexOutOfBoundsException unless 0 <= v < V
     */
    public Iterable<Integer> adj(int v) {
        validateVertex(v);
        return adj[v];
    }

    /**
     * Returns the degree of vertex <tt>v</tt>.
     * @return the degree of vertex <tt>v</tt>
     * @param v the vertex
     * @throws java.lang.IndexOutOfBoundsException unless 0 <= v < V
     */
    public int degree(int v) {
        validateVertex(v);
        return adj[v].size();
    }

    

    /**
     * Returns a string representation of the graph.
     * This method takes time proportional to <em>E</em> + <em>V</em>.
     * @return the number of vertices <em>V</em>, followed by the number of edges <em>E</em>,
     *    followed by the <em>V</em> adjacency lists
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        String NEWLINE = System.getProperty("line.separator");
        s.append(V + " vertices, " + E + " edges " + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (int w : adj[v]) {
                s.append(w + " ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }

    /**
     * Unit tests the <tt>Graph</tt> data type.
     */
    public static void main(String[] args) {
        //In in = new In(new File("testdata/tinyGraph.dat"));
        Graph G = new Graph(4,4,4,false,false,true);
        
     //   G.disconnectVertex(5);
        StdOut.println(G);
    }

}

