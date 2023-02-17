package pack_test1;
/** * @author  sdking 
 * @date 创建时间：2018年4月10日 上午10:20:13 
 * @version 1.0 
 * @parameter   
 */
public class TriYanghui {
	final static int LINE=6;
public static void main(String[] args){
	int[][] arr=new int[LINE][];
	for(int i=0;i<arr.length;i++){
		arr[i]=new int[i+1];
		arr[i][0]=1;
		for(int j=1;j<i;j++){
			arr[i][j]=arr[i][j-1]+arr[i-1][j];
		}
		arr[i][i]=1;
	}
	printForArr(arr);
}
public static void printForArr(int[][] arr){
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			System.out.print(arr[i][j]+" ");
		}
		System.out.println("");
	}
}
}
