package LEARNJAVA;
//TO PRINT "BRIGHT IT CAREER 10 TIMES"
public class jala6 {
    public static void main(String[] args) {
        var c = "BRIGHT IT CAREER";
        for (int i = 0; i <= 10; i++) {
            System.out.println(c);
        }
//TO PRINT 1-20 numbers using while loop
        int i=1;
        while (i<=20){
            System.out.println(i);
            i++;
        }
        //FOR EQUAL AND NOT EQUAL OPERATOR
        int a = 2;
        int b = 4;
        if (a == b) {
            System.out.println("BOTH ARE EQUAL");
        } else if (a != b) {
            System.out.println("BOTH ARE NOT EQUAL");
        }
        //TO PRINT ODD AND EVEN NUMBERS
        int x[]={1,2,5,6,3,2};
        System.out.println("Odd Numbers:");
        for(int d=0;d<x.length;d++){
            if(x[d]%2!=0){
                System.out.println(x[d]);
            }
        }
        System.out.println("Even Numbers:");
        for(int d=0;d<x.length;d++) {
            if (x[d] % 2 == 0) {
                System.out.println(x[d]);
            }

        }
        //LARGEST AMONG 3 numbers
        int l=3,m=4,n=5,large,temp;
        temp=l>m?l:m;
        large=n>temp?n:temp;
        System.out.println("Largest number is="+large);
    }

    }




