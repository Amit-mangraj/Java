package com.Strings.programs;

import java.util.Arrays;

public class StringPrifix {
 public static void longestCommonPrifix(String[] a) {
	Arrays.sort(a); 
	System.out.println(Arrays.toString(a));
	
	int minlength = Math.min(a[0].length(), a[a.length-1].length());
	System.out.println(minlength);
	int i=0;
	StringBuilder stub = new StringBuilder();
	while(i<minlength&&a[0].charAt(i)==a[a.length-1].charAt(i)) {
			i++;
	}
	stub.append(a[0].substring(0,i));
	if(stub.isEmpty()) {
		System.out.println("-1");
	}else {
	System.out.println(stub.toString());
	}
	
			
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"amit","ak","amt","amitkumar","amitkumarmangaraj"};
		StringPrifix.longestCommonPrifix(arr);
	}

}