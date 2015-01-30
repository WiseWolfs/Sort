package org.my.demo;

import org.my.util.Utils;

public class QuickSort {
	public static void main(String[] args) {
		Integer num[]={5,1,44,30,21,11,8,72,81,33};
		sort(num, 0, 9);
		Utils.print(num);
	}

	public static void sort(Integer[] num, int low, int high) {
		int primary =0;
		if(low<high){
			primary = Parttion(num,low,high);
			sort(num,low,primary-1);
			sort(num,primary+1,high);
		}
	}
	public static int Parttion(Comparable num[],int low, int high){
		Comparable x=num[high];
		int i= low-1;
		for(int j=low;j<high;j++){
			if(Utils.less(num[j], x)){
				i++;
				Utils.exec(num, j, i);
			}
		}
		Utils.exec(num, i+1, high);
		return i+1;
	}
	
}
