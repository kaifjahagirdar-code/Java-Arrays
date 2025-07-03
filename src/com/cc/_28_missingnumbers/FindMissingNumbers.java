package com.cc._28_missingnumbers;

public class FindMissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 4, 6, 7, 8};
		int n=7;
		getmissingNumbers(arr,n);

	}

	private static void getmissingNumbers(int[] arr, int n) {
		// TODO Auto-generated method stub
		boolean[] present = new boolean[n + 1];  // Boolean array to mark presence (size n+1)

        // Mark numbers present in the array
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];  // Accessing each element using the index i
            if (num <= n) {  // Make sure the number is within the valid range
                present[num] = true;
            }
        }

        // Check for missing numbers
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.println(i);  // Print missing number
            }
        }
    }
}
