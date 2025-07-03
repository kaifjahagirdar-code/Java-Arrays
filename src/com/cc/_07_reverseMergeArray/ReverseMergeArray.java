package com.cc._07_reverseMergeArray;

public class ReverseMergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {1,2,3,4,5};
      int[] brr= {11,12,15};
      int[] crr= new int[arr.length+brr.length];
      reverseArray(arr, brr, crr);
	
      }

	private static void reverseArray(int[] arr, int[] brr, int[] crr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length;i++)
		{
			crr[i]=arr[i];
		}
	
		for(int i=0; i<brr.length; i++)
		{
			crr[arr.length+i]=brr[(brr.length-1)-i];
			
		}
		for(int i=0; i< crr.length; i++)
		{
			System.out.println(crr[i]);
		}
	}
		}
