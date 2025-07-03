package com.cc._04_UpdateElement;

import java.util.Scanner;

public class UpdateElement {

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
		System.out.println("Enter the new value in the Array= ");
		int value= keyboard.nextInt();
		for(int i=0; i< arr.length; i++)
		{
		 value= arr[i];
		}
		
		
		getNewValue(arr);
		keyboard.close();
	}

	private static void getNewValue(int[] arr) {
		// TODO Auto-generated method stub
		
		
		
	}
	

}
