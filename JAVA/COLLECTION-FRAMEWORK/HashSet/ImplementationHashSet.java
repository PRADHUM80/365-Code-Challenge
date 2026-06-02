// package JAVA.COLLECTION-FRAMEWORK.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class ImplementationHashSet {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create a HashSet to store unique employee IDs
        HashSet<Integer> employeeIDs = new HashSet<>();

        // Read the number of initial employee IDs (n)
        int n = sc.nextInt();

        // Add n employee IDs to the HashSet
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            employeeIDs.add(id);
        }

        // Perform operations until "STOP" is encountered
        while (true) {
            String operation = sc.next();

            if (operation.equalsIgnoreCase("ADD")) {
                int id = sc.nextInt();
                employeeIDs.add(id);
                System.out.println(employeeIDs);

            } else if (operation.equalsIgnoreCase("REMOVE")) {
                int id = sc.nextInt();
                employeeIDs.remove(id);
                System.out.println(employeeIDs);

            } else if (operation.equalsIgnoreCase("CHECK")) {
                int id = sc.nextInt();
                if (employeeIDs.contains(id)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            } else if (operation.equalsIgnoreCase("PRINT")) {
                if (employeeIDs.isEmpty()) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(employeeIDs);
                }

            } else if (operation.equalsIgnoreCase("STOP")) {
                break;

            } else {
                System.out.println("Invalid operation!");
            }
        }

        sc.close();
    


    }   
}
