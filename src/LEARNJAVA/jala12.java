package LEARNJAVA;

public class jala12 {
    private int a=20;
    private void show(){
        int x=10;
        System.out.println("X="+x);
    }
    static class jala12a extends jala12{
        private void show1(){
            System.out.println("CANNOT ACCESS SHOW METHOD FROM CLASS jala12");
        }
        }
public static void main(String[] args){
        jala12 a=new jala12();
        a.show();
        System.out.println("PRIVATE INTEGER="+a);
        jala12a a1=new jala12a();
        a1.show1();
        //a1.show();cannot be accessed
        }
        }

