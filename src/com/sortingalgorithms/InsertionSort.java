package com.sortingalgorithms;

import com.util.Swap;


/**
 * Created by vinay.pawar on 2/9/14.
 */
public class InsertionSort extends BaseSort {


    @Override
    public void sort(int[] arrayToSort) {
        for(int i= 1 ; i< arrayToSort.length ; i++) {
            int j = i;
            while (j > 0 && (arrayToSort[j] < arrayToSort[j-1])) {
                Swap.swap(arrayToSort,j,j-1);
                j--;
            }
        }
    }
}
