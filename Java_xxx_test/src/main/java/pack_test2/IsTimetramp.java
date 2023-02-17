package pack_test2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/** * @author  sdking 
 * @date 创建时间：2017年10月24日 上午10:12:15 
 * @version 1.0 
 * @parameter   
 */
public class IsTimetramp {

	public static boolean IsTimestamp(String str) {
		String regex = "^\\d+$";
		return str.matches(regex);
		}
	public static void main(String[] args) {
		String a="2019:09 ";
		System.out.println(a+" is timestamp:"+IsTimestamp(a));
		
		String s="11345345 123 90 789 123,45,379 ";
		String regex="\\b\\d{3}\\b";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(s);
		boolean b=m.matches();//判断是否有匹配的子串
		while(m.find()){  //查找下一个匹配的子串
			System.out.println(m.group()); //提取下一个匹配的子串
		}
	}
	
	
}
