package com.java.collection.programs;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Integer> list = new ArrayList<Integer>();
System.err.println(list.size());

  
 
int n =5;
for(int i=0;i<=n;i++)
{
	list.add(i);
	}
list.add(2); list.add(4);
System.err.println(list);
	}

}
