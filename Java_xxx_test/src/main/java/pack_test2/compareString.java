package pack_test2;

import java.util.Arrays;
import java.util.List;

/** * @author  sdking
 * @date 创建时间：2017年9月8日 上午8:56:50 
 * @version 1.0 
 * @parameter   
 */
public class compareString {
	public static final List<String> list= Arrays.asList(null,"NaN","nan","");
	public static boolean isEmpty(CharSequence cs){
		return cs==null||cs.toString().trim().length()==0;
	}
public static void main(String[] args) {
	String date1="20170103";
	String date2="20161103";

/*	if(date1.compareTo(date2)>0){
		System.out.println(date1+"大于"+date2);
	}else if(date1.compareTo(date2)<0){
		System.out.println(date1+"小于"+date2);
	}else{
		System.out.println(date1+"等于"+date2);
	}*/
	
	//测试同一个包下的类之间方法
	//boolean x=IsTimetramp.IsTimestamp(date1);
	
	//测试 Object.hashCode方法
	//System.out.println(date1.hashCode());

	System.out.println("----------------------------------");
	//测试string空
	String d=" ";
	System.out.println("isEmpty---"+isEmpty(d));
	System.out.println("list.contains-----"+list.contains(d));
}
}
