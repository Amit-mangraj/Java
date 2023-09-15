package com.data_Structures.Arrays;

import java.util.Arrays;

public class TwoDimenstionalArray {
	// declare
	int arr[][] = null;

	// constructor
	public TwoDimenstionalArray(int numberOfRows, int numberOfColumns) {
		arr = new int[numberOfRows][numberOfColumns];
		for (int r = 0; r <arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				arr[r][c] = Integer.MIN_VALUE;
			}
		}
	}

	
	//Inserting Value at a given location in 2D Array
	public void insertValue(int row, int col, int value) {
		try {
			if(arr[row][col]==Integer.MIN_VALUE) { //O(1)
				arr[row][col] = value;   //O(1)
				System.out.println("Value Succesfully Inserted");//O(1)
				System.out.println(Arrays.deepToString(arr));  //O(1)
			}else {
			System.out.println("cell is Occupied");	//O(1)
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("indec trying to access is not available");//O(1)
		}
	}//TC=O(1) SC= O(1)
	
	
	//access cell
	public void accesscell(int row,int col) {
		try {
			System.out.println("\naccessing row " + row + " col " + col);	//O(1)
			System.out.println("cell value is " + arr[row][col]);   //O(1)
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index ");  //O(1)
		}
		
	} //TC=O(1) & SC= O(1)
	
	
	//Searching value
   public void searchValue(int value) {
	   try {
		   for (int r=0;r<arr.length;r++)    //O(m)
		   {
		 	  for(int c=0;c<arr[0].length;c++)    //O(n)
		 	  {
		 		  if(arr[r][c]==value)            //O(1)
		 		  {
		 			  System.out.println("value is found row " + r + " col " + c);    //O(1)
		 			  return;                                                       //O(1)
		 		  }
		 	  }
		 	  
		   }
		   System.out.println("value Does not exist");    //O(1)
	   } catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println("Invalid Index");    //O(1)
	   }    // TC = O(mn)  SC= O(1)
  
   }
   
   //deleting an value from array
   public void deleteValue(int row, int col) {
	try {
		arr[row][col]= Integer.MIN_VALUE;   //O(1)
		System.out.println("Value Deleted Succesfully");  // O(1)
		System.out.println(Arrays.deepToString(arr));   // O(1)
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("this index is not valid in array"); // O(1)
	}   
  }  //TC= O(1)  & SC =O(1)   
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoDimenstionalArray twoDArray = new TwoDimenstionalArray(4,4);
		twoDArray.insertValue(0,0,32);
		System.out.println(Arrays.deepToString(twoDArray.arr));
		
	//	twoDArray.accesscell(0, 0);
		
		twoDArray.searchValue(89);
		twoDArray.deleteValue(0, 0);
	    
	}

}
