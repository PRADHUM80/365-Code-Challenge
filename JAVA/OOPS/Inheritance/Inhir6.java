// package JAVA.OOPS.Inheritance;

class Person
{
    String name = "Roney";
    void display()
    {
        System.out.println("Name: " + name);
    }
}

class Student extends Person
{
    void study()
    {
        System.out.println("Student is Studying");
    }
}

public class Inhir6 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        s.study();
    }
    
}
