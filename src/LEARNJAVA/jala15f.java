package LEARNJAVA;
interface inter1{
    public static final int i=1;
    private void show() {
        System.out.println("PRIVATE METHOD");
    }

    public void show1();



}
public class jala15f implements inter1{


    public void show1() {
        System.out.println("PUBLIC METHOD");
    }

    public static void main(String[] args) {
        jala15f f=new jala15f();
        f.show1();
        //f.show(); not accessible
        System.out.println(f.i);
    }
}
