// package JAVA.Control-Constructs;

import java.util.Scanner;

public class MultipleOFNum {
       public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println(num + " is a multiple of 5.");
        } 
        System.out.println("Program Ended.");
    } 
}
