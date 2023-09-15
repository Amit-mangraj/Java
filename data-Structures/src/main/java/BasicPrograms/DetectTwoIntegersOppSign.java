package BasicPrograms;

import java.util.Scanner;

public class DetectTwoIntegersOppSign {
	
	/*
	 * bool oppositeSigns(int x, int y) { return ((x^y)<0); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //return true if the signs are differnt 
		// false if signs are same
		// signed bit   k-1 is the magnitude for negative integer it is 1 and 0 for  positive
		//      |
		// +5 = 0 0 1 0 1

		// -5 = 1 0 1 0 1
		
		// XOR --> for opposite sign i.e 1 and 0 the output is 1 that is negative or true means -ve signed bit 
		//for same signs  i.e 0 and 0 or 1 and 1 the output will be 0 that is  positve or false means +ve signed bit 
		
		 Scanner sc = new Scanner(System.in);
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if (((x^y)<0)==true) {
		    	System.out.println("True");
		    }
		    else
		    {
		    	System.out.println("false");
		    }
		    
	}

}
