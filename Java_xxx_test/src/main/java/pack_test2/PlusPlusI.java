package pack_test2;

public class PlusPlusI {
    public static void main(String[] args) {
       /* int i=0;
        i=i++;
        //等同代码
        i++:  temp=i;i=i+1;turn temp;
        i=i++;  i=temp;
        System.out.println(i);*///0

        /*int i=0;
        i=++i;
        System.out.println(i);*/ //1

         Integer a=127;
        for (int i = 0; i < 99; i++) {
            a =a++;
        }
        System.out.println(a); //0   Integer和int无区别


        /*int a=0;
        int b=0;
        for (int i = 0; i < 99; i++) {
            a = a ++;
            b = a ++;
        }
        System.out.println(a);
        System.out.println(b);*/  //99 98


/*        Integer a=0;
        int b=0;
        for (int i = 0; i < 99; i++) {
            a = a ++;
            b = a ++;
        }
        System.out.println(a); //99 98  Integer和int无区别
        System.out.println(b);*/

//---------------------------------------其他测试
        int ii=1;
        int jj=ii++;//jj=1;ii=2;
        if((jj++>=++ii)&&(jj++>1)){//第一个jj++会操作，第二个jj++不会（因为短路）
            System.out.println("进入判断");
        }
        System.out.println("ii的值是"+ii+"---jj的值是"+jj);
        //ii的值是3---jj的值是2
    }
//---------------------------------------其他测试结束
}
