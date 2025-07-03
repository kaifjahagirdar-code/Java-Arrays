package com.cc._20_attendancesystem;

public class ClassroomAttendanceSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,0,1,0};
		calculatePercentage(arr);

	}

	private static void calculatePercentage(int[] arr) {
		// TODO Auto-generated method stub
		int total= arr.length;
		int present=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				present++;
			}
		}
		System.out.println((double)present/total*100+"%");
	}

}
