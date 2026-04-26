// package JAVA.COLLECTION-FRAMEWORK.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
public class LinkedList1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        LinkedList<String> ad = new LinkedList<>();

        int n = sc.nextInt();

        sc.nextLine();
        for(int i =0; i <n; i++)
        {
            ad.addFirst(sc.nextLine());
        }

        System.out.println("number of tasks : " + n);
        System.out.println("task");

        for(Object x : ad)
        {
            System.out.println(x + " ");
        }
    }
    
}
