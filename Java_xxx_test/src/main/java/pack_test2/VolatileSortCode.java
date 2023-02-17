package pack_test2;

public class VolatileSortCode {

    volatile static int x;
    public static void main(String[] args) {



            new Thread(()->{
                x = 10;
            },"t1").start();
            new Thread(()->{
                System.out.println(x);
            },"t2").start();

    }
    //仅正对t1先于t2运行情况下，t2如果先于t1运行，结果是0
}
