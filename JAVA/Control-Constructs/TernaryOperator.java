// package JAVA.Control-Constructs;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Age:");
        int age = sc.nextInt();
        String Eligible = (age >= 18)?"Eligible" : "not Eligible";
        System.out.println(Eligible);
    }
}
