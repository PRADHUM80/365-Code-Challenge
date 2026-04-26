// package JAVA.COLLECTION-FRAMEWORK.LIST;


import java.util.ArrayList;
public class ArrayList3 {

    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        al.add("RAJA");
        al.add("BALU");
        al.add("RANI");
        al.add("BABU");

        // System.out.println(al);

        // for(int i = 0; i < al.size(); i++)
        // {
        //     System.out.println(al.get(i) + " ");
        // }


        // enhanced for loop
        for(Object x : al)
        {
            System.out.println(x + " ");
        }

    }
    
}
