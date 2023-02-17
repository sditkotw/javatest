package protectfunctestsuper;

public class Superclass {

    protected String rs="fatherProtectedstring";
    public String us="fatherPublicString";

    protected void method(){
        System.out.println("this is father protected method!");
    }

    public void method2(){
        System.out.println("this is father public method!");
    }

    void methodFriendly(){
        System.out.println("this is father friendly method!");
    }
}
