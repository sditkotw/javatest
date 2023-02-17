package pack_test2;

public class AutoBoxingTest {

    //测试引用类型特性
    public static void changgeInt(String c,Integer a,Integer b){
        c="new";
        //c.append("add");
        a++;
        b=a;
    }
	public static void main(String[] args) {
		Integer a = new Integer(3);  //创建了一个新的Integer变量，值为3
        Integer b = 3;              // 小于128，从常量池中获取
        int c = 3;  
        Integer d=3; //和b是同一个常量
        
        System.out.println(a == b); // false 两个引用没有引用同一对象  
        System.out.println(a == c); // true a自动拆箱成int类型再和c比较  
        System.out.println(b == c);//true 和基本类型比较，比较的是值
        System.out.println(b == d);//true
        System.out.println("----------------------------------------------");
        Integer aa=1;
        Integer bb=8;
        //StringBuilder cc=new StringBuilder("old");
        String cc="old";
        changgeInt(cc,aa,bb);
        System.out.println("aa is "+aa);
        System.out.println("bb is "+bb);
        System.out.println("cc is "+cc);

	}
}
