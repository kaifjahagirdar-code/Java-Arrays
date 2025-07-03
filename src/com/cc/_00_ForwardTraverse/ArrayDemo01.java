package com.cc._00_ForwardTraverse;

public class ArrayDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Array Decleration
		int[] arr;
				
	     //Array creation
		arr= new int[5];
		
		// Array Traversing
		System.out.println("=====>Before Initialization<=====");
		System.out.println("arr[0]="+ arr[0]);
		System.out.println("arr[1]="+ arr[0]);
		System.out.println("arr[2]="+ arr[0]);
		System.out.println("arr[3]="+ arr[0]);
		System.out.println("arr[4]="+ arr[0]);
		
		//Array Initialization
		arr[0]= 10;
		arr[1]= 20;
		arr[2]= 30;
		arr[3]= 40;
		arr[4]= 50;
		System.out.println("=====>After Initialization<=====");
		System.out.println("arr[0]="+ arr[0]);
		System.out.println("arr[1]="+ arr[1]);
		System.out.println("arr[2]="+ arr[2]);
		System.out.println("arr[3]="+ arr[3]);
		System.out.println("arr[4]="+ arr[4]);
		
		
	}

}
