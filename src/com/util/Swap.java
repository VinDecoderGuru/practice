package com.util;


/**
 * Created by vinay.pawar on 2/9/14.
 */

public class Swap {
	
	public static void swap(int[] arrayToSwap, int index1, int index2) {
		int temp = arrayToSwap[index1];
		arrayToSwap[index1] = arrayToSwap[index2];
		arrayToSwap[index2] = temp;
	}

}
