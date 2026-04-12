package LOOP;

import java.util.Scanner;

public class whileLoop2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int fact = 1;
        while (n > 0)
        {
            fact = fact * n;
            n--;
        }
        System.out.println("Factorial is : " + fact);
    }
}
