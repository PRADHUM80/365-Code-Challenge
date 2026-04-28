// package JAVA.COLLECTION-FRAMEWORK.QueueInterface;

import java.lang.reflect.Array;
import java.util.ArrayDeque;


public class ArrayDeque1 {

    public static void main(String[] args) {
        
        ArrayDeque<String> ad = new ArrayDeque<>();

        // add() and offer()
        ad.add("Raja");
        ad.addLast("Rani");
        ad.addFirst("Balu");
        ad.addLast("Manogo");
        System.out.println(ad); //[Balu, Raja, Rani, Manogo]

        // remove() and poll()
        ad.remove();
        System.out.println(ad); //[Raja, Rani, Manogo]

        ad.removeLast();
        System.out.println(ad); //[Raja, Rani]

        // peek() and element()
        ad.peek();
        System.out.println(ad); //[Raja, Rani]


        


    }
    
}
