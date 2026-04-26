// package JAVA.COLLECTION-FRAMEWORK.LIST;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Read the no of Strings");
        int n = sc.nextInt();

        ArrayList<String> al = new ArrayList<>();

        for(int i =0 ; i < n; i++)
        {
            al.add(sc.next());
        }

        System.out.println("Updated ArrayList" + al);

    
        int a = sc.nextInt();
        String str = sc.next();

        al.add(a, str);

        for(Object x : al)
        {
            System.out.println(x + " ");
        }
    }
    
}
