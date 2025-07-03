package com.cc._17_bakeryorderstracker;

public class BakeryOrdersTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {45, 67, 30, 90, 10};
		getNoOfDays(arr);

	}

	private static void getNoOfDays(int[] arr) {
		// TODO Auto-generated method stub
		int days=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>50)
			{
				days++;
			}
		}
		System.out.println("Number of Days the orders exceeded 50= "+days);
		
	}

}
