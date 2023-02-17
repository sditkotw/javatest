package protectfunctestsuper;

import protectfunctest.Childclassdiffpack;

public class Childclass extends Superclass {
    public void useMethod(){
        method();//父类protect方法
        super.method();//同上
        method2();//父类public方法
        super.method2();//同上
        methodFriendly();
    }
    public static void main(String[] args) {
        Childclass cc=new Childclass();
        Superclass ss=new Superclass();
/*        cc.useMethod();*/
        /*结果： 1、无论子类在不在同包，结果一样；
        2、直接调用方法（继承来的）和super.method结果一样
        3、子类可以继承父类的protected方法，也可以直接使用
        this is father protected method!
        this is father protected method!
        this is father public method!
        this is father public method!*/

/*        System.out.println(cc.rs);
        System.out.println(cc.us);
        System.out.println(ss.rs);
        System.out.println(ss.us);*/
/*
        结果： 1、无论子类在不在同包，结果一样；
        2、子类可以继承父类的protected属性,也可以直接使用（在本包中）
        3、在异包子类中无法直接使用父类的protected属性
          fatherProtectedstring
          fatherPublicString*/

        System.out.println("------------------------------");
        //Childclassdiffpack与当前类Childclass有相同的父类Superclass，
        // 当前类与父类同包；与Childclassdiffpack不同包
        Childclassdiffpack ccp=new Childclassdiffpack();
        ccp.method();//正常
    }
}
