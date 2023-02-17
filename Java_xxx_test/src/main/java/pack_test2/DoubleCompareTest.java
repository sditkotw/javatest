package pack_test2;
/** * @author  sdking 
 * @date 创建时间：2018年6月8日 下午1:22:14 
 * @version 1.0 
 * @parameter   
 */
public class DoubleCompareTest {
public static void main(String[] args) {
	Double x=0.0;
	//Double x=null;
	if(x==null){
		System.out.println("null");
	}
	if(x.equals(0.00)){
		System.out.println("equals(0.00)");
	}
	
	if(x.equals(0.0)){
		System.out.println("equals(0.0)");
	}
	
}
	
}
