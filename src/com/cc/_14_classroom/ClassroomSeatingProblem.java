package com.cc._14_classroom;

public class ClassroomSeatingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 20, 30, 20, 40, 10};
		getDuplicateSeats(arr);
	}

	private static void getDuplicateSeats(int[] arr) {
		// TODO Auto-generated method stub
		System.out.print("Duplicate Seats=");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(" "+arr[i]);
					break;
				}
				
			}
		}
		

		
	}

}
