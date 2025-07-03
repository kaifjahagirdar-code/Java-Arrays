package com.cc._19_watertankfillingsystem;

public class WaterTankFillingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0, 10, 20, 0, 15, 5, 0};
		displayEmptyTanks(arr);

	}

	private static void displayEmptyTanks(int[] arr) {
		// TODO Auto-generated method stub
		boolean foundEmpty= false;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]==0)
			{
			
				System.out.print(" "+ i);
				foundEmpty=true;
			}
			
		}
		if(!foundEmpty)
		{
			System.out.println("No Empty Tank");
		}
	
		
		}
	
	}




