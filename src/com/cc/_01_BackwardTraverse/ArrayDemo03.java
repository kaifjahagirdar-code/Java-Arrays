package com.cc._01_BackwardTraverse;

import java.util.Scanner;

public class ArrayDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner keyboard =new Scanner(System.in);
				
				//Array Declaration & Creation
			     System.out.println("Enter the size of the Array= ");
			     int[] arr= new int[keyboard.nextInt()];
			     
			     //Array Traversing
				 System.out.println("===========>Before Initialization <============");
				 arrGet(arr);
				 
		         //Array Initilization
			     
			     for(int i =(arr.length-1); i>=0; i--)
			     {
			    	 
			     System.out.print("Enter the element "+(i+1)+" : ");
			     arr[i]= keyboard.nextInt();
			     
			     
				}
			     System.out.println("===========>After Initialization <============");
				 arrGet(arr);
			     
			     

			    }
			
			     private static void arrGet(int[] arr) {
				// TODO Auto-generated method stub
				 for(int i=(arr.length-1); i>=0; i--)
				 {
					System.out.println("arr["+i+"] =" +arr[i]);
				 }
				
			}

		}



