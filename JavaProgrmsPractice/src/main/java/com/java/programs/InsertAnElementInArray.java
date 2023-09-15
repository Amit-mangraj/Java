package com.java.programs;

import java.util.Arrays;

public class InsertAnElementInArray {
	int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[4];
		try {
			InsertAnElementInArray insertele = new  InsertAnElementInArray();
			for(int i=0;i<arr.length;i++) {
				insertele.insert(arr, i+1);
			}
			System.out.println("original Array"+" "+Arrays.toString(arr));
			
			System.out.println();
			System.out.println("Insert at the Start");
			System.out.println(Arrays.toString(insertAtStart(arr, 28)));
			
			System.out.println();
			System.out.println("Insert at the end");
			
			System.out.println(Arrays.toString(insertAtEnd(arr, 8)));
			System.out.println();
			System.out.println("Insert at the position");

			System.out.println(Arrays.toString(insertAtPosition(arr, 2,17)));
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		}
		
	}
	
	public void insert(int a[], int val) {
		a[count++]=val;
	}
	
	public static int[] insertAtStart(int arr[],int value) {
		int newarray[] = new int[arr.length+1];
		newarray[0] = value;
		for(int i=0;i<arr.length;i++) {
			newarray[i+1]=arr[i];
		}
		return newarray;
	}

	
	public static int[] insertAtEnd(int arr[],int value) {
		int newarray[] = new int[arr.length+1];
		
		for(int i=0;i<arr.length;i++) {
			newarray[i]=arr[i];
		}
		newarray[newarray.length-1] = value;
		return newarray;
	}
	
	public static int[] insertAtPosition(int arr[],int postion,int value) {
		int newarray[] = new int[arr.length+1];
		
		for(int i=0;i<postion;i++) {
			newarray[i]=arr[i];
		}
		for(int i=postion;i<arr.length;i++) {
			newarray[i+1]=arr[i];
		}
		newarray[postion] = value;
		return newarray;
	}
}
