// package JAVA.Control-Constructs;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Not Positive");
        }
    }
}
