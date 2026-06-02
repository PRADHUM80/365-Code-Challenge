// package JAVA.COLLECTION-FRAMEWORK.TreeSet;

import java.util.*;

public class KSmallet {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        TreeSet<Integer> unique = new TreeSet<>();

        for(int i = 0; i < n; i++)
        {
            int num = sc.nextInt();
            unique.add(num);
        }

        System.out.println("Read the value of K: ");
        int k = sc.nextInt();

         // If k is greater than the size of the TreeSet, print "Invalid k"
        if (k > unique.size() || k < 1) {
            System.out.println("Invalid k");
        } else {
            // Find the Kth smallest element using an iterator
            Iterator<Integer> iterator = unique.iterator();
            int count = 0;
            int kthElement = -1;

            while (iterator.hasNext()) {
                int element = iterator.next();
                count++;
                if (count == k) {
                    kthElement = element;
                    break;
                }
            }

            // Print the Kth smallest element
            System.out.println(kthElement);
        }    
    }
    
}
