package pack_test2;
/** * @author  sdking 
 * @date 创建时间：2018年4月26日 下午5:25:41 
 * @version 1.0 
 * @parameter   
 */



public class MethodQueue {

	{
		System.out.println("MethodQueue构造方法块啊啊啊啊啊啊");
	}
	
	public MethodQueue(){
		System.out.println("MethodQueue的构造方法");
	}
	static {
		System.out.println("MethodQueue静态方法块");
	}
	
	public static void staticalMethod() {
		System.out.println("我是MethodQueue的一般静态方法");
	
	}
}
