package com.util;


/**
 * Created by vinay.pawar on 2/9/14.
 */

public abstract class PrintData {
	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("array["+i+"] :: "+array[i]+"\t");
		}
		System.out.println();
	}
	
	public static void printArray(int array[],boolean addDelay) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("array["+i+"] :: "+array[i]+"\t");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Error while printing array");
		}
		System.out.println();
	}
}
