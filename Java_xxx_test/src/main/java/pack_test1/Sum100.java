package pack_test1;

public class Sum100 {

	public static void main(String[] args) {
		System.out.println(sumMiddle(100));
	}
	
	public static int sumMiddle(int num) {
		int i=0;
		if(num>0)
			i=num+sumMiddle(num-1);
		return i;
	}
}
