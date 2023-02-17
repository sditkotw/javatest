package pack_test1;

/**
 * * @author sdking
 * 
 * @date 创建时间：2018年5月18日 下午4:36:38
 * @version 1.0
 * @parameter
 */
public class Fu {
	public void show1() {
		System.out.println("public show");
	}

	void show2() {
		System.out.println("无修饰的show");
	}
	
	protected void show3() {
		System.out.println("protected show");
	}
	
	private void show4() {
		System.out.println("private show");
	}
}
