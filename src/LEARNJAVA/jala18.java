package LEARNJAVA;

public class jala18 {
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public int add(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }}
    class call{
        public static void main(String[] args) {
        jala18 obj=new jala18();
        int sum1=obj.add(1,2);
        int sum2=obj.add(2,3,4);
            System.out.println(sum1);
            System.out.println(sum2);
        }
    }
    class student{

        private String name;
        private int roll;
        private double id;

        public String student(String name){
        this.name=name;
        return name;

    }
    public int student(int roll) {
            this.roll=roll;

        return roll;
    }}
    class retstud{
        public static void main(String[] args) {
        student s1=new student();
        String name=s1.student("SHARIKH");
        int roll1=s1.student(10);
            System.out.println(name);
            System.out.println(roll1);
            System.out.println();
        }
    }
class student1{

    private String name;
    private int roll;
    private double id;
    private int roll2;

    public String student1(String name){
        this.name=name;
        return name;

    }
    public int student1(int roll,int roll2) {
        this.roll=roll+roll2;
        return roll;

    }}
class retstud1{
    public static void main(String[] args) {
        student1 s1=new student1();
        String name=s1.student1("SHARIKH");
        int roll1=s1.student1(10,2);
        System.out.println(name);
        System.out.println(roll1);
        System.out.println();
    }
}