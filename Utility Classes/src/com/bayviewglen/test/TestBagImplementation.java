package com.bayviewglen.test;

import com.bayviewglen.datastructures.Bag;
import com.bayviewglen.utils.*;

public class TestBagImplementation {
    /**
     * Unit tests the <tt>Bag</tt> data type.
     */
    public static void main(String[] args) {
        Bag<String> bag = new Bag<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            bag.add(item);
        }

        StdOut.println("size of bag = " + bag.size());
        for (String s : bag) {
            StdOut.println(s);
        }
    }
}
