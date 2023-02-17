package pack_test1;

public class Narcissus {
	public void find_narci(int Mii ,int Mai){
		int i,plus=0;
		int h,t,s;
		for(i=Mii;i<Mai;i++){
			h=i/100;
			t=(i-h*100)/10;
			s=i-h*100-t*10;
			plus=h*h*h+t*t*t+s*s*s;
//			System.out.println(plus);
			if(i==plus){
				System.out.println(i+"是水仙花数");
			}
		}
		
	}
	public static void main(String [] agrs){
		Narcissus nar=new Narcissus();
		nar.find_narci(100, 1000);
	}
}
