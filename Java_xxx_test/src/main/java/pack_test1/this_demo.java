package pack_test1;

public class this_demo {
	public static void main(String[] args){
        A b = new A();
    }
}
class A{
    public A(){
        new B(this).print();  // ÄäÃû¶ÔÏó
    }
    public void print(){
        System.out.println("Hello from A!");
    }
}
class B{
    A a;
    public B(A a){
        this.a = a;
    }
    public void print() {
        a.print();
        System.out.println("Hello from B!");
    }
}
