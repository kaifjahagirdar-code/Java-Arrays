package com.cc._12_temperaturelogger;

public class TemperatureLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {32,35,31,30,29,40,38};
		
		maxMinTemp(arr);
	}

	private static void maxMinTemp(int[] arr) {
		// TODO Auto-generated method stub
		int max= arr[0];
		int min= arr[0];
		
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
            if(arr[i]<min) {
            	min=arr[i];
			}
		}
		 System.out.println("Maximum Temp= "+max);
         System.out.println("Minimum Temp= "+min);
		}
	}


