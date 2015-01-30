package org.my.alg;

import org.my.util.Utils;

/**
 * 堆排序
 * @author administrator
 *
 */
public class HeapSort {
	public static void main(String[] args) {
		Integer num[]={5,1,44,30,21,11,8,72,81,33};
		sort(num);
		Utils.print(num);
		
	}
	public static void sort(Comparable array[]){
		//Build-Max-Heap(A)
		buildMaxHeap(array);
		
		for(int i=array.length-1;i>=0;i--){
			Utils.exec(array, i, 0);
			heapfy(array,i,0);
		}
		
	}
	//维护最大堆,   MAX在这里的作用就是为了不发生溢出，因为叶子节点没有子节点
	public static void heapfy(Comparable[] array, int max, int index) {
		int largest = 0;
		int left = 2*index+1;
		int right = 2*index+2;
		if(left<max && Utils.less(array[index], array[left])){
			largest = left;
		}else{
			largest = index;
			
		}
		if(right<max && Utils.less(array[largest],	array[right])){
			largest = right;
		}
		if(largest!=index){
			Utils.exec(array, largest, index);
			heapfy(array, max, index);
		}
	}
	//构建最大堆
	public static void buildMaxHeap(Comparable[] array) {
		for(int i=array.length/2-1;i>=0;i--){
			heapfy(array, i, array.length);
		}
	}
	

}
