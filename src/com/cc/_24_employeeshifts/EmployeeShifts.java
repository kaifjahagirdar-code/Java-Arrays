package com.cc._24_employeeshifts;

public class EmployeeShifts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,10,11,12,1};
		shiftTimings(arr);

	}

	private static void shiftTimings(int[] arr) {
		// TODO Auto-generated method stub
		int temp=arr[0];
		int k = 2;
		for (int i = 0; i < k; i++) {
            int last = arr[arr.length - 1];
            
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = last;
			
	}
		System.out.print("Rotated shift timings: ");
		for (int i = 0; i < arr.length; i++) {
		    System.out.print(arr[i] + " ");
		}

}
}