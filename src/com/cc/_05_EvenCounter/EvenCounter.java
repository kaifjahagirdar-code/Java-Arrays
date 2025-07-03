package com.cc._05_EvenCounter;

import java.util.Scanner;

public class EvenCounter {

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


		getEvenoddCount(arr);
		keyboard.close();
		
	}

	private static void getEvenoddCount(int[] arr) {
		// TODO Auto-generated method stub
		int evencount=arr[0];
		int oddcount=arr[0];
		for(int i=1;  i<arr.length; i++)
		{
		if(arr[i]%2 == 0)
		{
			evencount++;
		}else
		{
			oddcount++;
		}
		
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}
}

	
