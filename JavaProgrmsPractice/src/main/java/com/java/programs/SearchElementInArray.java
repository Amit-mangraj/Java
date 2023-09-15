package com.java.programs;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 3, 5, 8, 9, 13 };

		int index = search(arr, 3);
		System.out.println("Brute force o(n) solution to search element");
		if (index == -1) {
			System.out.println("Not found");
		} else {
			System.out.println(index);
		}

		System.out.println("Binary search o(logn) solution to search element");
		try {
			int index2 = binarySearch(arr, 8, 0, arr.length - 1);
			if (index2 == -1) {
				System.out.println("Not found");
			} else {
				System.out.println(index2);
			}
		} catch (Exception e) {
			System.out.println("Element Not present");
		}

	}

	// Brute Force O(n) approach
	public static int search(int a[], int value) {
		if (a.length == 1) {
			return 0;
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == value) {
					return i;
				}
			}
			return -1;
		} // O(n) time complexity
	}

	public static int binarySearch(int a[], int value, int start, int end) {
		int mid = (start + end) / 2;
		if (a.length == 0||start>end) {
			return -1;
		}
		if (value == a[mid]) {
			return mid;
		}

		if (value > a[mid]) {
			return binarySearch(a, value, mid + 1, end);
		} else {
			return binarySearch(a, value, 0, mid - 1);
		}
	}

}
