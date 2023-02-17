package pack_test2;
/** * @author  sdking 
 * @date 创建时间：2018年5月3日 下午2:07:15 
 * @version 1.0 
 * @parameter   
 */
class X {
	Y b = new Y();
	X() {
		System.out.print("X");
	}
}

class Y {
	Y() {
		System.out.print("Y");
	}
}

class K extends X {
	Y y = new Y();
	K() {
		//super
		System.out.print("K");
	}
	
}

public class Z{
	public static void main(String[] args) {
		K k=new K();
	}
}