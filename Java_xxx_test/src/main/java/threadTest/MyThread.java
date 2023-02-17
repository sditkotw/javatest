package threadTest;
/** * @author  sdking 
 * @date 创建时间：2018年8月2日 上午9:36:15 
 * @version 1.0 
 * @parameter   
 */
public class MyThread extends Thread{
@Override
public void run() {
	for(int i=0;i<100;i++){
		System.out.println(Thread.currentThread().getName()+":"+i);
	}
}
}
