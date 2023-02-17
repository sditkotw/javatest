package pack_test2;

import java.io.File;

/** * @author  sdking 
 * @date 创建时间：2017年8月10日 上午9:01:10 
 * @version 1.0 
 * @parameter   
 */
public class TestFile {
	public static void main(String[] args) {
		File f=new File("d:/filefold");
		System.out.println("判断是否存在："+f.exists());
		File f1=new File("d:/filefold/lol.txt");
		System.out.println("判断是否存在："+f1.exists());
		if(f1.exists()){
			System.out.println("length:"+f1.length()); //含有字符多少
			System.out.println("改名前路径："+f1.getAbsolutePath());
			f1.renameTo(new File("d:/filefold/relol.txt") );
			System.out.println("改名后路径："+f1.getAbsolutePath());
		}
		File f2=new File("d:/filefold/relol.txt");
		
	}
}
