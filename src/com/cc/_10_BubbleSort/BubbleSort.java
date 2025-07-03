package com.cc._10_BubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {16,14,5,6,8};
         arr= bubbleSorting(arr);
         
         System.out.print("[ ");
         
         
         for(int i=0; i<arr.length;i++)
 		{
 			System.out.print(arr[i]+" ");
 		}
         System.out.print("]");
	}

	private static int[] bubbleSorting(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int count=0;
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
			if(count==0)
			break;
		}
		return arr;
		// TODO Auto-generated method stub
		
	}

}
