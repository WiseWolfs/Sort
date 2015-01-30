package org.my.alg;

import org.my.util.Utils;

/**
 * 快速排序
 * @author administrator
 *
 */
public class QuickSort {
	public static void main(String[] args) {
		Integer num[]={5,1,44,30,21,11,8,72,81,33};
		sort(num, 0, 9);
		Utils.print(num);
	}
	public static void sort(Comparable array[],int low,int high){
		//分治法
		//1，分解
		int primary=0;
		if(low<high){
			primary =Parttion(array,low,high);
			
			//2，解决
			sort(array,low,primary-1);
			sort(array,primary+1,high);
			//3，合并,nothing
		}
		
	}
	public static int Parttion(Comparable[] array, int low, int high) {
		Comparable x=array[high];
		int i=low-1;
		for(int j=low ;j<high;j++){
			if(Utils.less(array[j],x)){
				i++;
				Utils.exec(array, i, j);
			}
			
		}
		Utils.exec(array, i+1, high);
		return i+1;
		
		
	}
}
