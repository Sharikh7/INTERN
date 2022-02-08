package LEARNJAVA;

public abstract class jala14 {
    abstract void show();
    void show1(){
        System.out.println("NON ABSTRACT METHOD");
    }
}
class jala14a extends jala14{
    void show() {
        System.out.println("BASE CLASS IMPLEMENTATION");
    }



    public static void main(String[] args) {
    jala14 a=new jala14a();
    a.show();
    a.show1();

    jala14a c=new jala14a();
    c.show();
    c.show1();
    }   }


