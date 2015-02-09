package com.problems;

import com.util.*;

/**
 *
 * You have got a range of numbers between 1 to N, where one of the number is repeated.
 * You need to write a program to find out the duplicate number. -
 *
 * Created by vinay.pawar on 2/9/14.
 */

public class FindDuplicateInArray {

    private static int[] numberArray = {1,2,3,4,5,6,7,1,9};

    public static Integer findDuplicateNumber(int array[]) {
        Integer duplicateNumber = null;
        boolean foundDuplicate = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1 ; j < array.length ; j++) {
                if(array[i] == array[j]) {
                    duplicateNumber = array[i];
                    foundDuplicate = true;
                }
                if (foundDuplicate) {
                    return duplicateNumber;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Given array");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i]+"\t");
        }
        System.out.println();

        Integer duplicateNumber = findDuplicateNumber(numberArray);
        if(duplicateNumber == null) {
            System.out.println("All numbers are unique in the array.");
        } else {
            System.out.println(duplicateNumber + " is repeated in the array");
        }
    }
}
