package pack_test2;

import java.util.*;

/** * @author  sdking 
 * @date 创建时间：2018年6月7日 上午10:23:52 
 * @version 1.0 
 * @parameter   
 */
public class ArraysPrintArrTest {
	
	public static void main(String[] args) {
		int[] arrBase=new int[]{1,2,3};
		String[] arrIndex=new String[]{"a","bjh","123",};
		System.out.println(Arrays.toString(arrIndex));//数组本身的打印方法，完美打印
		System.out.println(Arrays.asList(arrIndex));//转化为集合，完美打印
		
		System.out.println(Arrays.toString(arrBase));//数组本身的打印方法，完美打印
		System.out.println(Arrays.asList(arrBase)); //打印地址，因为不能被转化为集合
		
		System.out.println("----------------------------");
		
		List<Map<String,List>> arrList=new ArrayList<>();
		Map<String,List> m=new HashMap<>();
		List<String> mList=new ArrayList<>();
		mList.add("inner1");
		mList.add("inner2");
		m.put("k1", mList);
		arrList.add(m);
		
		System.out.println(arrList.toString());
		System.out.println(arrList);//集合本身是能够被直接层级打印的
		System.out.println(mList.toString());


	}
     
  
}
