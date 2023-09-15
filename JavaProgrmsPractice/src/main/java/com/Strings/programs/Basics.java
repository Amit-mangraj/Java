package com.Strings.programs;

import java.util.Scanner;

public class Basics {
	
	//String is object with sequeece of of Characters
	//A
	public static void main(String[] args) {
		String s = "try hard";//String literal i.e " "
		System.out.println("Previous String value is :"+ s);
		
		//string will now refer to now string value while thw previos value will be store in garbage collector of heap memeory
		s =  new String("amit");
		System.out.println("Current String value is :"+ s);
		
		//string in java are immutable objects privious value of string remains unchanged and variable string now refer to new string
		s =s+ new String("Kumar");
		System.out.println("Previos and Current String value is after concatanation :"+ s);
		//take stirng input from user
		Scanner sc = new Scanner(System.in);
		// String  str = sc.nextLine();
		 System.out.println("String input from user :" + sc.nextLine());
		 
		 //Create String Object with String builder
		 StringBuilder stbu=new StringBuilder();
		 System.out.println(stbu.capacity());
		 stbu.append("I can do");
		System.out.println("String object using string Builder :"+s +stbu);
		
		stbu = new StringBuilder("Mangaraj");
	     System.out.println(stbu);
	     System.out.println("String object using string Builder :"+s +stbu);
	     
	     String s1 = new String("amit");
	     String s2 = new String("amit");
	     System.out.println(s1==s2);
	}

}
