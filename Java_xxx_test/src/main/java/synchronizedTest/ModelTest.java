package synchronizedTest;
/** 
* @author sdking 
* @time 2019年4月17日 下午3:45:39
* 类说明： 测试synchronized执行完是进入锁池还是等待池
*/
public class ModelTest {
	public static void main(String[] args) {
		Model m=new Model();
		GetMethod gm=new GetMethod(m);		
		SetMethod sm=new SetMethod(m);
		
		new Thread(gm).start();
		new Thread(sm).start();
		
	}
	
/*执行结果：
	现在值是0
	值增加
	get中第2个synchronized代码
	现在值是1
	get中第2个synchronized代码
	值增加
	现在值是2
	值增加
	get中第2个synchronized代码
	现在值是3
	值增加
	get中第2个synchronized代码
	现在值是4
	get中第2个synchronized代码
*/

	
}
