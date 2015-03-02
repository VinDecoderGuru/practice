package com.problems;

/**
 *
 * Write a program to convert decimal number to binary format using numeric operations.
 *
 * Created by vinay.pawar on 2/10/15.
 */
public class DecimalToBinary {

    public void decimalToBinary(int number) {
        int[] binary = new int[24];
        int index = 0;
        while (number > 0) {
            binary[index++] = number%2;
            number = number/2;
        }

        for (int i=index-1; i>=0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {
        new DecimalToBinary().decimalToBinary(7);
    }
}
