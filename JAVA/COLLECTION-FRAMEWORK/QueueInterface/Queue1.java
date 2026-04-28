// package JAVA.COLLECTION-FRAMEWORK.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {

    public static void main(String[] args) {
        
        // Enqueue  - add() and offer()

        Queue<String> q = new LinkedList<>();
        q.add("Raja");
        q.add("Rani");
        q.add("Balu");
        q.add("Anshu");


        System.out.println(q); //[Raja, Rani, Balu, Anshu]

        q.offer("Raja");
        System.out.println(q); //[Raja, Rani, Balu, Anshu, Raja]

        q.add("Priti");
        System.out.println(q); //[Raja, Rani, Balu, Anshu, Raja, Priti]

        

        // Dequeue - remove() and poll()

        q.remove(q);
        System.out.println(q);  //[Rani, Balu, Anshu]

        q.poll();
        System.out.println(q);  //[Balu, Anshu]

        // peek() and element()

        q.peek();
        System.out.println(q);  //[Balu, Anshu]
        q.element();
        System.out.println(q);  //[Balu, Anshu]



    }
    
}
