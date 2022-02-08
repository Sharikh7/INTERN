package LEARNJAVA;

public class A{
    public void class1(){
        System.out.println("CLASS A");
    }
    public void class2(){
        System.out.println("SHARIKH");
    }
    public void override(){
        System.out.println("OVERRIDE");
    }

}
class B extends A{
    public void n1(){
        System.out.println("XYZ");
    }
    public void n2()
    {
        System.out.println("ABC");
    }
    public void override(){
        System.out.println("LMN OVERRIDE");
    }
}
class C extends B{
    public void x1(){
        System.out.println("123");
    }
    public void x2(){
        System.out.println("786");
    }
    public void override(){
        System.out.println("891 OVERRIDE");
    }


    public static void main(String[] args) {
        A a1=new A();
        B b1=new B();
        C c1=new C();
        a1.class1();
        a1.class2();
        a1.override();
        b1.n1();
        b1.n2();
        b1.override();
        c1.x1();
        c1.x2();
        c1.override();

    }
}


