package com.datastructure.problems;

import java.util.Scanner;

public class Average_temprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Number of Days Temperature");
      int numberOfDays = sc.nextInt();
      int sum =0;
      int temp[] = new int[numberOfDays];
      for(int i=0;i<numberOfDays;i++) {
    	  System.out.println("Day" + (i+1) + "Temperature");
    	  temp[i] = sc.nextInt();
    	  sum+= temp[i];
      }
      int above=0;
      double avg = sum/numberOfDays;
      for(int i=0;i<temp.length;i++) {
    	  if(temp[i]>avg) {
    		  above++;
    	  }
      }
      System.out.println("Avg" + avg);
      System.out.println("Temperatures above avg temp" + " " + above);
	}

}
