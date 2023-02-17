package synchronizedTest;
/** 
* @author sdking 
* @time 2019年4月17日 下午3:45:22
* 类说明 
*/
public class SetMethod implements Runnable{
	
	private Model m;

	public  SetMethod(Model m) {
		this.m=m;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (m) {
				if(!m.flag) {
					try {
						m.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				m.i++;
				System.out.println("值增加");
				m.flag=false;
				m.notify();
			}			
		}
	}

}
