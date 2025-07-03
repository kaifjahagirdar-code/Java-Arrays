package com.cc._15_powerconsumptionlogger;

public class PowerConsumptionLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 20, 30, 40};
		powerConsumed(arr);

	}

	private static void powerConsumed(int[] arr) {
		// TODO Auto-generated method stub
		int total=0;
		double avr=0;
		for(int i=0;i<arr.length;i++)
		{
			total += arr[i];
			avr= total/4;
			}
		System.out.println("Total= "+total);
		System.out.println("Average= "+avr);
		
	}

}
