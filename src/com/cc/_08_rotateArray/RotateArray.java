package com.cc._08_rotateArray;

public class RotateArray {

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
		int temp= arr[0];
		for(int i=0; i<arr.length-1; i++)
		{
			
			arr[i]=arr[i+1];
		}
			arr[arr.length-1]=temp;
			
		return arr;
	}
	

}