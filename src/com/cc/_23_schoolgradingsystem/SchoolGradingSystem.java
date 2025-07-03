package com.cc._23_schoolgradingsystem;

public class SchoolGradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {85, 90, 92, 88, 94};
		secHighest(arr);

	}

	private static void secHighest(int[] arr) {
		// TODO Auto-generated method stub
		int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            int grade = arr[i];
            
            if(grade>highest)
            {
            	secondHighest=highest;
            	highest=grade;
            }else if(grade>secondHighest && grade != highest)
            {
            	secondHighest= grade;
            }
        }
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("No second highest grade.");
        } else {
            System.out.println("Second highest grade: " + secondHighest);
        }
    }
}
		
	
