package LEARNJAVA;

import java.util.ArrayList;

public class jala20 {
    public static void main(String args[]){
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");
        alist.remove(2);
        alist.remove("Tim");
        alist.set(2,"SHARIKH");
        alist.contains("Tom");

        System.out.println(alist);
        alist.add(3, "Steve");
        System.out.println(alist);
        for(String str:alist){
            System.out.println(str);
    }
        System.out.println(alist.get(2));
        System.out.println(alist.size());
        alist.clear();
        System.out.println(alist);
}}

