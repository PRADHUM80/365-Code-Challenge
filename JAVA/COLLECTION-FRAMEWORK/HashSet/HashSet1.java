// package JAVA.COLLECTION-FRAMEWORK.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

    public static void main(String[] args) {
        
          // Create a HashSet of strings
        Set<String> techTools = new HashSet<>();

        // Adding elements to the HashSet
        techTools.add("Git");
        techTools.add("Docker");
        techTools.add("Kubernetes");
        techTools.add("Git"); // Duplicate element, will not be added

        // Display the elements (order may vary)
        System.out.println("Tech Tools: " + techTools);

        // Removing an element
        techTools.remove("Docker");
        System.out.println("After removing Docker: " + techTools);

        // Checking if an element exists
        if (techTools.contains("Kubernetes")) {
            System.out.println("Kubernetes is in the tech tools set.");
        } else {
            System.out.println("Kubernetes is not in the tech tools set.");
        }
    }
    
}
