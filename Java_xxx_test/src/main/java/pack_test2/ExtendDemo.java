package pack_test2;
/** * @author  sdking 
 * @date 创建时间：2018年4月27日 上午11:22:03 
 * @version 1.0 
 * @parameter   
 */
class AA{
	int i=10;
	public void ap(){
		//int i=20;
		System.out.println(this.i);
	}
	public AA(){
		System.out.println("父类的无参构造");
	}
	{
		System.out.println("父类动态代码块");
	}
}
class BB extends AA{
	int i=30;
	/*public void ap(){
		int i=40;
		System.out.println(i);
	}*/
	{
		System.out.println("子类动态代码块");
	}
	public BB(){
		System.out.println("子类无参构造");
	}
}
public class ExtendDemo {
public static void main(String[] args){
	BB b=new BB();
	b.ap();
}
}
