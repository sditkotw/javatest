package pack_test1;

public class Rmbchange {
	public String changeToChi(double money){
		int i,j;
		String strmoney="";
		String[] strArr;
		StringBuffer stb=new StringBuffer();
/*		char[] arr;
		arr=new char[]{'��','Ҽ'};*/
		char[] arr={'零','壹','贰','叁','肆','伍','陆','柒','捌','玖','拾'};
		String[] unit1={"元","十","佰","仟","万","十万","百万","千万","亿"};
		String[] unit2={"角","分"};
		strmoney=String.valueOf(money);
		strArr=strmoney.split("\\.");//split中"."和"|"都是转义字符不能直接用
		
		//处理元以上金额
		for(i=0;i<strArr[0].length();i++){
			j=(int)strArr[0].charAt(i)-48;//ASCII编码中char12345比int12345大48
			stb.append(arr[j]+unit1[strArr[0].length()-i-1]);
		}
		//处理角分
		for(i=0;i<2;i++){
			j=(int)strArr[1].charAt(i)-48;//ASCII编码中char12345比int12345大48
			stb.append(arr[j]+unit2[i]);
		}
		return stb.toString();
		
	}
	public static void main(String[] args){
		Rmbchange mn=new Rmbchange();
		double m=1234.567;
		System.out.println(mn.changeToChi(m));
		
	}
	
}
