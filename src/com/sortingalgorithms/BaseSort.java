package com.sortingalgorithms;

import com.util.CreateData;
import com.util.PrintData;


/**
 * Created by vinay.pawar on 2/9/14.
 */
public abstract class BaseSort {

	private int[] arrayToSort;
	
	public abstract void sort(int[] arrayToSort);
	
	public BaseSort() {
		//use this array for checking best and worst case.
		//arrayToSort = new int[]{1,2,3,4,5};
		this.arrayToSort = CreateData.createArray(5);
	}
	
	public void sort() {
		System.out.println("Before Sorting");
		PrintData.printArray(arrayToSort);
		System.out.println();
		sort(arrayToSort);
		System.out.println("After Sorting");
		PrintData.printArray(arrayToSort);
	}

}
