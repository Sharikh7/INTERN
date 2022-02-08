package LEARNJAVA;

import java.util.Scanner;

public class jala6a {
    public static void main(String[] args) {
        //PRINT EVEN NUMBERS BETWEEN 1to100 using while loop
        int e = 2, f = 100;
        while (e <= f) {
            System.out.println(e);
            e += 2;
        }
        //To Print 1to 10 using do while loop
        int a=1;
        do {
            System.out.println(a);
            a++;
        }while (a<=10);
//To find armstrong number or not
        int num=371,num1,remainder,result=0;
        num1=num;
        while (num1!=0){
            remainder=num1%10;
            result+=Math.pow(remainder,3);
            num1=num1/10;
        }
        if(result==num)
            System.out.println(num+"=IS ARMSTRONG NUMBER");
        else
            System.out.println(num+"=IS NOT AN ARMSTRONG NUMBER");

    //TO FIND PRIME OR NOT
    int n =46,i=2;
    boolean flag = false;
    while (i <=n/2) {
        if (num%i==0) {
            flag = true;
            break;
        }++i;
    }
    if (!flag)
        System.out.println(n + " is a prime number.");
    else
        System.out.println(n + " is not a prime number.");

    //TO CHECK WHETHER NUMBER IS PALINDROME OR NOT
        int r,sum=0,temp;
        int n1=454;
        temp=n1;
        while(n1>0){
            r=n1%10;
            sum=(sum*10)+r;
            n1=n1/10;
        }
        if(temp==sum)
            System.out.println("Palindrome number ");
        else
            System.out.println("Not a Palindrome");

//TO FIND NUMBER IS EVEN OR ODD
    int o=4;
  if (o%2==0){
      System.out.println("Number is EVEN");

  }else {
      System.out.println("Number is ODD");
  }


  //TO CHECK MALE FEAMLE USING SWITH CASE
        Scanner s=new Scanner(System.in);
        System.out.println("Enter m or f");
        char c=s.next().charAt(0);
        switch(c){
            case 'm': System.out.println("Gender is male");
                break;
            case 'f': System.out.println("Gender is female");
                break;
        }
        s.close();


        //LARGEST NUMBER IN 3 NUMBERS USING MULTIPLE IF ELSE STATEMENTS
        double p1=10,p2=9,p3=5;
        if( p1 >= p2 && p1 >= p3)
            System.out.println(p1 + " is the largest number.");
        else if (p2 >= n1 && p2 >= p3)
            System.out.println(p2 + " is the largest number.");
        else
            System.out.println(p3 + " is the largest number.");
    }}
