package com.cc._21_ordermanagement;

import java.util.Arrays;

public class CustomerOrderManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {101,202,303,404,505};
		swapNumbers(arr);
	}

	private static void swapNumbers(int[] arr) {
		// TODO Auto-generated method stub
		int temp= arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
	}


}
