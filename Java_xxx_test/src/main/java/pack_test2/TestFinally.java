package pack_test2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * * @author sdking
 * 
 * @date 创建时间：2018年7月9日 下午5:04:34
 * @version 1.0
 * @parameter
 */
public class TestFinally {

	public static void main(String[] args) {
		Zhi zz = new Zhi("noName",new Date());
		//System.out.println(getZhiName(zz));//String结果不会因为finally中改变而改变

		//System.out.println(getDate(zz));//看具体改变对象

		//System.out.println(setZDate(zz));//finally中改变了zz的属性值，会改变return

		Map<String,Object> map=new HashMap<>();
		map.put("old",1);
		zz.setDataMap(map);
		System.out.println(zz);
		System.out.println(getMap(zz));
		System.out.println(zz);

/*		String ss="原来的String";
		System.out.println(changeSS(ss));
		System.out.println(ss);*/

	}

	public static String changeSS(String ss) {
		try {
			int a=1;
			System.out.println(a / 0);
			return ss;
		} catch (Exception e) {
			return ss;
		} finally {
			ss="new String";
		}
	}

	public static String getZhiName(Zhi zz) {
		int i=3;
		try {
			int a = 0;
			i=2;
			System.out.println(a / 0);
			return zz.getName();
			//return i;
		} catch (Exception e) {
			return zz.getName();
			//return i;
		} finally {
			i=4;
			zz.setName("finally");
			//return zz.getName();
		}
		//System.out.println("i is "+i);
	}

	public static Date getDate(Zhi zz){
		try {
			int a = 0;
			System.out.println(a / 0);
			return zz.getDate();

		} catch (Exception e) {
			return zz.getDate();

		} finally {
			zz.getDate().setTime(1583023855000L);//会改变return结果
			zz.setDate(new Date(1583023855000L));//不会改变return结果
		}
	}

	public static Zhi setZDate(Zhi zz){
		try {
			int a = 0;
			System.out.println(a / 0);
			return zz;

		} catch (Exception e) {
			return zz;

		} finally {
			zz.setDate(new Date(1583023855000L));
		}
	}

	public static Map getMap(Zhi zz){
		try {
			int a = 0;
			System.out.println(a / 0);
			return zz.getDataMap();

		} catch (Exception e) {
			return zz.getDataMap();

		} finally {

			//zz.getDataMap().put("add1","object1");//会改变return结果

			Map<String,Object> map=new HashMap<>();
			map.put("add2",2);
			zz.setDataMap(map);//对zz的引用改变属性，不会改变return已经计算好的zz.getDataMap()的值，会改变zz里本身dataMap值
			/*结果：
			{old=1}
			Zhi [name=noName, getName()=noNamedate=Wed Apr 01 09:20:10 CST 2020, dataMap={add2=2}, getClass()=class pack_test2.Zhi, hashCode()=1735600054, toString()=pack_test2.Zhi@677327b6]
			*/
		}
	}
}
