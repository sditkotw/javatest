package pack_test2;
/** * @author  sdking 
 * @date 创建时间：2018年5月31日 下午3:35:34 
 * @version 1.0 
 * @parameter   
 */
public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.ceil(-12.67));
		System.out.println(Math.ceil(-12.10));
		System.out.println(Math.ceil(-0.67));
		System.out.println("--------------------------------");
		System.out.println(Math.floor(-12.67));
		System.out.println(Math.floor(-12.01));
		System.out.println(Math.floor(-0.01));
		System.out.println("--------------------------------");
		System.out.println(Math.round(-12.67));
		System.out.println(Math.round(-12.449));
		System.out.println(Math.round(-12.5));//四舍五入其实是数轴上的过半右移，不过左移
		System.out.println(Math.round(-0.01));
	}
}
