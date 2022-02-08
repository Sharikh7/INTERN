package LEARNJAVA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;

public class jala19 {
    public static void main(String args[])
    {
        try{
            int num1=30, num2=0;
            int output=num1/num2;
            System.out.println ("Result: "+output);
        }
        catch(ArithmeticException e){
            System.out.println ("You Shouldn't divide a number by zero");
        }
    }
}
class jala19b
{
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
    }
}
class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}
 class Main
{
    // Driver Program
    public static void main(String args[])
    {
        try
        {

            throw new MyException("SHARIKH7");
        }
        catch (MyException ex)
        {
            System.out.println("Caught");

            System.out.println(ex.getMessage());
        }
    }
}
class TestFinallyBlock {
    public static void main(String args[]){
        try{
            int data=25/5;
            System.out.println(data);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of phe code...");
    }
}
class SK1 {

    // Main driver method
    public static void main(String args[])
    {
        try {

            Class.forName("GeeksForGeeks");
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
 class Example1
{
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(reader);
        String data =null;
        while ((data = br.readLine()) != null)
        {
            System.out.println(data);
        }
        br.close();

     }}
