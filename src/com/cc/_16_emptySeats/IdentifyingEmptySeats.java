package com.cc._16_emptySeats;

public class IdentifyingEmptySeats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,0,1,1,0,1,0,0,1};
		getEmptySeats(arr);

	}

	private static void getEmptySeats(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
		}
		System.out.println("Empty Seats= "+count);
		
	}

}
