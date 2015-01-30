package org.my.alg;

import org.my.util.Utils;

/**
 * 希尔排序
 * @author administrator
 *
 */
public class ShellSort {
	public static void main(String[] args) {
		Integer num[]={5,1,44,30,21,11,8,72,81,33};
		sort(num);
		Utils.print(num);
		
	}
	//插入排序的改进版
	public static void sort(Comparable array[]){
		int di=5;
		while(di >0){
			for(int i=1;i<array.length;i++){
				for(int j=i;j>0 && Utils.less(array[j], array[j-1]);j--){
					Utils.exec(array, j, j-1);
				}
			}
			di-=2;
		}
		
	}
	

}
