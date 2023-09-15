package com.Strings.programs;

import java.util.Arrays;

public class IsAnagram {

	 public static boolean isAnagram(String a,String b)
	    {
	        
	        // Your code here
	        //1. size same
	        //2.all char should be same
	        char[] A = a.toCharArray();
	        char[] B = b.toCharArray();
	        if(a.length()!=b.length()){
	            return false;
	        }
	        
	            Arrays.sort(A);
	            Arrays.sort(B);
	         if(Arrays.equals(A,B)){
	        	System.out.println("yes"); 
	         }else {
	        	 System.out.println("No");
	         }
	         return Arrays.equals(A,B);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "asdas";
		String st2 = "asdas";
	    IsAnagram.isAnagram(st1,st2);			
	}

}
