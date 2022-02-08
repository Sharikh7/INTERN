package LEARNJAVA;

import java.io.*;
import java.util.Properties;

public class jala19a {
        public static void main(String[] args)
        {
            File file = new File("C:\\Users\\Sharikh\\Desktop\\doc.txt");

            try (InputStream in = new FileInputStream(file))
            {
                int content;
                while ((content = in.read()) != -1) {
                    System.out.print((char)content);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
 class FileOutputStreamExample {
    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("C:\\Users\\Sharikh\\Desktop\\doc.txt");
            fout.write(65);
            fout.close();
            System.out.println("successfully read");
        }catch(Exception e){System.out.println(e);}
    }
}
 class ReadFileDemo {
    public static void main(String[] args) {
        //Specify the path of the file here
        File file = new File("C:\\Users\\Sharikh\\Desktop\\doc.txt");
        BufferedInputStream bis = null;
        FileInputStream  fis= null;

        try
        {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            while( bis.available() > 0 ){
                System.out.print((char)bis.read());
            }
        }catch(FileNotFoundException fnfe)
        {
            System.out.println("The specified file not found" + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("I/O Exception: " + ioe);
        }
        finally
        {
            try{
                if(bis != null && fis!=null)
                {
                    fis.close();
                    bis.close();
                }
            }catch(IOException ioe)
            {
                System.out.println("Error in InputStream close(): " + ioe);
            }
        }
    }
}
 class Main1 {

    public static void main(String[] args) throws Exception {
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(new FileOutputStream(
                "C:\\Users\\Sharikh\\Desktop\\doc.txt"));
        bufferedOutput.write("Line one".getBytes());
        bufferedOutput.write("\n".getBytes());

        bufferedOutput.write(65);
        bufferedOutput.close();
    }}

 class FileReaderExample {
    public static void main(String args[])throws Exception{
        FileReader fr=new FileReader("C:\\Users\\Sharikh\\Desktop\\doc.txt");
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }
} class FileWriterExample {
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("C:\\Users\\Sharikh\\Desktop\\doc.txt");
            fw.write("Welcome to MYWORLD SHARIKH7.");
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success");
    }
}
class Main3
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\Sharikh\\Desktop\\doc.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class BufferedWriterExample {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("C:\\Users\\Sharikh\\Desktop\\doc.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to ME.");
        buffer.close();
        System.out.println("Success");
    }
}
 class main4 {
    public static void main(String[] args)throws Exception{
        FileReader reader=new FileReader("C:\\Users\\Sharikh\\Desktop\\doc.txt");

        Properties p=new Properties();
        p.load(reader);

        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));
    }
}
