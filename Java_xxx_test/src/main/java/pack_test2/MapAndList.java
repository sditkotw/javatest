package pack_test2;

import java.util.*;

/**
 * * @author sdking
 * 
 * @date 创建时间：2018年2月1日 下午12:23:12
 * @version 1.0
 * @parameter
 */
public class MapAndList {
	public static void main(String[] args) {
		List sl = new ArrayList();
		sl.add("随便的第一");
		sl.add("随便的第饿");
		sl.add("随便的第上");
		sl.add("随便的第是");
		System.out.println(sl);

		sl.add(0, "测试");

		Iterator it = sl.iterator();
		while (it.hasNext()) {
			System.out.println(String.valueOf(it.next()));
		}

		sl.remove(3);
		System.out.println(sl);

		Map mm = new HashMap();
		mm.put("k", sl);
		mm.put("name", "peas");
		mm.put("colcor", "thr_col");
		mm.put("food", "chicken breast");
		System.out.println(mm);


		mm.putIfAbsent("k", "dog");
		System.out.println(mm);
		mm.remove("k");
		System.out.println(mm.entrySet());

		Set ss = new HashSet();
		ss.addAll(sl);
		System.out.println(ss);
	}

}
