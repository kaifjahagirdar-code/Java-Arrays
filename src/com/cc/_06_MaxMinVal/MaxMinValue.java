package com.cc._06_MaxMinVal;

import java.util.Scanner;

public class MaxMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner keyboard = new Scanner(System.in);
        
		System.out.println("Enter the size of the Array= ");
		int size= keyboard.nextInt();
		
		int[] arr= new int[size];
		System.out.println("Enter the "+ size+ " elements of the Array= ");
		for (int i = 0; i < size; i++) {
           arr[i] = keyboard.nextInt();
       }


		getMaxMinVal(arr);
		keyboard.close();
		
	}

	private static void getMaxMinVal(int[] arr) {
		// TODO Auto-generated method stub
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		
	}
		System.out.println("Max Element=" + max);
		System.out.println("Min Element=" + min);

	}

}
