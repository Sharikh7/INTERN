package LEARNJAVA;
interface int1{
    void show();
}
interface int2{
    void print();
}
public class jala15b implements int1,int2 {
    public static void main(String[] args) {
        jala15b b=new jala15b();
        b.show();
        b.print();
    }
    public void show() {
        System.out.println("SHARIKH");
    }

    public void print() {
        System.out.println("SHARIKH7");
    }
}

