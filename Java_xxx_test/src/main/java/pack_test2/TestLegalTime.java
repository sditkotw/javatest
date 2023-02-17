package pack_test2;

import java.util.Date;

/** * @author  sdking 
 * @date 创建时间：2017年12月8日 下午6:25:51 
 * @version 1.0 
 * @parameter   
 */
public class TestLegalTime {
	public static boolean IfLegalTime(Object str) {
		long now=new Date().getTime();
		long t=Long.valueOf(String.valueOf(str)).longValue();
		long s=now-t;
		if(s>0&&s/(1000*60)<10){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		Object str1="20171208-";
		//Object str2="1512730683000";
		//System.out.println(str1+" is "+IfLegalTime(str1));
		System.out.println(str1+" is "+IfLegalTime(str1));
	}
}
