package pack_test2;
/** * @author  sdking 
 * @date 创建时间：2017年12月22日 下午5:00:03 
 * @version 1.0 
 * @parameter   
 */


class A {  
    public String show(D obj) {  
        return ("A and D");  
    }  
  
    public String show(A obj) {  
        return ("A and A");  
    }  
    
    public String show(B obj) {  
        return ("A and B");  
    }
    final void hello(){
    	System.out.println("hello A");
    }
  
}  
  
class B extends A{  
    public String show(B obj){  
        return ("B and B");  
    }  
      
   public String show(A obj){  
        return ("B and A");  
    } 
 /*   public void hello(){
    	System.out.println("hello B");
    }*/

}  
  
class C extends B{  
  
}  
  
class D extends B{  
  
}  
public class Test_dt {
	 public static void main(String[] args) {
		 	A a1 = new A();  
	        A a2 = new B();  
	        B b = new B();  
	        C c = new C();  
	        D d = new D();  
	          
	        System.out.println("1--" + a1.show(b));  
	        System.out.println("2--" + a1.show(c));  
	        System.out.println("3--" + a1.show(d));  
	        System.out.println("4--" + a2.show(b));  
	        System.out.println("5--" + a2.show(c));  
	        System.out.println("6--" + a2.show(d));  
	        System.out.println("7--" + b.show(b));  
	        System.out.println("8--" + b.show(c));  
	        System.out.println("9--" + b.show(d)); 
	        System.out.println("10--" + c.show(a1));
	      a2.hello();
	        
	  }  
	  
}
