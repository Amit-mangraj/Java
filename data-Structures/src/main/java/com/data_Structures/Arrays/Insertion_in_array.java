package com.data_Structures.Arrays;

import java.util.Arrays;

public class Insertion_in_array {
	
	 int arr[] =null;  //declaration
	
	//create array with Integer.MIN value
    public Insertion_in_array(int sizeofArray) {   //constructor
    arr = new int[sizeofArray];    	// instantize array i.e to give memory to array
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]= Integer.MIN_VALUE;
    }
    }
    
    //Insert at any given location
    public void insertatLoction(int location ,int x) {
    	try {
    		if(arr[location]==Integer.MIN_VALUE) { //O(1)
        		
        		arr[location] = x; //O(1)
        		System.out.println("Successfully Inserted");//O(1)
        		System.out.println( Arrays.toString(arr)); //O(1)
        	}
        	else
        	{
        		System.out.println("Location is already occupied");//O(1)
        	}
    	}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
    		System.out.println("Invalid index to access array");//O(1)
		} {
    		
    	}
    	                                                 //timeComplexity = O(1)
    	
    }
    
    
    //Array traversal
    public void traverseArray() {
    	try {
    		for(int i=0;i<arr.length;i++)
        	{
        		System.out.println(arr[i] +" ");
        	}
    	} catch(Exception e) {
    		
    		System.out.println("Array no longer Exist");
    	}
    	
    }
    
    
    //search for an element in array ---->linear search
    public void searchInArray(int valueToSearch) {
    	for(int i=0;i<arr.length;i++)       //O(n)
    	{
    		if(arr[i]==valueToSearch) {     //O(i)
    			System.out.println("value is found at the index " + i);  //O(1)
    			return;                                                 //O(1)
    		}
    	}
    	System.out.println(valueToSearch + " is not found");          //O()1
    }                                                  //Time Complexity = O(n)
     //extra memory is not required to perform this operation //Space Complexity =O(1)    
    
    
    //Delete value from Array
    public void deleteValue(int valueToDelete)
    {
    	try {
    		arr[valueToDelete] = Integer.MIN_VALUE;     //--->O(1)
    		System.out.println("The value Succesfully Deleted" + arr[valueToDelete]); //--->O(1)
    	} catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("the value is present in array"); // ---->O(1)
    	} //time complexity =O(1)
    } //space Complexity = O(1)
    
    
   //main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertion_in_array creatArray = new Insertion_in_array(10);
		creatArray.insertatLoction(2, 43);
		creatArray.insertatLoction(2, 54);
		creatArray.insertatLoction(12,24);
		
		var first = creatArray.arr[0]; //----->O(1) array traversal take O(1) time complexity
		System.out.println(first);
		//space compelecity ---> O(1) since no extra space is used here 
		
		
		//search
		creatArray.searchInArray(43);
		creatArray.searchInArray(40);
		
		creatArray.deleteValue(2);
	//	System.out.println(Arrays.toString(arr));
	}

}
