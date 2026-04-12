package Patterns;

public class Patterns2 {
    public static void main(String[] args) {
        for(int i= 1; i <=5; i++) // Row
        {
            for(int j = 1; j <= 6; j++) // Colmn
            {
                System.out.print("X");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
