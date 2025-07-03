package com.cc._11_AttendenceAnalyzer;

public class AttendanceAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,1,1,0};
		
		totalAttendance(arr);

	}

	private static void totalAttendance(int[] arr) {
		// TODO Auto-generated method stub
		int present=0;
		int absent=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==1) {
				present++;
			}else {
				absent++;
			}
		}
		System.out.println("Present= "+present);
		System.out.println("Absent= "+absent);
		
	}

}
