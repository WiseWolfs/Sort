package org.my.alg;

import org.my.util.Utils;

/**
 * 冒泡法排序
 * @author administrator
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		Integer num[]={5,1,44,30,21,11,8,72,81,33};
		sort(num);
		Utils.print(num);
	}
	public static void sort(Comparable array[]){
		for(int i=0;i<array.length-1;i++){
			for(int  j=0;j<array.length-i-1;j++){
				if(Utils.less(array[j+1],array[j])){
					Utils.exec(array, j, j+1);
				}
			}
		}
		
	}

}
