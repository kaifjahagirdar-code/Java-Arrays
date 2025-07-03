package com.cc._18_hospitalTemperature;

public class HospitalTemperatureLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {98, 101, 102, 99, 97};
	    getFeverPatients(arr);

	}

	private static void getFeverPatients(int[] arr) {
		// TODO Auto-generated method stub
		int patients=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>100)
			{
				patients++;
			}
		}
		System.out.println("High fever Patients= "+patients);
	}

}
