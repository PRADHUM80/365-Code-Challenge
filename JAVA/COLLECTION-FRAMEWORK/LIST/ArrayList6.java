// package JAVA.COLLECTION-FRAMEWORK.LIST;

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No of Elemnts");
        int n = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i< n; i++)
        {
            al.add(sc.nextInt());
        }

        // read new Index Value from SET
        int a = sc.nextInt();
        int b = sc.nextInt();

        al.set(a, b);

        System.out.println("Updated ArrayList: " + al);
        for(Object x : al)
        {
            System.out.println(x + " ");
        }



    
    }
    
}
