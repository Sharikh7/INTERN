package LEARNJAVA;

//LOGICAL OPERATORS IN JAVA
public class JALA4 {
    public static void main(String[] args) {
        int a=10,b=20,c=10;
        if((a<b)&&(a==c)){ //LOGICAL AND
            int d=a+b+c;
            System.out.println(d);
        }
        int w=100,x=200,y=100;
        if((w<x)||(x==y)){  //LOGICAL OR
            int z=w+x+y;
            System.out.println(z);
        }
        int p=10,q=15,r=20;
        System.out.println("!p<q="+!(p<q)); //LOGICAL NOT OPERATOR
        System.out.println("!q>r="+!(q>r));
    }
}
