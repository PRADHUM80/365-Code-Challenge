// package JAVA.OOPS.Inheritance;

class Employee
{
    String company = "ABC Pvt Ltd";
    void work()
    {
        System.out.println("Employee is Working");
    }
}

class Developer extends Employee
{
    void code()
    {
        System.out.println("Developer is Coding");
    }
}

class Tester extends Employee
{
    void test()
    {
        System.out.println("Tester is Testing");
    }
}



public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer();

        dev.work();
        dev.code();
        
        System.out.println();

        Tester test = new Tester();


        test.work();
        test.test();
        
    }
}
