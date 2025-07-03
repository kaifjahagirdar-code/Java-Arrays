package com.cc._09_RotateLeftArray;

public class RotateLeftArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		
		 arr = rotateArray(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	private static int[] rotateArray(int[] arr) {
		// TODO Auto-generated method stub
		int temp= arr[arr.length-1];
		for(int i=arr.length-2; i>=0; i--)
		{
			
			arr[i+1]=arr[i];
		}
			arr[0]=temp;
			
		return arr;
	}
	
 }


