package com.java.programs;

import java.util.Arrays;

public class DeleteFromArray {
	int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[4];
		try {
			DeleteFromArray deleteele = new DeleteFromArray();
			for (int i = 0; i < arr.length; i++) {
				deleteele.insert(arr, i + 1);
			}
			System.out.println(Arrays.toString(arr));

			System.out.println();

			System.out.println(Arrays.toString(deleteFromEnd(arr)));

			System.out.println();

			System.out.println(Arrays.toString(deleteFromStart(arr)));
			
			System.out.println();

			System.out.println(Arrays.toString(deleteFromPosition(arr,2)));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array indexOutOfBound Exception Found");
		}
	}

	public void insert(int a[], int val) {
		a[count++] = val;
	}

	public static int[] deleteFromStart(int arr[]) {

		int newArray[] = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			newArray[i-1] = arr[i];
		}
		return newArray;
	}

	public static int[] deleteFromEnd(int arr[]) {
		int newArray[] = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			newArray[i] = arr[i];
		}
		return newArray;
	}
	
	public static int[] deleteFromPosition(int arr[],int position) {
		int newArray[] = new int[arr.length - 1];
		for (int i = 0; i <position; i++) {
			newArray[i] = arr[i];
		}
		
		for (int i =position+1 ; i <arr.length; i++) {
			newArray[i-1] = arr[i];
		}
		return newArray;
	}
}
