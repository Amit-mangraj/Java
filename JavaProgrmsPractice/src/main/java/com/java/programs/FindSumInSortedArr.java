package com.java.programs;

import java.util.Scanner;
//Given a sorted array A (sorted in ascending order), having N integers,
//find if there exists any pair of elements (A[i], A[j]) such that their sum is equal to X.

//1 2 3 4 5  x = 6
//Approach ->nested loop o(n2)
//Approach ->Tow Pointer
//Appraoch ->hashmap
class GetIndex{
	//method to find index whose sum equal to target
	public void findIndexSumEqaulToTarget(int arr[], int target) {
		int firstIndex = 0;
		int lastIndex = arr.length-1;
		
		while(firstIndex<lastIndex) {
			if(arr[firstIndex]+arr[lastIndex]==target) {
				System.out.println("Indexes are: "+ firstIndex + "," +lastIndex);
			}
			if(arr[firstIndex]+arr[lastIndex]>target) {
				lastIndex--;
			}
			else {
				firstIndex++;
			}
		}
			
		}
//O(N) each pointer traversal occurs only once
// if array is not sort then use Arrays.sort() in this case time complexity will be O(nlogn)	
}
public class FindSumInSortedArr {
	//main driver method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc  = new Scanner(System.in);
		
		System.out.print("Take 5 inputs: ");
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Sc.nextInt();
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	     System.out.print("give target: ");
	     int Target= Sc.nextInt();
		GetIndex getIndex = new GetIndex();
		getIndex.findIndexSumEqaulToTarget(arr,Target);
		
      Sc.close();
	}

}
