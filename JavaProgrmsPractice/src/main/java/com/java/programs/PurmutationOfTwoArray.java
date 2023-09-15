package com.java.programs;

import java.util.Arrays;

public class PurmutationOfTwoArray {

	
	public boolean sameArray(int arr1[],int arr2[]) {
		boolean pur = false; //O(1)
		int sum1=0; //O(1)
		int sum2 =0;  //O(1)
		if(arr1.length!=arr2.length) { //O(1)
			pur= false;  //O(1)
		}else {
			for(int i=0;i<arr1.length;i++)  //O(n)
			{
				sum1+= arr1[i];  //O(1)
				sum2+= arr2[i];  //O(1)
			}
			if(sum1==sum2) {  //O(1)
				pur = true;  //O(1)
			}
		}
		
		return pur;  //O(1)
	}  //O(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrA[] = new int[] {5, 4, 6,1,9,2};
		int arrB[] = new int[] {5, 4, 6,1,9,2};
		System.out.println("orignal array :" + Arrays.toString(arrA));
		
		System.out.println("orignal array :" + Arrays.toString(arrB));
		PurmutationOfTwoArray purArray = new PurmutationOfTwoArray();
		
		boolean cheackArraySame = purArray.sameArray(arrA, arrB);
		
		System.out.println("is Array Same:" + cheackArraySame);

	}

}
