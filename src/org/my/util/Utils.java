package org.my.util;

public class Utils {
	public static void print(Comparable array[]){
		for(Comparable a:array){
			System.out.println(a+" ");
		}
	}
	public static boolean less(Comparable a,Comparable b){
		return a.compareTo(b)<0;
	}
	public static void exec(Comparable[] array, int i, int max) {
		Comparable tmp = array[i];
		array[i]=array[max];
		array[max]=tmp;
	}
	

}
