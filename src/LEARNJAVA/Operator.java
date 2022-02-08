package LEARNJAVA;

public class Operator {
    public static void main(String[] args) {
        int a = 2 - 3 + 4 * 5 / 2;//All the Operators included
        System.out.println("A=" + a);
        int b=5;//b WILL BE FIRST USED AND THEN DECREMENTED
        b=b--;
        int c=6;

        c=--c;//c WILL BE DECREMENTED AND THEN USED

        int d=2;//d WILL BE USED AND THEN INCREMETNTED
        d=d++;
        int e=3;//e WILL BE INCREMENTED AND THEN USED
        e=++e;
        System.out.println("B="+b);
        System.out.println("C="+c);
        System.out.println("D="+d);
        System.out.println("E="+e);
    }
}
