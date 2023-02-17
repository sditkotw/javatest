package pack_test2;

import sun.management.counter.Variability;

/** * @author  sdking 
 * @date 创建时间：2017年12月28日 下午2:33:19 
 * @version 1.0 
 * @parameter   
 */
public class TestThread {
	public static void main(String[] args) {
		//多线程写法一：new了两次自定义类，浪费资源
		/*for(int i=0;i<2;i++) {
			MyThread mt=new MyThread();
			mt.start();
		}*/
		
		//写法二：可以多次使用mt,比写法一好
		MyThread mt=new MyThread();
		new Thread(mt,"线程1").start();
		new Thread(mt,"线程2").start();
	}
}
class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread name is "+Thread.currentThread().getName());
	}
}
