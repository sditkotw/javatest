package pack_test2;
/** * @author  sdking 
 * @date 创建时间：2018年8月31日 上午11:47:04 
 * @version 1.0 
 * @parameter   
 */
class Cup{
	Cup(int i){
		System.out.println("Cup("+i+")");
	}
}

class Table{
	
	public static void fff(){
		System.out.println("静态方法num("+num+")");
	}//方法始终在变量初始化完成后执行！！此处num已经被初始化不会报错
	
	static int num=1;
	Cup c2 =new Cup(2);   //tip1:静态变量会在成员变量之前初始化
	static {
		num=2;
		System.out.println("静态初始化，此时num="+num);
	}
	{
		num=3;
		System.out.println("动态初始化，此时num="+num);
		c3=new Cup(4);
	}
	Cup c3 =new Cup(3);   
	
	Table(int t){
		System.out.println("Table("+t+")");
		num=4;
		System.out.println("构造方法初始化，此时num="+num);
	}
	
	static Cup c1=new Cup(1);//tip1:静态变量会在成员变量之前初始化
	
}
public class InitializeTest {
	//static Table t1=new Table(1);
      public static void main(String... args) {
    	  Table t2=new Table(2);//tip2:静态变量只会在第一次类加载的时候初始化，这里就不会
    	  //Table.fff();
	}
}
