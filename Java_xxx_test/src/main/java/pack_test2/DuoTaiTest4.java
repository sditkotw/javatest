package pack_test2;

/**
 * * @author sdking
 * 
 * @date 创建时间：2018年5月16日 下午2:28:38
 * @version 1.0
 * @parameter
 */

/*
 * 看程序写结果:先判断有没有问题，如果没有，写出结果
 * 
 * 多态的成员访问特点： 方法：编译看左边，运行看右边。
 * 
 * 继承的时候： 子类中有和父类中一样的方法，叫重写。 子类中没有父亲中出现过的方法，方法就被继承过来了。
 */
abstract class Test4A {
	
	private int m=100;
	public void show() {
		System.out.println("m is : "+m);
		this.show2();
	}

	public void show2() {
		System.out.println("我");
	}
	
	
}

class Test4B extends Test4A {
	/*
	 * public void show() { show2(); }
	 */

	public void show2() {
		System.out.println("爱");
	}
}

class Test4C extends Test4B {
	public void show() {
		super.show();
	}

	public void show2() {
		System.out.println("你");
	}
}

public class DuoTaiTest4 extends Object{
	public static void main(String[] args) {
		Test4B bb=new Test4B();
		bb.show();
		
		/*Test4A a = new Test4B();
		a.show();*/

		/*Test4B b = new Test4C();
		b.show();*/
}
}