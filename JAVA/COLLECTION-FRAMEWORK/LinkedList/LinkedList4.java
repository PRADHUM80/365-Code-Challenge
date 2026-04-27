
import java.util.Scanner;
import java.util.LinkedList;


public class LinkedList4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Read n");
        int n = sc.nextInt();
        LinkedList ad = new LinkedList();
        System.out.println("Enter Elements: ");
        for(int i =0; i< n; i++)
        {
            ad.add(sc.next());

        }

        System.out.println("Colors Before Swapping : " + ad);
        for(Object x : ad)
        {
            System.out.println(x + " ");
        }

        Object temp = ad.get(0);
        ad.set(0, ad.get(2));
        ad.set(2, temp);

        System.out.println("After Swapping : " + ad);
        for(Object p : ad)
        {
            System.out.println(p + " ");
        }
    }
    
}
