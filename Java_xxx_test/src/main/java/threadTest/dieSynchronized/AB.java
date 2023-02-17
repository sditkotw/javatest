package threadTest.dieSynchronized;

/**
 * * @author sdking
 * 
 * @date 创建时间：2018年8月2日 下午1:31:08
 * @version 1.0
 * @parameter
 */
public class AB extends Thread{
	private int ai = 0;
	private int bi = 0;
	private boolean flag;
	
	public AB (boolean flag){
		this.flag=flag;
	}
	
	@Override
	public void run() {
		if (flag) {
			synchronized (MyLock.Oa) {
				ai++;
				System.out.println("true A is " + ai);
				synchronized (MyLock.Ob) {
					bi--;
					System.out.println("true B is " + bi);
				}
			}
		} else {
			synchronized (MyLock.Ob) {
				bi++;
				System.out.println("false B is " + bi);
				synchronized (MyLock.Oa) {
					ai--;
					System.out.println("false A is " + ai);
				}
			}
		}
	}
	
}
