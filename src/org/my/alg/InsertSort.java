package org.my.alg;

import org.my.util.Utils;

/**
 * 插入排序
 * @author administrator
 *
 */
public class InsertSort {
	public static void main(String[] args) {
		Integer num[]={5,1,44,30,21,11,8,72,81,33};
		sort(num);
		Utils.print(num);
		
	}
	public static void sort(Comparable array[]){
		for(int i=0;i<array.length-1;i++){
			for(int j=i;j>0 && Utils.less(array[j+1], array[j]);j--){
				Utils.exec(array, j+1, j);
			}
		}
	}

}
