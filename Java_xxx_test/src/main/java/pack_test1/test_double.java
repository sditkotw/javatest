package pack_test1;

public class test_double {
	int[] s1=new int[1];
	
	public static void main(String[] args){
		byte b1=-128,b2=127,b3;
		short s2;
		int in2=27,in1=2147483647;
		long l1;
		float f1=1.1111111111111111111111111111111111f;
		float f2=111111111111111111111.11111111f;
		float f3=0.1E39f,f4=234.0f;
		double d1=1.1111111111111111111111111111111111;
		double d2=3.123456789;
		int kk=5;
		int kkk=kk/2;
/*		double result;
		result=d1/d2;		
		System.out.println(d1+" "+d2+" "+result);*/
		System.out.println("f1: "+f1);
		System.out.println("f2: "+f2);
		System.out.println("f3: "+(double)f3);
		System.out.println("f4: "+(double)f4);
		System.out.println("d1: "+d1);
		System.out.println("float���ֵ"+Float.MAX_VALUE+"  ���ָ��"+Float.MAX_EXPONENT);
		//System.out.println("s2: "+s2);
//		StringBuffer str = new StringBuffer("abcdef");
	//	str.setCharAt(3, 'z');
		System.out.println(kkk);
		System.out.println(in2/10);
		
	}

}
