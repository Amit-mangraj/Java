package com.Strings.programs;

import java.util.Arrays;

public class ResverseString {
	public String reverseString(String S) {
		//amit -->tima
		
		char[] ch = S.toCharArray();
		StringBuilder st = new StringBuilder();
		for(int i=ch.length-1;i>=0;i--) {
		    st.append(ch[i]);
		}
		System.out.println(st.toString());
		return st.toString();
    		
	}
	
	public String reverseword(String S) {
	//	abc.efg.hij -->hij.efg.abc
		  String[]  ch =  S.split("\\.",-1);
		  System.out.println("Array of words:"+ Arrays.toString(ch));
		  StringBuilder reversedWords = new StringBuilder();
			 for(int i=ch.length-1;i>=0;i--) {
				 reversedWords.append(ch[i]);
				 if(i>0) {
				 reversedWords.append(".");
				 }
			 }
			
			 System.out.println("String after reverse: "+ reversedWords);
		// System.out.println(reversedWords);
		  return reversedWords.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc.efg.hij"; //hij.efg.abc
		String str2 = "amit";
		System.out.println("String before reversing: "+ str);
		ResverseString rs = new ResverseString();
		rs.reverseword(str);
		System.out.println("String before reverse: "+ str2);
		rs.reverseString(str2);
	}

}
