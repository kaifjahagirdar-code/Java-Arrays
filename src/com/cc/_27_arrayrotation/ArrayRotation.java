package com.cc._27_arrayrotation;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int n=2;
		
		rotateArray(arr,n);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

	private static void rotateArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		 n = n % arr.length; 
		 for (int i = 0; i < n; i++) {
				int temp = arr[arr.length-1];
				for (int j = arr.length - 1; j > 0; j--) {
					arr[j] = arr[j - 1];
				}
				arr[0] = temp;
			}
		}
	}


