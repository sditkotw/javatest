package pack_test2;

import java.util.HashSet;

/** * @author  sdking 
 * @date 创建时间：2017年12月27日 上午9:38:04 
 * @version 1.0 
 * @parameter   
 */
public class TypeChangeTest {
	static final int DEFAULT_INITIAL_CAPACITY = 1 << 30;
	static  byte b=126;
	static int i=1;
	Integer I;
	static double d;
	static float ff;
	long l=5768090953434L;
	short s=32100;
	static char c=97;
	static String a="a";
	static boolean f;
	static String string="	   ";
	static HashSet hs=new HashSet();
	float fn=12.345F;
	
	static int[] arri=new int[2];
	
	
	static void f1(short x){
		System.out.println("short");
	}
	static void f1(int x){
		System.out.println("int");
	}
	
	
	static void f2(char x){
		System.out.println("char");
	}
	static void f2(int x){
		System.out.println("int");
	}
	
	
	static void f3(char x){
		System.out.println("cahr");
	}
	static void f3(short x){
		System.out.println("short");
	}
	static void f3(int x){
		System.out.println("int");
	}
	
	//不能通过返回值的区别来重载方法
	/*static void f4(){
		System.out.println("没有返回值");
	}
	static int  f4(){
		System.out.println("返回值");
	}*/
	public static void main(String[] args) {
		//i=++i;
		//System.out.println(i);
		//System.out.println(string.equals(""));
		
		System.out.println(i^(i>>>16));
		System.out.println(a.charAt(0));
		
		char x='a';
		f1(x);
		
		short y=10;
		f2(y);
		
		byte z=100;
		f3(z);
		
		System.out.println(arri[0]);


	}
}
