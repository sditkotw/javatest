class Test {
    public static int X=100;
    public final static int Y=200;
    public Test(){
        System.out.println("Test构造函数执行");
    }
    static{
        System.out.println("static语句块执行");
    }
    public static void display(){
        System.out.println("静态方法被执行");
    }
    public void display_1(){
        System.out.println("实例方法被执行");
    }
}
public class StaticBlockTest{
    public static void main(String args[]){
        //System.out.println(Test.X);
        // static语句块执行
        //100

        //System.out.println(Test.Y);
        //200

        try{
           // Class.forName("Test");
            Test tt=new Test();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
