package com.sortingalgorithms;

import com.util.Swap;


/**
 * Created by vinay.pawar on 2/9/14.
 */
public class BubbleSort extends BaseSort {
	
	public void sort(int[] arrayToSort) {
		for (int i = arrayToSort.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				//change condition for changing sort order. 
				if(arrayToSort[j] < arrayToSort[j+1]) {
					Swap.swap(arrayToSort, j, j+1);
					//To see what happens after swap print array
					//PrintData.printArray(arrayToSort,true);
				}
			}
		}
	}
}
