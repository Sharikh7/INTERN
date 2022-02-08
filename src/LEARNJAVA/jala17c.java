package LEARNJAVA;

public class jala17c {
    int n1,n2;
    String s1,s2,s3;
    jala17c(){
        System.out.println("CONSTRUCTER CALLED");
    }
    jala17c(String s2,int n2){
        this.n2=n2;
        this.s2=s2;
    }
    jala17c(String s3){
    this.s3=s3;
    }


    public static void main(String[] args) {
        jala17c c=new jala17c();
        jala17c c1=new jala17c("SHARIKH",10);
        jala17c c2=new jala17c("SK");
        System.out.println(c.n1);
        System.out.println(c.s1);
        System.out.println(c1.s2);
        System.out.println(c1.n2);
        System.out.println(c2.s3);
    }
}
class Programming {
    public Programming()
    {
        System.out.println("Programming");
    }
}
class sk1 extends Programming {
    public sk1() {
        System.out.println("DP");
    }
}

 class sk2 {
    public static void main(String[] args)
    {
        sk1 obj = new sk1();
    }
}




