// package JAVA.COLLECTION-FRAMEWORK.LIST;

import java.util.ArrayList;
public class ArrayList2 {

    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();

        System.out.println(al.size()); // 0
        
        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println(al);
        System.out.println(al.size()); // 3

        System.out.println(al.contains(10)); // True

        System.out.println(al.get(1)); // 20

        System.out.println(al.remove(3));
        System.out.println(al);

        System.out.println(al.add(40));

        System.out.println(al);



    }
    
}
