package com.problems;

/**
 *
 * Write a program to reverse a number using numeric operations.
 *
 *
 * Created by vinay.pawar on 2/10/15.
 */
public class ReverseNumber {

    public Integer reverseNumber(Integer number) {
        if(number != null) {
            Integer reverseNumber = 0;
            while (number > 0) {
                reverseNumber = (number%10) + (reverseNumber*10);
                number = number / 10;
            }
            return reverseNumber;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseNumber().reverseNumber(4321));
    }

}
