package LEARNJAVA;
//RELATIONAL OPERATORS IN JAVA
public class jala5 {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

    //PRINT LARGER AND SMALLER NUMBER
    int x=10;
    int y=20;
    if (x<y){
        System.out.println("Y is Greater="+y);
    }
    else {
        System.out.println("X is Greater"+x);
    }
        int num[]=new int[]{55,32,45,98,82,11,9,39,50};
        int small=num[0];
        int large=num[0];

        for (int i=1;i<num.length;i++) {
            if (num[i]>large)
                large=num[i];
            else if (num[i]<small)
                small=num[i];
        }

        System.out.println("Largest Number="+large);
        System.out.println("Smallest Number="+small);
    }
}



