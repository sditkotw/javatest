package protectfunctest;

import protectfunctestsuper.Childclass;

public class Invokeclassdiffpack {
    public static void main(String[] args) {
        //子类Childclass有父类Superclass同包，
        // 当前类不同包；
        Childclass cc=new Childclass();
        //cc.method();//编译报错   method()  has ptotected acess in protectfunctestsuper.Superclass
        //cc.methodFriendly();//methodFriendly() is not public cann't be accessed from outside package
        cc.useMethod();//public 方法 不会报错



/*        Childclassdiffpack cc=new Childclassdiffpack();
        cc.method();//编译报错   method()  has ptotected acess in protectfunctestsuper.Superclass
        cc.useMethod();//不会报错*/
    }
}
