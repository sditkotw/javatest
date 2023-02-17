package pack_test1;
import java.util.Scanner;

public class Goband {
	final int BOARD=20;
	static boolean overFlag=false;
	//初始化棋盘
	public String[][] inalizeChessBoard(){
		//棋盘大小		
		String[][] arrB=new String[BOARD][BOARD];
		int i,j;
		for(i=0;i<BOARD;i++){
			for(j=0;j<BOARD;j++){
				arrB[i][j]="十";					
			}
		}
		printChessBoard(arrB);
		return arrB;
	}
	//打印棋盘
	public void printChessBoard(String[][] arrB){
		int i,j;
		for(i=0;i<arrB.length;i++){
			for(j=0;j<arrB[i].length;j++){
				System.out.print(arrB[i][j]);							
			}
			System.out.println("");
		}
		System.out.println("");
		
	}
	//判断是否赢棋
	public  static void  gameOver(int r,int c,String[][] arr){
		int i=0,j=0,state=0;
		int minL,maxL;
		String temp;
		
		//行方向判断
		minL=c>4?c-4:0;
		maxL=c<15?c:15;
		
		for(i=minL;i<=maxL;i++){
			for(j=i;j<i+4;j++){
				temp=arr[r][j];
				if(temp==arr[r][j+1]){state++;}
				
			}
			if(state==4){
				overFlag=true;
			}else{
				state=0;
			}
		}
		
		//列方向判断
				minL=r>4?r-4:0;
				maxL=r<15?r:15;
				
				for(i=minL;i<=maxL;i++){
					for(j=i;j<i+4;j++){
						temp=arr[j][c];
						if(temp==arr[j+1][c]){state++;}
						
					}
					if(state==4){
						overFlag=true;
					}else{
						state=0;
					}
				}
		//西北-东南方向判断
				int kL=Math.min(r, c);
				int kH=Math.max(r, c);
				minL=kL>4?kL-4:0;
				maxL=kH<15?kH:15;
				//问题？
				for(i=minL-kL;i<=maxL-kH;i++){
					for(j=i;j<i+4;j++){
						temp=arr[r+j][c+j];
						if(temp==arr[r+j+1][c+j+1]){state++;}
						
					}
					if(state==4){
						overFlag=true;
					}else{
						state=0;
					}
				}
		//东北-西南方向判断
				kL=Math.min(r, 19-c);
				kH=Math.max(r, 19-c);
				minL=kL>4?kL-4:0;
				maxL=kH<15?kH:15;
				//问题？
				for(i=minL-kL;i<=maxL-kH;i++){
					for(j=i;j<i+4;j++){
						temp=arr[r+j][c-j];
						if(temp==arr[r+j+1][c-j-1]){state++;}
						
					}
					if(state==4){
						overFlag=true;
					}else{
						state=0;
					}
				}
		
	}
	//五个连续棋子相同的算法
	public void ifFiveSame(int i, String [][] arr){
		//方法重载？？
	}
	
	//判断玩家落子是否合法，不合法返回
	public boolean rightMoves(int r,int c,String[][] arr){	
		boolean flag=false;
		if(0<=r&&r<BOARD&&0<=c&&c<BOARD&&arr[r][c]=="十"){
			
			flag=true;
		}else{
			System.out.println("重新输入");
		}
		return flag;
	}
	
	//电脑下棋
	public String[][] computerPlay(String[][] arr){
		boolean flag=true;
		int r=0,c=0;
		while(flag){
			r=(int)(Math.random()*20+1);
			c=(int)(Math.random()*20+1);
			flag=!(rightMoves(r,c,arr));
		}
		arr[r][c]="○";
		gameOver(r,c,arr);
		return arr;
		
	}
	//玩家下棋
	public String[][] playerPlay(String[][] arr){
		boolean flag=true;
		int r=0,c=0;
		while(flag){
			Scanner sc1=new Scanner(System.in);
			System.out.println("请输入落子行数：");
			r = sc1.nextInt(); 
			Scanner sc2=new Scanner(System.in);
			System.out.println("请输入落子列数：");			
			c = sc2.nextInt();
			flag=!(rightMoves(r,c,arr));
		}
		arr[r][c]="●";
		gameOver(r,c,arr);
		return arr;
		
	}
	public static void main(String []args){
		Goband gob=new Goband();
		String[][] arr;
		arr=gob.inalizeChessBoard();
		while(!gob.overFlag){
			arr=gob.playerPlay(arr);
			gob.printChessBoard(arr);
			arr=gob.computerPlay(arr);
			gob.printChessBoard(arr);
		}
		System.out.println("You Win!");
		
	}
}
