package protectfunctest;

import protectfunctestsuper.Childclass;
import protectfunctestsuper.Superclass;

public class Childclassdiffpack extends Superclass {

    public void useMethod(){
        method();
        super.method();
        System.out.println("---------------");

        method2();
        super.method2();

        //methodFriendly();//methodFriendly() is not public cann't be accessed from outside package
    }
    public static void main(String[] args) {
        Childclassdiffpack cc=new Childclassdiffpack();//当前类，异包子类
        Superclass ss=new Superclass();//异包父类
        //ss.method(); //编译报错  method()  has ptotected acess in protectfunctestsuper.Superclass
        cc.method();//正常运行
        System.out.println(cc.rs);
        System.out.println(cc.us);
        //System.out.println(ss.rs);编译报错：在异包子类中无法直接使用父类的protected属性
        System.out.println(ss.us);

        Childclass  ccs=new Childclass();
        //ccs.method(); //编译报错  method()  has ptotected acess in protectfunctestsuper.Superclass
    }
}
