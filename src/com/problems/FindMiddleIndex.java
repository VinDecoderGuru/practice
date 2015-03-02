package com.problems;

/**
 *
 * You are given an array of numbers. Find out the array index or position
 * where sum of numbers preceeding the index is equals to sum of numbers
 * succeeding the index.
 * Created by vinay.pawar on 2/10/15.
 */
public class FindMiddleIndex {

    public Integer findIndexMatchingSumOfAdjacentTwoNumbers(int[] array) {
        Integer index = null;
        if(array!= null && array.length > 5) {
            for(int i = 2 ; i< array.length - 3 ; i++) {
                if((array[i-1]+array[i-2]) == (array[i+1]+array[i+2])) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    public Integer findIndexMatchingSumOfAllNumbers(int[] array) {
        Integer index = null;
        int startIndex = 0;
        int endIndex = array.length -1;
        int leftSum = 0;
        int rightSum = 0;

        while (startIndex < endIndex) {
            leftSum += array[startIndex++];
            rightSum += array[endIndex--];
            System.out.println("leftSum :: "+leftSum+" & rightSum :: "+rightSum);
            if(leftSum == rightSum) {
                // Need to decrement the start index as its already incremented.
                index = --startIndex;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,3,2,1};
        Integer index = null;

//        index = new FindMiddleIndex().findIndexMatchingSumOfAdjacentTwoNumbers(array);
//        if(index == null) {
//            System.out.println("No matching index found");
//        } else  {
//            System.out.println("Index found :: "+index);
//        }


        index = new FindMiddleIndex().findIndexMatchingSumOfAllNumbers(array);
        if(index == null) {
            System.out.println("No matching index found");
        } else  {
            System.out.println("Index found :: "+index);
        }

    }
}
