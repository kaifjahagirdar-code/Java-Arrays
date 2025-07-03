package com.cc._02_Product;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner keyboard = new Scanner(System.in);
				System.out.println("Enter the size of the Array= ");
				int size= keyboard.nextInt();
				
				int[] arr= new int[size];
				System.out.println("Enter the "+ size+ " elements of the Array= ");
				for (int i = 0; i < size; i++) {
		            arr[i] = keyboard.nextInt();
		        }


				System.out.println(getProd(arr));
				keyboard.close();
				
			}

			private static int getProd(int[] arr) {
				// TODO Auto-generated method stub
				int product=1;
				for(int i=0; i<arr.length; i++)
				{
					product *= arr[i];
				}
				return product;
			}

		}




