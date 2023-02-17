package pack_test1;


//一个长度为n,范围为1~n-1的数组中有一个重复（1次）的数，循环链表方法处理

public class FindRepetTest {

    public static int findSameNum(int[] arr){
        int x,y;
        x=y=0;
        do{
            x=arr[arr[x]];
            y=arr[y];
        }while (x!=y);
        //找到一个点，这个点到环入口点的距离等于arr[0]到环入口点的距离
        x=0;
        do{
            x=arr[x];
            y=arr[y];
        }while (x!=y);
        return x;
    }

    public static void main(String[] args) {
        int[] a={6,1,2,4,5,3,4};
        System.out.println(findSameNum(a));
    }
}
