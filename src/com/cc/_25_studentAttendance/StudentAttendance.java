package com.cc._25_studentAttendance;

public class StudentAttendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {101,102,103,104};
		int[] arr2= {104,105,106,107};
		commonStudents(arr1,arr2);
		

	}

	private static void commonStudents(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		boolean commonfound=false;
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
					commonfound=true;
				}
			}
		}
		if(!commonfound)
		{
		System.out.println("No Common Students");
	}

}
}