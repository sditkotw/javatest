package synchronizedTest;

import javax.net.ssl.SSLException;

/** 
* @author sdking 
* @time 2019年4月17日 下午3:45:09
* 类说明 
*/
public class GetMethod implements Runnable{

	private Model m;

	public  GetMethod(Model m) {
		this.m=m;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (m) {				
				if(m.flag) {
					try {
						m.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//m.i++;
				System.out.println("现在值是"+m.i);
				m.flag=true;
				m.notify();//唤醒了占用m对象的任意一个线程之后，被唤醒的线程不会立刻获得cpu,而是在锁池中，等待当前占用锁对象的线程执执行完毕，再一起竞争
				/*System.out.println("notify之后的代码1");
				System.out.println("notify之后的代码2");
				System.out.println("notify之后的代码3");*/
			}
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//第二个synchronized和set是公平竞争的
			synchronized (m) {
				System.out.println("get中第2个synchronized代码");
			}
		}
	}

}
