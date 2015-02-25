package com.bayviewglen.datastructures;

/**
 * CSE 373, Winter 2011, Jessica Miller
 * An interface that defines the operations for a PrioityQueue ADT for any type.
 */
public interface PriorityQueue<T> {
    /** 
     * Adds a value to the priority queue.
     */      
    public void add(T value);

    /** 
     * Tests if the priority queue is empty.
     */       
    public boolean isEmpty();
    
    /**
     * Returns, but does not delete the element at the top of the priority
     * queue.
     * @return the element at the top of the priority queue
     * @throws IllegalStateException if priority queue is empty
     */     
    public T peek();

    /**
     * Deletes and returns the element at the top of the priority queue.
     * @return the element at the top of the priority queue
     * @throws IllegalStateException if priority queue is empty
     */       
    public T remove();
}
