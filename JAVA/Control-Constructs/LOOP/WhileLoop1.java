package LOOP;

import java.util.Scanner;

public class WhileLoop1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        while(n > 0)
        {
            System.out.println(n);
            n--;
        }
        System.out.println("Blastoff!");
    }
}
