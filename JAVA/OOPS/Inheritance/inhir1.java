// package JAVA.OOPS;
// inheritance :- inheritance is a Mecahnism where a new class(CHILD / SUB Class) inherits the Property (Behaviour) , Methods of  The Parent or Super Class.

// why use :- Code Reuseablity. Aboid Duplicates, Easy Maintenance, support Overloading.

// Real life :- Parent -> Father, Child -> Son  The Son inhirts :- Faimly Name , Habits, Properties. then chid class - behaviour , Methods.

class Vehicle 
{
    void Start()
    {
        System.out.println("Vehicle is Start");
    }
}

class Car extends Vehicle
{
    void Drive()
    {
        System.out.println("Car is Driving");
    }
}

public class inhir1 
{
    public static void main(String[] args)
    {
       Car c = new Car();
       c.Start();
       c.Drive();  
    }
}
