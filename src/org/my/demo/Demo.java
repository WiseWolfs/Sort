package org.my.demo;

import java.util.Random;

import org.my.util.Utils;

public class Demo {
	public static void main(String[] args) {
		Integer array[]= new Integer[10];
		Random rand = new Random(15);
		for(int i=0;i<array.length;i++){
			array[i]=Math.abs(rand.nextInt())%50;
		}
		Bubble_Sort(array);
		Utils.print(array);
		
	}
	//起泡法
	public static void Bubble_Sort(Comparable []array){
		int N = array.length;
		for(int i=0;i<N-1;i++){
			for(int j=0;j<N-1-i;j++){
				if(Utils.less(array[j+1], array[j])){
					Utils.exec(array, j, j+1);
					
				}
			}
		}
	}
}
