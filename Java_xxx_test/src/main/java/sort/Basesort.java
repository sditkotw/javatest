package sort;

import java.util.Arrays;
import java.util.Date;

/**
 * * @author sdking
 * 
 * @date 创建时间：2018年1月29日 上午9:15:56
 * @version 1.0
 * @parameter 升序
 */
public class Basesort {

	public static void exchange(int[] a,int i,int j){
		//传统交换
		/*int temp=a[i];
		a[i]=a[j];
		a[j]=temp;*/

		//改进
		a[i]=a[i]+a[j];
		a[j]=a[i]-a[j];
		a[i]=a[i]-a[j];
	}

	// 1、简单选择排序，时间复杂度O(n^2),空间复杂度升为O(1)，不稳定
	public static void simple_select_sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int t = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[t]) {
					t = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[t];
			arr[t] = temp;
		}
	}
	// 2、冒泡排序原始版，时间复杂度O(n^2),空间复杂度升为O(1)，稳定
	//升序排列，从前往后冒泡，相邻比较，较大后移，一次冒泡后，最后一个数是数列中最大的
	//第二次冒泡，只要遍历到n-1位置即可
	public static void bubble_sort(int[] arr){
		for(int i=0;i<arr.length;i++){//i代表还有几次排序也是还有几个元素未被排序
			for(int j=0;j<arr.length-i-1;j++){ //注意减一，否则越界
				if(arr[j]>arr[j+1]){
					//exchange(arr[j],arr[j+1]);
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("第"+i+"冒泡后： " + Arrays.toString(arr));
		}
	}
	// 冒泡排序改进版
	public static void bubble_sort1(int[] arr){
		int f;//上一轮最后一次交换的位置
		for(int i=0;i<arr.length-1;i=arr.length-f-1){//还有f+1个元素未被顺序排列
			f=0;//如果在一次遍历中没有发生交换，则剩下的所有元素都已经按顺序排序，即未被排序的元素个数为1
			for(int j=0;j<arr.length-i-1;j++){//只需遍历到上次交换位置
				if(arr[j]>arr[j+1]){
					//exchange(arr[j],arr[j+1]);
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp; 
					f=j;
				}
			}
			System.out.println("第"+i+"冒泡后： " + Arrays.toString(arr));
		}
	}

	
	// 3、快速排序，不稳定
	//选取一个基准数，找到一个位置，在它之前的数都比基准数小，之后的数都比基准数大，基准数所在的位置就是排序后它应该在位置
	public static void quick_sort(int[] arr) {
		quick_sorts(arr, 0, arr.length - 1);
	}

	public static void quick_sorts(int[] arr, int l, int h) {
		if (h > l) {
			int m = quick_singlesort(arr, l, h);
			quick_sorts(arr, l, m - 1);
			quick_sorts(arr, m + 1, h);
		}

	}

	public static int quick_singlesort(int[] arr, int l, int h) {
		int base = arr[l];
		int m = l;
		// int temp;
		while (l < h) {
			while (arr[h] >= base && h > l) {
				h--;
			}
			arr[m] = arr[h];
			m = h;
			while (arr[l] <= base && l < h) {
				l++;
			}
			arr[m] = arr[l];
			m = l;
		}
		arr[m] = base;
		System.out.println(Arrays.toString(arr) + "  m是" + m);
		return m;
		//经过一轮循环后，m之前的数都比base小，m以后的数都比base大
	}




	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//1.简单插入排序，时间复杂度O(n^2),空间复杂度升为O(1),稳定
	public static void insert_sort(int[] arr) {
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			int j=i-1;
			while(j>=0){				
				if(arr[j]>temp) //此处不能写 = 会造成不稳定
					arr[j+1]=arr[j];
				else
					break;
				j--;
			}
			arr[j+1]=temp;
		}
	}
	
	//2.希尔排序，时间复杂度O(n^1.3),空间复杂度升为O(1),不稳定
	//以n/2/2...的步长分组做插入排序
	//以 87654321  为例：第一次步长4  84	73	62	51  分别遍历排序（改进后一次遍历）     43218765
	//				    第二次步长2  4286  3175  分别遍历排序（改进后一次遍历）     24681357
	//					第三次步长1  24681357  分别遍历排序（改进后一次遍历）     12345678
	public static void shell_sort(int[] arr) {
		int i=arr.length/2;
		while(i>0){
			shell1(arr,i);
			System.out.println(Arrays.toString(arr));
			i=i/2;
		}
	}

	//分别遍历
	public static void shell(int[] arr,int k) {
		for(int start=0;start<k;start++){
			for(int i=start;i<arr.length;i=i+k){
				int temp=arr[i];
				int j=i-k;
				while(j>=start){				
					if(arr[j]>temp)
						arr[j+k]=arr[j];
					else
						break;//次数大大高于插入排序
					j=j-k;
				}
				arr[j+k]=temp;
			}
		}		
	}
	//一次遍历，改进
	public static void shell1(int[] arr,int k){
		for (int i=k;i<arr.length;i++){
			int temp=arr[i];
			int j=i-k;
			while(j>=0){
				if(arr[j]>temp)
					arr[j+k]=arr[j];
				else
					break;//次数大大高于插入排序
				j=j-k;
			}
			arr[j+k]=temp;
		}
	}

	//3、归并排序,时间复杂度O(nlogn),空间复杂度升为O(n),稳定
	//期间共需要做logn次拆分。每次时间复杂度为O(n)
	public static void merge_sort(int[] arr, int l, int h) {
		if (h > l) {
			merge_sort(arr, l, l+(h - l) / 2);
			merge_sort(arr, l+(h - l) / 2 + 1, h);
			merge(arr, l, l+(h - l) / 2, h);
		}
	}

	//假定两个有序数列，将他们合并成一个大的有序数列
	//a[l]到a[m]有序;  a[m+1]到a[h]有序 ;升序
	public static void merge(int[] arr, int l, int m, int h) {
		if(h>l){
			int[] tarr = new int[h - l + 1];//实践中不可能每次都开空间，当数据达到百万级的时候，空间浪费严重，gc很慢，可以在初始化中开好，传入
			int j = l;
			int k = m + 1;
			int i=0;
			//////时间复杂度蜕化为O(n),空间复杂度升为O(n)
			while(j<=m&&k<=h){
				if (arr[j] <=arr[k]) {//  =保证稳定
					tarr[i] = arr[j];
					j++;
				} else {
					tarr[i] = arr[k];
					k++;
				}
				i++;
			}
			while(j<=m){
				tarr[i] = arr[j];
				j++;
				i++;
			}
			while(k<=h){
				tarr[i] = arr[k];
				k++;
				i++;
			}
			//////时间复杂度蜕化为O(n),空间复杂度升为O(n)

			for(int t=0; t < tarr.length; t++){
				arr[l+t]=tarr[t];
			}
		}
		//	System.out.println(l+"-"+m+"-"+h+"-"+Arrays.toString(arr));
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 堆排序,升序
	public static int heap_sort(int[] arr) {
		int num=0;
		int tmp;
		for (int i = 0; i < arr.length; i++) {
			num+=create_heap2(arr, arr.length - i);// 大顶堆
			System.out.println("第" + i + "次构建大顶堆 " + Arrays.toString(arr));
			tmp = arr[0];
			arr[0] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = tmp;
		}
		return num;
	}

	// 向下堆化构建顶点为最大值的堆。是完全的大顶堆
	public static int create_heap(int[] arr, int length) {
		int num=0;//次数
		int base;
		int basevalue;
		//初始化j为最后一个节点的父节点，即最后一个非叶子节点
		for (int j = (length >> 1) - 1; j >= 0; j--) {//外层是从最后一个非叶子节点开始遍历所有的非叶子节点向上堆化
			base = j;
			for (int i = j; i < length; i = base) {//内层是对位置j的非叶子节点向上堆化的过程，只要有交换就向上遍历交换的位置，直到构建完全大顶堆
				basevalue = arr[base];
				boolean flag = true;//flag是为了记录在本次向下堆化过程中有无交换，如果没有说明arr[j]非叶子节点已经找到位置，不用向上遍历了
				if (2 * i + 2 < length && arr[2 * i + 2] > arr[i]) {
					base = 2 * i + 2;
					arr[i] = arr[base];
					flag = false;
					num++;
				}
				if (2 * i + 1 < length && arr[2 * i + 1] > arr[i]) {
					base = 2 * i + 1;
					arr[i] = arr[base];
					flag = false;
					num++;
				}
				if (flag)
					break;
				arr[base] = basevalue;
			}

			// System.out.println("顶点j"+j+Arrays.toString(arr));
		}
		return num;
	}

	//优化
	//对每个非叶子节点向下堆化只做一次，因为从最后一非叶子节点遍历已经保证了最大值在顶点；不是完整大顶堆，只能保证根节点是最大值，因为一次交换后不再往下遍历可能会破坏下级堆
	public static int create_heap2(int[] arr, int length) {
		int num=0;//次数
		int cur;
		int basevalue;
		//初始化j为最后一个节点的父节点，即最后一个非叶子节点
		for (int j = (length >> 1) - 1; j >= 0; j--) {
			//这段代码是比较j和他的左右子节点中最大的放在j位置
			cur = j;
			basevalue = arr[j];
			if (2 * j + 2 < length && arr[2 * j + 2] > arr[j]) {
				cur = 2 * j + 2;
				arr[j] = arr[cur];
				num++;
			}
			if (2 * j + 1 < length && arr[2 * j + 1] > arr[j]) {
				cur = 2 * j + 1;
				arr[j] = arr[cur];
				num++;
			}
			arr[cur] = basevalue;
			//这段代码是比较j和他的左右子节点中最大的放在j位置
		}
		return num;
	}


	public static void main(String[] args) {
		int[] arr = {8,7,6,5,4,3,2,1,19,20,10,11,0,15,18,17,12,14,25,13,21,22,26,23,24,28,29,30,27,16};
		System.out.println("排序前： " + Arrays.toString(arr));
		
		 //bubble_sort2(arr);
		//quick_sort(arr);
		// simple_select_sort(arr);


		//insert_sort(arr);
		//shell_sort(arr);
		//merge_sort(arr,0,arr.length-1);
		 int num=heap_sort(arr);


		System.out.println("排序后： " + Arrays.toString(arr)+"----次数："+num);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////
	//1.八大排序之外的方法------计数排序
	//场景：对14亿年龄数据排序（0-120）
	//实现：开一个int[120] arr,一次读取数据n，arr[n]++
	//时间复杂度O(n),空间复杂度O（m）m是数据的范围，不管时间复杂度或者空间复杂度都远高于八大排序
}
