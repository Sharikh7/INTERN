package LEARNJAVA;

import java.util.Locale;
import java.util.regex.Pattern;

public class jala10 {

    public static void main(String[] args) {
        String s = "SHARIKH";
        String d = new String("JAVA");
        String e = s + d;
        System.out.println("NAME=" + s);
        System.out.println("OTHERSTRINGA=" + d);
        System.out.println("CONCATENATED STRING=" + e);

        int m = s.length();
        System.out.println("lENGTH OF STRING=" + m);
        String substr = s.substring(0, 4);
        System.out.println("SUBSTRING OF " + s + " IS " + substr);
        int x = s.indexOf("H");
        System.out.println("Index of H in string " + s + " IS " + x);
        System.out.println(Pattern.matches("Sharikh", "Sharikh"));
        System.out.println(Pattern.matches("Sharikh", "Shark"));
        System.out.println(s.equals(d));
        String o = "SHARIKH";
        System.out.println(s.equals(o));

        String str1 = "hello";
        String str2 = "hell";
        String str3 = "hel";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equalsIgnoreCase(str3));

        System.out.println(str1.compareTo(str2));
        String str4 = "COMPARE THIS STRING";


        System.out.println(str4.startsWith("COMPARE"));
        System.out.println(str4.endsWith("STRING"));
        String s1 = "   My name Is Sharikh   ";
        System.out.println("Length=" + s1.length());
        s1=s1.trim();
        System.out.println("Length=" + s1.length());

        String replaceString=s1.replace('a','e');
        System.out.println(replaceString);

        String str = "myname@is@sharikh";
        String[] arrOfStr = str.split("@", 4);
        for (String a : arrOfStr)
            System.out.println(a);

        int value=10;
        String x1= String.valueOf(value);
        System.out.println(x1+15);

        System.out.println(str1.toUpperCase(Locale.ROOT));
        System.out.println(str1.toLowerCase(Locale.ROOT));

        int i=5;
        String c=Integer.toString(i);
        System.out.println(c+10);

    }

}