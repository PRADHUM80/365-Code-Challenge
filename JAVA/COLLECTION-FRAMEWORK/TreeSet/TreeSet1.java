// package JAVA.COLLECTION-FRAMEWORK.TreeSet;







// TreeSet is a sorted set that does not allow duplicate elements and maintains the natural ordering of its elements.

        // TreeSet does not allow null values and will throw a NullPointerException if you try to add a null element.

        // TreeSet is implemented as a Red-Black tree, which is a self-balancing binary search tree. This allows for efficient insertion, deletion, and search operations.

        // TreeSet provides methods for navigating the set, such as first(), last(), higher(), lower(), ceiling(), and floor().

        // TreeSet is not synchronized, so if you need to use it in a multi-threaded environment, you should consider using Collections.synchronizedSortedSet() to wrap it.

        // TreeSet does not maintain the order of insertion. If you need to maintain the order of insertion, you can use LinkedHashSet instead.

        // TreeSet is part of the Java Collections Framework and implements the Set interface, which means it does not allow duplicate elements.

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {


        TreeSet<String> ts = new TreeSet<>();
        ts.add("Apple");
        ts.add("Banana");
        ts.add("Cherry");

        System.out.println(ts); 

        
    }
}
