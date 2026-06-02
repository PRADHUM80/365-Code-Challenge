// package JAVA.COLLECTION-FRAMEWORK.TreeSet;

import java.util.*;

public class Merged2Set {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Read the value1");
        int n1 = sc.nextInt();

        TreeSet<Integer> mergedSet = new TreeSet<>();

        for(int i = 0; i < n1; i++)
        {
            int num = sc.nextInt();
            mergedSet.add(num);
        }

        System.out.println("Read the value2");
        int n2 = sc.nextInt();

        for(int i = 0; i < n2; i++)
        {
            int num = sc.nextInt();
            mergedSet.add(num);
        }


        //  if The TreeSet is Empty
        if(mergedSet.isEmpty())
        {
            System.out.println("No Elements...");
        } 
        
        
        else {
            for(Integer num : mergedSet)
            {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

}
