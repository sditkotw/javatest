package threadTest;
/** * @author  sdking 
 * @date 创建时间：2018年8月6日 上午9:30:36 
 * @version 1.0 
 * @parameter   
 */
public class MyThreadJoinTest {
	public static void main(String[] args) {
		Thread t1=new MyThread();
		Thread t2=new MyThread();
		Thread t3=new MyThread();
		
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("join 之后的代码");
		
		
	}
}
