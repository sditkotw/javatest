package threadTest;

/**
 * * @author sdking
 * 
 * @date 创建时间：2018年8月2日 上午9:44:27
 * @version 1.0
 * @parameter
 */
public class MyThreadTest {
	public static void main(String[] args) {
		Thread t1=new MyThread();
		Thread t2=new MyThread();
		Thread t3=new MyThread();
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.setName("sdking.thread1");
		t1.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
		/*try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
	}
}
