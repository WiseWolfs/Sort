package org.my.alg;

import org.my.util.Utils;

public class MergeSort {
	public static void main(String[] args) {
		Integer num[]={5,1,44,30,21,11,8,72,81,33};
		sort(num, 0, 9);
		Utils.print(num);
		
	}
	public static void sort(Comparable array[],int low,int high){
		//分治法
		//1，分解成两个数组
		int mid =0;
		if(high>low){
			mid =low+(high-low)/2;
			//2，递归解决
			sort(array,low,mid);
			sort(array,mid+1,high);
			//3，合并
			merge(array,low,mid,high);
		}
		
	}
	public static void merge(Comparable array[],int low,int mid,int high){
		int i=low,j=mid+1;
		//构建一个辅助数组
		Comparable aux[]=new Comparable[array.length];
		for(int k=low;k<=high;k++){
			aux[k]=array[k];
		}
		for(int k=low;k<=high;k++){
			//左半边用尽(右半边拿）
			if(i>mid){
				array[k]=aux[j++];
			}else if(j>high){
				array[k]=aux[i++];
			}else if(Utils.less(aux[j], aux[i])){
				array[k]=aux[j++];
			}else{
				array[k]=aux[i++];
			}
			
		}
	}

}
