package pack_test2;

public class PackageTest {
    //背包问题的数组形式：求一个数组中，连续子数组的最大值
    static int begin;
    static int end;

    public static int max(int i,int j,int z){
        return z>(i>j?i:j)?z:(i>j?i:j);
    }

    public static int max(int i,int j){
        return i>j?i:j;
    }

    public static int getMaxArrSum(int[] arr){
        int maxSum=arr[0];
        int maxWithEnd=arr[0];//包含最后一个数的最大值

        begin=end=1;//记录位置

        for (int i=1;i<arr.length;i++){
            //maxSum=max(maxSum,arr[i],maxSum+arr[i]);//这样求出来的是不连续子数组的和

            maxWithEnd=max(maxWithEnd+arr[i],arr[i]);
            if(maxWithEnd==arr[i])begin=i;
            maxSum=max(maxSum,maxWithEnd);//max[n]要么包括最后一个数，要么不包含，包含max[n]=maxEnd[n],不包含max[n]=max[n-1]
            if(maxSum==maxWithEnd)end=i;
        }
        return maxSum;
    }

    public static void main(String[] args) {
            int[] arr={1,-2,4,8,-4,7,-1,-5};
        System.out.println(getMaxArrSum(arr));
        System.out.println("begin: "+begin+"--end: "+end);
    }
}
