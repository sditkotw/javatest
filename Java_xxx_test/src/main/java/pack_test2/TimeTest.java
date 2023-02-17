package pack_test2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/** * @author  sdking 
 * @date 创建时间：2018年1月3日 下午3:52:00 
 * @version 1.0 
 * @parameter   
 */
public class TimeTest {
	public static void main(String[] args) {		
		Date date=new Date(1514966848000L);
		System.out.println("now "+date);
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss:SSS");
		Calendar ca=Calendar.getInstance();
		System.out.println("now 2 "+ca.getTime());
		
		/*try {
			Thread.sleep(1000*60*2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("now 2 "+ca.getTime());
		*/
		
		//测试Calendar.DATE 和Calendar.DAY_OF_MONTH DAY_OF_YEAR跨月跨年效果
		System.out.println("-----------------------------");
		ca.set(Calendar.MONTH, 0);
		System.out.println("更改前 "+ca.getTime());
		ca.add(Calendar.DAY_OF_YEAR, -10);
		System.out.println("更改后 "+ca.getTime());
	}
	
	
	
}
