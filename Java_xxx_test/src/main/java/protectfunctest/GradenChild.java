package protectfunctest;

import protectfunctestsuper.Superclass;

public class GradenChild extends Childclassdiffpack {
    public void test(){
        method();
    }

    public static void main(String[] args) {
        Superclass ss=new Superclass();
        //ss.method();//编译报错  method()  has ptotected acess in protectfunctestsuper.Superclass

        //Childclassdiffpack与当前类GradenChild有相同的父类Superclass，
        // 当前类与Childclassdiffpack同包；与父类不同包
        Childclassdiffpack ccp=new Childclassdiffpack();
        ccp.method2();//正常
        //ccp.method();////编译报错  method()  has ptotected acess in protectfunctestsuper.Superclass
        //System.out.println(ccp.rs);//报错
        System.out.println(ccp.us);

        GradenChild gc=new GradenChild();
        gc.method();//正常
        System.out.println(gc.rs);
    }
}
