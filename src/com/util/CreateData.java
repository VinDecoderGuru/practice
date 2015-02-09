package com.util;

import java.util.Random;


/**
 * Created by vinay.pawar on 2/9/14.
 */

public abstract class CreateData {
	
	public static int[] createArray(int size) {
		int[] array = new int[size];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100-1);
		}
		return array;
	}
}
