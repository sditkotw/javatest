package pack_test2;
/** * @author  sdking 
 * @date 创建时间：2018年10月11日 下午4:28:18 
 * @version 1.0 
 * @parameter   
 */
public class RegexTest {
public static void main(String[] args) {
	String projectId="00010ssdd00101010101";
	if(projectId != null&&projectId.matches("^00\\d+")){
		System.out.println("tab_"+projectId.substring(2));
	}
}
}
