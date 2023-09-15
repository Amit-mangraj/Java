package com.java.programs;

import java.util.Scanner;

public class MissingNumber {

	// This line defines the findMissingNumberInArray function,
	// which takes an integer array as input and returns an integer representing the
	// missing number.
	public int findmissingNumber(int[] arr) {
		int n = arr.length + 1; // O(1) //This line calculates the value of n, which is the length of the input
								// array plus 1, and stores it in the variable n

		// the sum of the first n natural numbers
		int actualSum = (n * (n + 1)) / 2; // O(1)
		int expectedsum = 0; // O(1)

		// for-each loop that iterates through each element in the input array
		for (int number : arr) // O(n)
		{
			expectedsum += number; // O(1) //This line adds the current number to the actualSum variable,
									// incrementally calculating the sum of the elements in the input array.
		}
		return actualSum - expectedsum; // O(1)

	} // total Time Complexity =O(n) and SC = O(1)

	// display missing number
	public void displayMissnigNumber(int[] array) {
		MissingNumber missnumber = new MissingNumber();
		int number = missnumber.findmissingNumber(array);
		System.out.println("Missing Number is :" + number);

	}

	// main method
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Size of Array:");
			int size = sc.nextInt();
			// TODO Auto-generated method stub
			OneDimentionalArray oneDArray = new OneDimentionalArray(size);

			for (int i = 0; i < oneDArray.arr.length; i++) {
				oneDArray.arr[i] = sc.nextInt();
			}

			MissingNumber missnumber = new MissingNumber();

			missnumber.displayMissnigNumber(oneDArray.arr);
		}
	}

}
