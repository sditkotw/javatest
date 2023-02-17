package pack_test2;

import java.sql.SQLOutput;

/** * @author  sdking
 * @date 创建时间：2017年12月26日 上午10:02:18 
 * @version 1.0 
 * @parameter   
 */
public class StringEqualTest {
	 public static void main(String[] args) {
	        String s1 = "Programming";
	        String s2 = new String("Programming");
	        String s3 = "Program";
	        String s4 = "ming";
	        String s5 = "Program" + "ming";
	        String s6 = s3 + s4;
	        System.out.println("s1 == s2 is "+ (s1 == s2));
		 	System.out.println("s1.equals(s2) is "+ s1.equals(s2));//equals比较值

	        System.out.println("s1 == s5 is "+ (s1 == s5));
	        System.out.println("s1 == s6 is "+ (s1 == s6));
	        //String.intern()判断常量池中是否存在某字符串（或者引用），是返回字符串（或者引用），否将（堆地址）引用放入常量池并返回引用地址
	        System.out.println("s1 == s6.intern() is "+ (s1 == s6.intern()));
	        System.out.println("s2 == s2.intern() is "+ (s2 == s2.intern()));
		 System.out.println("------------------------------------");

		 String a3 = new String("AA");    //在堆上创建对象AA
		 a3.intern(); //在常量池上已有AA，直接返回常量AA
		 String a4 = "AA";
		 System.out.println(a3.intern() == a4);
		 System.out.println("------------------------------------");
		 
		 String a1="a"+new String("b");
		 //String a2="ab";
		 System.out.println(a1.intern() == "ab");
	    }  
}
