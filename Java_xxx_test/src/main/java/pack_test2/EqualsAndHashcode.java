package pack_test2;
public class EqualsAndHashcode{
    int i = 10;
    int j=10;
    int ii=128;
    int jj=128;


    public static void compareTest(String s,String ss) {
        System.out.println(s.equals(ss));
    }

    public static void hashcodeTest(String s,String ss) {
        System.out.println("s:hashcode-"+s.hashCode()+"ss:hashcode-"+ss.hashCode()+".hashcode if equal is "+(s.hashCode()==ss.hashCode()));
    }

    public static void main(String[] args) {
        int i = 10;
        int j=10;
        int ii=128;
        int jj=128;
        String s="wasd";
        String ss="wasd";
        compareTest(s,ss);
        hashcodeTest(s,ss);
    }
}
