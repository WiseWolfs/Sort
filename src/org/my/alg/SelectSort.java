package org.my.alg;

import org.my.util.Utils;
/**
 * 选择法排序
 * @author administrator
 *
 */
public class SelectSort {
	public static void main(String[] args) {
		Integer num[]={5,1,44,30,21,10,9,72,81,33};
		sort(num);
		Utils.print(num);
		
		
	}
	
	public static void sort(Comparable array[]){
		int N=array.length;
		int max=0;
		for(int i=0;i<N-1;i++){
			max = i;
			for(int j=i+1;j<N;j++){
				if(!Utils.less(array[j],array[max])){
					max=j;
					
				}
			}
			if(max!=i)
				Utils.exec(array,i,max);
		}
	}

}
