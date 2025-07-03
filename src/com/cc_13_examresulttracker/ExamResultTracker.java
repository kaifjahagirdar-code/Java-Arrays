package com.cc_13_examresulttracker;

public class ExamResultTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {45, 32, 90, 29, 76};
		
		resultTracker(arr);

	}

	private static void resultTracker(int[] arr) {
		// TODO Auto-generated method stub
		int passed=0;
		int failed=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=35)
			{
				passed++;
			}else {
				failed++;
			}
		}
		System.out.println("Number of Students Passed= "+passed);
		System.out.println("Number of Students failed= "+failed);
		
	}

}
