package com.java.programs;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondSmallest {
	public static void findSecondSmallest(int[] arr) {
		int secondesamll =Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow();
		System.out.println("Second smallest element: "+ secondesamll);
	}
	
	public static void findCommon(int arr1[], int arr2[]) {
		List<Integer>list = Arrays.stream(arr1).filter(number -> Arrays.stream(arr2).anyMatch(number2-> number2 == number)).boxed().collect(Collectors.toList());
	System.out.println("Common element in the array are: "+ list);
	}
	
	public static void reverseArray(int[] arr) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = new int[] {1,1,3,2,4,5}; //2
      findSecondSmallest(arr);
      
      int arr1[] = new int[] {1,1,3,2,4,5};
      int arr2[] = new int[] {4,5,6,7,8};
      //find common element ->[4,5]
      
      findCommon(arr1, arr2);
      
      reverseArray(arr);
	}

}
