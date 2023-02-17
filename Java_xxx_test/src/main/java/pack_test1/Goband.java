package pack_test1;
import java.util.Scanner;

public class Goband {
	final int BOARD=20;
	static boolean overFlag=false;
	//��ʼ������
	public String[][] inalizeChessBoard(){
		//���̴�С		
		String[][] arrB=new String[BOARD][BOARD];
		int i,j;
		for(i=0;i<BOARD;i++){
			for(j=0;j<BOARD;j++){
				arrB[i][j]="ʮ";					
			}
		}
		printChessBoard(arrB);
		return arrB;
	}
	//��ӡ����
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
	//�ж��Ƿ�Ӯ��
	public  static void  gameOver(int r,int c,String[][] arr){
		int i=0,j=0,state=0;
		int minL,maxL;
		String temp;
		
		//�з����ж�
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
		
		//�з����ж�
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
		//����-���Ϸ����ж�
				int kL=Math.min(r, c);
				int kH=Math.max(r, c);
				minL=kL>4?kL-4:0;
				maxL=kH<15?kH:15;
				//���⣿
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
		//����-���Ϸ����ж�
				kL=Math.min(r, 19-c);
				kH=Math.max(r, 19-c);
				minL=kL>4?kL-4:0;
				maxL=kH<15?kH:15;
				//���⣿
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
	//�������������ͬ���㷨
	public void ifFiveSame(int i, String [][] arr){
		//�������أ���
	}
	
	//�ж���������Ƿ�Ϸ������Ϸ�����
	public boolean rightMoves(int r,int c,String[][] arr){	
		boolean flag=false;
		if(0<=r&&r<BOARD&&0<=c&&c<BOARD&&arr[r][c]=="ʮ"){
			
			flag=true;
		}else{
			System.out.println("��������");
		}
		return flag;
	}
	
	//��������
	public String[][] computerPlay(String[][] arr){
		boolean flag=true;
		int r=0,c=0;
		while(flag){
			r=(int)(Math.random()*20+1);
			c=(int)(Math.random()*20+1);
			flag=!(rightMoves(r,c,arr));
		}
		arr[r][c]="��";
		gameOver(r,c,arr);
		return arr;
		
	}
	//�������
	public String[][] playerPlay(String[][] arr){
		boolean flag=true;
		int r=0,c=0;
		while(flag){
			Scanner sc1=new Scanner(System.in);
			System.out.println("����������������");
			r = sc1.nextInt(); 
			Scanner sc2=new Scanner(System.in);
			System.out.println("����������������");			
			c = sc2.nextInt();
			flag=!(rightMoves(r,c,arr));
		}
		arr[r][c]="��";
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
