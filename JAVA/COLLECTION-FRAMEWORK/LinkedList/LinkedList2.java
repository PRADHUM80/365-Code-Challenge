
import java.util.Scanner;
import java.util.LinkedList;

public class LinkedList2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList ad  = new LinkedList();

        System.out.println("Read n");
        int n = sc.nextInt();

        sc.nextLine();

        for(int i = 0; i< n; i++)
        {
            ad.add(sc.nextLine());
        }

        System.out.println("first Attendence : " + ad.getFirst());
        System.out.println("Last Attendence : " + ad.getLast());
        System.out.println("no of Students: " + n);


        for(Object x : ad)
        {
            System.out.println(x + " ");
        }
    }
    
}
