package LEARNJAVA;
interface in2{
    void show();
    void show1();

public class jala15a implements in2 {
    public static void main(String[] args) {
        jala15a a1 = new jala15a();
        a1.show();
        in2 i=new in2.jala15a();
        i.show();
    }

    public void show()
    {
        System.out.println("INTERFACE IMPLEMENTED");
    }

    public void show1() {

    }
}}

