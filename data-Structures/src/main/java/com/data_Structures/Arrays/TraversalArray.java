package com.data_Structures.Arrays;
import java.util.Arrays; 

public class TraversalArray {

    public void traverseArray() {
    	try {
    		Insertion_in_array createArray = new Insertion_in_array(10);
    	    int newArray[] =	new int[createArray.arr.length];
    	   for(int i=0;i<newArray.length;i++)
    	   {
    		   newArray[i]=createArray.arr[i];
    	   }
    	   System.out.println(Arrays.toString(newArray));
    	}catch (Exception e){
    		System.out.println("Array no longer Exist");
    		
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraversalArray tarray = new TraversalArray();
				tarray.traverseArray();
	}

}
