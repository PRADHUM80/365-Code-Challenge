// package JAVA.COLLECTION-FRAMEWORK.LIST;

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList5 {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.println("ENter the NO: ");
        int n = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();
        
        // read
        for(int i = 0; i < n; i++)
        {
            al.add(sc.nextInt());
        }

        // read index value from user
        int index = sc.nextInt();

        // print index elements

        System.out.println(al.get(index));
    }
    
}
