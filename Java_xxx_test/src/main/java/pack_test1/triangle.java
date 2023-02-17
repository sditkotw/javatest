package pack_test1;

public class triangle {
	public void creatri(int i){
			StringBuffer  line=new StringBuffer();
			int j,k,l;
			for(j=1;j<=i;j++){
				k=1;
				
				while(k<=i-j){
					line.append(" ");
					k++;
				};
				for(l=1;l<=2*j-1;l++){
					line.append("*");
				}
				k=1;
				while(k<=i-j){
					line.append(" ");
					k++;
				};
				System.out.println(line);
				line.delete(0, line.length());
			}
		}
	
	public static void main(String[]args){
		triangle tri=new triangle();
		tri.creatri(4);
	}
}
