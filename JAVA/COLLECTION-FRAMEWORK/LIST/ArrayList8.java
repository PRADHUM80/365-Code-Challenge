
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of n: ");
        int n = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0; i< n; i++)
        {
            al.add(sc.nextInt());
        }

        System.out.println("Enter the Remove Indexed: ");
        int a = sc.nextInt();

        System.out.println("Updated Array" + al);

        al.remove(a);

        for(Object x : al){
            System.out.print(x + " ");
        }
        
    }
}
