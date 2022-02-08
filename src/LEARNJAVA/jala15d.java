package LEARNJAVA;
interface Vehicle {
    String getBrand();
    String speedUp();
    String slowDown();

    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }
    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
public class jala15d implements Vehicle {

    private String brand;

    public jala15d(String a) {
    }

    public String getBrand() {
        return brand;
    }
    public String speedUp() {
        return "The car is speeding up.";
    }
    public String slowDown() {
        return "The car is slowing down.";
    }
    public static void main(String[] args) {
        jala15d d = new jala15d("BMW");
        System.out.println(d.getBrand());
        System.out.println(d.speedUp());
        System.out.println(d.slowDown());
        System.out.println(d.turnAlarmOn());
        System.out.println(d.turnAlarmOff());
    }
}}
interface intfA
{
    void show();
}
interface intfB extends intfA
{
    void show1();
}

class jala15e implements intfB
{
    public void show()
    {
        System.out.println("SK");
    }

    public void show1()
    {
        System.out.println("SK7");
    }

    public static void main (String[] args)
    {
        jala15e ob1 = new jala15e();
        ob1.show();
        ob1.show1();
    }
}