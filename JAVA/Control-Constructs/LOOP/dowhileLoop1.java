package LOOP;

import java.util.Scanner;

// The Code inside  do-while loop is executed at least once, even if the condition is false.
public class dowhileLoop1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        do
        {
            System.out.println(n);
            n--;
        }
        while (n > 0);
    }
}
