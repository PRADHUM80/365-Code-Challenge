// package JAVA.COLLECTION-FRAMEWORK.LIST;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Read
        System.out.println("Enter the no of Elements: ");
        int n = sc.nextInt();

        // create an arraylist
        ArrayList<Object> al = new ArrayList<>();

        // Add elements to the ArrayList
        for(int i = 0; i < n; i++)
        {
            int element = sc.nextInt();
            al.add(element);
        }

        // Print Size..
        System.out.println(al.size());

        // print elements..
        for(Object x : al)
        {
            System.out.println(x + " ");
        }
    }
    
}
