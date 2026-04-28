// package JAVA.COLLECTION-FRAMEWORK.QueueInterface;

import java.util.*;


public class Priority1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);
        System.out.println(pq); //[20, 15, 10, 5]

        pq.remove();
        System.out.println(pq); //[15, 10, 5]

        pq.poll();
        System.out.println(pq); //[10, 5]

        pq.peek();
        System.out.println(pq); //[10, 5]
    }
    
}
