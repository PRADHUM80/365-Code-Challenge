
import java.util.Scanner;
import java.util.ArrayList;

public class LinkedList3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ArrayList 1: " );
        int n1 = sc.nextInt();
        ArrayList<String> a = new ArrayList<String>();
        for(int i = 0; i < n1; i++) {
            a.add(sc.next());
        }

        
        System.out.println("ArrayList 2: ");
        int n2 = sc.nextInt();
        ArrayList<String> b = new ArrayList<String>();
        for(int i = 0; i < n2 ; i++) {
            b.add(sc.next());
        }

        ArrayList<String> c = new ArrayList(a);
        c.addAll(b);

        System.out.println("ArrayList 1: " + String.join(" ", a));
        System.out.println("ArrayList 2: " + String.join(" " , b));
        System.out.println("New ArrayList: " + String.join(" ", c));

    }
    
}
