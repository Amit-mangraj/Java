package com.java.programs;

import java.util.Arrays;

public class SellAndBuyStocks {

	public void maxprofit(int arr[]) {
		//int minprice = Integer.MAX_VALUE; //o(1)
		int maxProfit = 0;
		/*
		 * for(int price:arr) { if(price<minprice) { minprice = price; }else
		 * if((price-minprice)>maxProfit) { maxProfit = price-minprice; }
		 * 
		 * }
		 */
		// 3 1 5 7 8 2
		//3 3 5 7 8 8 
		 //0 2 0 0 0 6  = max = 6
		int auxarray[] = new int[arr.length];
		int maxelement = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxelement) {
				maxelement =arr[i];
			}
			auxarray[i] = maxelement;
			}
		System.out.println("array: " + Arrays.toString(auxarray));
		
		for(int j=0;j<auxarray.length;j++)
		{
         auxarray[j]= auxarray[j]-arr[j];
         
		}
		System.out.println("array: " + Arrays.toString(auxarray));
		for(int k =0;k<auxarray.length;k++)
		{
			 if(auxarray[k]>maxProfit)
	         {
				 maxProfit = auxarray[k];
	         }
		}
		
		System.out.println("max profit :" + maxProfit);
		
	
	}
	
	/*
	 * public void display(int arr[]) { SellAndBuyStocks showProfit = new
	 * SellAndBuyStocks(); int profit =showProfit.maxprofit(arr);
	 * 
	 * System.out.println("Maximum Profit: " + profit);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {5, 4, 6,1,9,2};
		System.out.println("orignal array :" + Arrays.toString(arr));
		SellAndBuyStocks showProfit = new SellAndBuyStocks();
		showProfit.maxprofit(arr);
	}

}
