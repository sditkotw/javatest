package threadTest.dieSynchronized;
/** * @author  sdking 
 * @date 创建时间：2018年8月2日 下午1:47:10 
 * @version 1.0 
 * @parameter   
 */
public class ABTest {
	public static void main(String[] args) {
		AB ab1=new AB(true);
		AB ab2=new AB(false);
		ab1.start();
		/*try {
			Thread.currentThread().sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		ab2.start();
	}
}
