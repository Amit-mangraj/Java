package com.java.programs;

public class OneDimentionalArray {
 int arr[] = null;

public OneDimentionalArray(int sizeOfArray) {
	arr = new int[sizeOfArray];
	for(int i =0 ;i<arr.length;i++)
	{
		arr[i]= Integer.MIN_VALUE;
	}
}
}
