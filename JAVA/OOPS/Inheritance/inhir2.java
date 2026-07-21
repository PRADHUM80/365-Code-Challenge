// package JAVA.OOPS.Inheritance;

class Animal
{
    void sound()
    {
        System.out.println("Animal is making sound");
    }
}

class Dog extends Animal
{
    void eat()
    {
        System.out.println("Dog is eating");
    }
}

public class inhir2 {

    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
    
}
