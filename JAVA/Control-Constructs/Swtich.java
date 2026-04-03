// package JAVA.Control-Constructs;

import java.util.Scanner;

public class Swtich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month: ");
        int month = sc.nextInt();

            switch(month){
            case 1:
            case 2:
            case 12:
            System.out.println("Winter");
            break;
            case 3:
            case 4:
            case 5:
            System.out.println("Spring");
            break;
            case 6:
            case 7:
            case 8:
            System.out.println("Summer");
            break;
            default:
            System.out.println("Autumn");
            break;
        }   
    }
}
