package com.problems;

/**
 * Created by vinay.pawar on 2/9/14.
 */
public class ReverseStringUsingArray {

    public char[] reverseArray(char array[]) {
        int index = array.length/2;
        for(int i = 0;i<index;i++) {
            char temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;

    }

    public static void main(String args[]) {
        char[] test = {'t','h','i','s',' ','n','e','e','d',' ','r','e','v','e','r','s','e'};
        new ReverseStringUsingArray().reverseArray(test);
        System.out.println(test);
    }
}
