package pack_test1;

public class Fibonacci {

    //时间复杂度O(2^n)  空间杂度O(2^n)
    public static int f(int n){
        if(n<=2)
            return 1;
        else
            return f(n-1)+f(n-2);
    }

    //时间复杂度O(n)  空间杂度O(n)
    static int[] a;
    public static int f2(int n){
        if(n<=2) return 1;
        if(a[n]>0) return a[n];
        else{
            a[n]=f(n-1)+f(n-2);
            return a[n];
        }

    }

    //尾递归
    //时间复杂度O(n)  空间杂度O(1)
    //res本次计算结果，pre上次计算结果
    static  int tailfuc(int n ,int res,int pre){
        if(n<=1) return res;
        return tailfuc(n-1,res+pre,res);
    }

    public static void main(String[] args) {
/*        long start=System.currentTimeMillis();
        System.out.println(f(40));
        System.out.println("f花费"+(System.currentTimeMillis()-start)+"ms");

        a=new int[41];
        long start2=System.currentTimeMillis();
        System.out.println(f2(40));
        System.out.println("f2花费"+(System.currentTimeMillis()-start2)+"ms");*/

        for(int i=1;i<10;i++) {
            System.out.println(tailfuc(i, 1, 0));
        }
    }
}
