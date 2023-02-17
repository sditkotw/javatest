package pack_test2;

//重载：在同一个类中同名方法参数不同，除了个数、类型不同算重载，顺序不同也是重载！

public class TestOverride {
	
	public void name(String a,int b) {
		System.out.println("1");
	}
	
	public void name(int a, String b) {
		System.out.println("2");
	}
public static void main(String[] args) {
	TestOverride ts=new TestOverride();
	ts.name("1", 1);
	ts.name(1, "1");
}
}
