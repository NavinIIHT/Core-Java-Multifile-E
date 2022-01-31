package com.iiht.training.negativefirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayNegativeBeforePositive {

	public static void main(String[] args) throws IOException {
		ArrayNegativeBeforePositive negativeBeforePositive = new ArrayNegativeBeforePositive();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
        
		String data = br.readLine();
		String[] numbers = data.split(" ");
		int[] array_nums = new int[size];
		
		for(int i=0 ; i<size; i++) {
			array_nums[i]= Integer.parseInt(numbers[i]);
		}
		
	       int array[] = negativeBeforePositive.getNegativeFirst(array_nums);
	       for(int i=0 ; i<size; i++) {
	    	   if(i < size-1) {
				System.out.print(array[i]+" ");
	    	   }else {
	    		   System.out.print(array[i]);
	    	   }
			}
	       
	    }

	public int[] getNegativeFirst(int[] array_nums) {
		// Write Code Here
		return null;
	}
}
