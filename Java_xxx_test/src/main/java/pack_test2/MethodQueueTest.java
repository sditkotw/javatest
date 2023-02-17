package pack_test2;
/** * @author  sdking 
 * @date 创建时间：2018年4月26日 下午5:29:31 
 * @version 1.0 
 * @parameter   
 */
public class MethodQueueTest {
	static{
		System.out.println("这是MethodQueueTest的静态方法块");
	}
	public MethodQueueTest(){
		System.out.println("MethodQueueTest的构造方法");
	}
public static void main(String[] args) {
	
	System.out.println("--------------开始调用-MethodQueue------------");
	MethodQueue.staticalMethod();
	//MethodQueue m1=new MethodQueue();
	//MethodQueue.staticalMethod();
	System.out.println("--------------结束调用-MethodQueue------------");
}
}
