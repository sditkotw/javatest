package pack_test1;

public class Cricle {
	public Cricle(int r){
		StringBuffer line=new StringBuffer();
		int d=2*r;
		int i=0;
		double k=0.0;
		while(i<d){
			line.append(" ");
			i++;
		}
		for(i=0;i<d;i++){
			/*if(i<r){
				k=Math.sqrt((r*r-(r-i)*(r-i)));
			}else{
				k=Math.sqrt((r*r-(i-r)*(i-r)));
			}*/
			k=Math.sqrt((r*r-(r-i)*(r-i)));
			int w1=r-(int) Math.floor(k);
			int w2=r+(int) Math.floor(k)-1;
			line.setCharAt(w1, '*');
			line.setCharAt(w2, '*');
			System.out.println(line);
			line.setCharAt(w1, ' ');
			line.setCharAt(w2, ' ');
		}
	}
	public static void main(String[]args){
		Cricle o =new Cricle(10);
	}
	
}
