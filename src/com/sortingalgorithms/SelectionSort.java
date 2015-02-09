package com.sortingalgorithms;

import com.util.PrintData;
import com.util.Swap;


/**
 * Created by vinay.pawar on 2/9/14.
 */
public class SelectionSort extends BaseSort {

	@Override
	public void sort(int[] arrayToSort) {
		for (int i = 0; i < arrayToSort.length; i++) {
			int maxValueIndex = i;
			for (int j = i+1; j < arrayToSort.length; j++) {
				if(arrayToSort[maxValueIndex] < arrayToSort[j]) {
					maxValueIndex = j;
				}
			}
			if(maxValueIndex != i) {
				Swap.swap(arrayToSort, i, maxValueIndex);
			}
			PrintData.printArray(arrayToSort,true);
		}
	}
}
