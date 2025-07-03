package com.cc._22_productrating;

public class ProductRatingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,-1,5,-2,3};
		positiveRatings(arr);

	}

	private static void positiveRatings(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				System.out.print(" "+arr[i]);
			}
		}
	}

}
