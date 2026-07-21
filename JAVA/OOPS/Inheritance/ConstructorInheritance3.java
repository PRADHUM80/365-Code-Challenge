// package JAVA.OOPS.Inheritance;

// package JAVA.OOPS;

class Animal
{
    Animal()
    {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal
{
    Dog()
    {
        System.out.println("Dog Constructor");
    }
}


public class ConstructorInheritance3 {

    public static void main(String[] args) {
        
        Dog d = new Dog();
    }
    
}
