// package JAVA.OOPS.Inheritance;

class Animal
{
    void sound()
    {
        System.out.println("Animal is making Sound");
    }
}

class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Dog is Barking");
    }
}

public class MethodOverriddingInheri5 {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
    
}
