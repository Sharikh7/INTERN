package LEARNJAVA;
//Call static methods and instance methods in main method
//Print all the static, instance variables in main method
public class jala9 {
    static int age;
    static String name;
    public String n1 = "JAVA";
    private int n2 = 10;

    static void disp() {
        System.out.println("Age is: " + age);
        System.out.println("Name is: " + name);
    }

    public static void main(String args[]) {
        jala9 obj = new jala9();
        age = 19;
        name = "Sharikh";
        disp();
        obj.display();
        obj.show();
    }

    void display() {
        System.out.println("NAME=" + n1);
        System.out.println("NUMBER=" + n2);
    }

    void show() {
        int a = 4, b = 5;
        System.out.println("A=" + a);
        System.out.println("B=" + b);
    }

}

//Print instance variables in static methods
class jala9a {
    public int k;

    public jala9a(int k) {
        this.k = k;
    }

    public void setK() {
        this.k = k;
    }

    public int getK() {
        return k;
    }

    public static void main(String[] args) {
        jala9a gfg = new jala9a(10);
        System.out.print("Value of k is: " + gfg.getK());
    }
}

class jala9b {

    public static void main(String args[]) {
        jala9b d = new jala9b();
        d.add(10, 20);
    }

    public void add(int x, int y) {
        int a = x;
        int b = y;
        int c = a + b;
        System.out.println("addition" + c);
    }
}
//Call static methods in instance methods
class jala9c{
        static void staticMethod() {
            jala9c jal = new jala9c();
            jal.instanceMethod();
        }

        void instanceMethod() { }
    }
