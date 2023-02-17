package pack_test2;
/** * @author  sdking 
 * @date 创建时间：2017年8月9日 下午5:11:57 
 * @version 1.0 
 * @parameter   
 */
public class TestMyException {
public static void demo(int i) throws MyException{
	if(i>10)
		throw new MyException(i);
	System.out.println("demo正常结束");
}
		
		public static void main(String [] args){
			try{
				demo(1);
				demo(20);
			}catch(MyException e){
				System.out.println("demo抛出了一个异常并被捕获,e是"+e);
			}
	
		}
	
}
