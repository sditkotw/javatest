package pack_test1;
/** * @author  sdking 
 * @date 创建时间：2017年8月15日 下午2:32:05 
 * @version 1.0 
 * @parameter   
 */
public class test_constant {
public static void main(String[] args) {
	int i=0;
	int j=0;
	int z=1;
	System.out.println("i和j是否相等"+(i==j));
	
	j=1;
	System.out.println("j改变后i的值"+i);
	System.out.println("j改变后和z是否相等"+(z==j));
}
}
