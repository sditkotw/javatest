package pack_test2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * * @author sdking
 * 
 * @date 创建时间：2018年7月12日 上午9:34:50
 * @version 1.0
 * @parameter
 */
public class FileOutputStreamTest {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("fos.txt",true);
		/*
		 * 创建字节输出流对象了做了几件事情：
		 * A:调用系统功能去创建文件
		 * B:创建fos对象
		 * C:把fos对象指向这个文件
		 */
		
		//写数据
		fos.write("test".getBytes());
		fos.write("java".getBytes());
		
		//释放资源
		//关闭此文件输出流并释放与此流有关的所有系统资源。
		fos.close();
	}
}
