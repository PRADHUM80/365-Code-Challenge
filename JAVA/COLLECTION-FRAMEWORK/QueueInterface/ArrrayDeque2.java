// package JAVA.COLLECTION-FRAMEWORK.QueueInterface;

import java.util.ArrayDeque;
import java.util.Scanner;
public class ArrrayDeque2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Read n");
        int n = sc.nextInt();

        ArrayDeque ad = new ArrayDeque();
        System.out.println("Enter Elements: ");
        for(int i =0; i< n; i++)
        {
            ad.add(sc.next());

        }
        ad.addFirst(sc.nextInt());
        ad.addLast(sc.nextInt());
        System.out.println(ad);

        ad.removeFirst();
        System.out.println(ad);
        ad.removeFirst();
        System.out.println(ad);

        for(Object x : ad)
        {
            System.out.println(x + " ")  ;
            
        }
    }
    
}
