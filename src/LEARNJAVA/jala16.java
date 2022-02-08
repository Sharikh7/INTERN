package LEARNJAVA;

public class jala16 {
    int a;
    int b;
    jala16(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    void display()
    {
        System.out.println("a =" +a+"b="+b);
    }

    public static void main(String[] args)
    {
        jala16 object = new jala16(10, 20);
        object.display();
    }
}
class Person
{
    void message()
    {
        System.out.println("This is person class");
    }
}
class Student extends Person
{
    void message()
    {
        System.out.println("This is student class");
    }
    void display()
    {
        message();
        super.message();
    }
}
class Test
{
    public static void main(String args[])
    {
        Student s = new Student();
        s.display();
    }
}
class Test1
{
    int a;
    int b;
    Test1()
    {
        this(10, 20);
        System.out.println("constructor called");
    }
    Test1(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println(" constructor called");
    }

    public static void main(String[] args)
    {
        Test1 object = new Test1();
    }
}