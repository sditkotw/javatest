package pack_test2;

import java.time.LocalDate;
import java.util.BitSet;

public class BitMap {
    private int[] data;  //BitSet b=new BitSet();//可以用bitset，java自带的bit数组来实现
    private int MaxLength;
    public  BitMap(int MaxLength){
        this.MaxLength=MaxLength;
        this.data=new int[(MaxLength>>5)+1];
    }

    public void add(int n){
         data[n>>5]|=(1<<(n&31));
    }

    public boolean get(int n){
        if((data[n>>5]&(1<<(n&31)))==0){
            return false;
        }
        return true;
    }

    public void del(int n){
        //取反、异或都行
        //System.out.println(0b11111111111111111111111111111111);  -1
        //data[n>>5]&=(1<<(n&31)^-1);
        data[n>>5]&=~(1<<(n&31));
    }

    public static void main(String[] args) {
        //System.out.println(Integer.toString(Integer.MAX_VALUE,2));
        //System.out.println(0b11111111111111111111111111111111);
        BitMap bm=new BitMap(200);
        bm.add(1);
        bm.add(31);
        bm.add(64);
        bm.add(127);
        bm.add(0);
        System.out.println("31 is exist "+bm.get(31));
        System.out.println("64 is exist "+bm.get(64));
        System.out.println("127 is exist "+bm.get(127));

        System.out.println("78 is exist "+bm.get(78));
        bm.add(78);
        System.out.println("78 is exist "+bm.get(78));

        System.out.println("127 is exist "+bm.get(127));
        bm.del(127);
        System.out.println("127 is exist "+bm.get(127));

    }
}
