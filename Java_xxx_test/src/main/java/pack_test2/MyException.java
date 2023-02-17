package pack_test2;
/** * @author  sdking 
 * @date 创建时间：2017年8月9日 下午4:42:33 
 * @version 1.0 
 * @parameter   
 */
public class MyException extends Exception{
	private int s;
	MyException(int s){
		System.out.println("构建异常的初始值："+s);
	}
	public String toString(){
		return "throw  MyException";
	}
}

