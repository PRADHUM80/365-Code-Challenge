// package JAVA.COLLECTION-FRAMEWORK.TreeSet;

import java.util.TreeSet;
import java.util.Set;

public class TreeSet2 {

    public static void main(String[] args) {


        // Create a TreeSet of String
        Set<String> ts  = new TreeSet<>();

        // Add Elements to the TreeSet
        ts.add("java");
        ts.add("python");
        ts.add("javaScript");
        ts.add("C");
        ts.add("C++");

        ts.add("java"); // Duplicate elements, will not be added
        ts.add("python"); // Duplicate elements, will not be added

        // Print the TreeSet
        System.out.println("Languages in TreeSet : " + ts);

        // Remove an Elements..
        ts.remove("C++");
        System.out.println("After Removing C++ : " + ts);

        // Checks if an elements is present in the TreeSet
        System.out.println("Is java present in the TreeSet? " + ts.contains("java"));
        System.out.println("Is C++ present in the TreeSet? " + ts.contains("C++"));

        // Retirve of the First and Last Elements
        System.out.println("First Element : " + ((TreeSet<String>) ts).first());
        System.out.println("Last Element : " + ((TreeSet<String>) ts).last());

    
    }
    
}
