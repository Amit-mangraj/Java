package com.java.programs;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr1[] = new int[]{1,2,3,4,5};
		    int arr2[] = new int []{6,7,8,9};
		    //op=1,2,3,4,5,6,7,8,9
			int n1=arr1.length;
			int n2 =arr2.length;
			
			int arr3[] = new int[n1+n2];
			int i=0;
			int j=0;
			int k=0;
			
			while(i<n1&&j<n2){
			    if(arr1[i]<arr2[j]){
			        arr3[k]=arr1[i];
			        i++;
			    }else{
			        arr3[k]= arr2[j];
			        j++;
			    }
			    k++;
			}
			
			while(j<n2){
			    arr3[k]=arr2[j];
			    j++;
			    k++;
			}
			for(int m=0;m<arr3.length;m++){
			    	System.out.print(arr3[m]);
			}
		
		}

}
