package com.java.programs;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twosum(int arr[],int target) {
		int [] result = new int[2];
		/*
		 * for(int i=0;i<arr.length;i++) { for(int j=i+1;j<arr.length;j++) {
		 * if(arr[i]+arr[j]==target) { result[0]=i; result[1]=j; } } } return result;
		 */
		Map<Integer,Integer>map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(target-arr[i])) {
				result[1]=i;
				result[0]=map.get(target-arr[i]);
				
			}
			map.put(arr[i], 1);
		}
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int array[] = new int[] {2,7,8,5,1};
     int target = 8;
     TwoSum ts = new TwoSum();
    int targetarr[] = ts.twosum(array, target);
     for(int i=0;i<2;i++) {
    	 System.out.println(targetarr[i]);
     }
	}

}
