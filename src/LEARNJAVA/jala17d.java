package LEARNJAVA;
class jala17d {
    long i;
    int roll,mark;
    String name;
    private jala17d(long i) {
        this.i = i;
    }

    public jala17d(int roll, String name) {
        this.roll=roll;
        this.name=name;
    }
    protected jala17d(int mark){
        this.mark=mark;
    }
        public static void main(String[] args) {
            jala17d s1=new jala17d(12344444L);
            jala17d s2=new jala17d(1,"sharikh");
            jala17d s3=new jala17d(10);
            System.out.println(s1.i);
            System.out.println(s2.name);
            System.out.println(s2.roll);
            System.out.println(s3.mark);
    }}
