package com.Strings.programs;


public class CalculateFrequency {
	
	//Appraoch 1
	public static void calculateFreq(String S) {
		//make a freq array to keep the frequency of each char
		//convert string to char arraay
		//calculate if we find repeating char we will incremnt the freqcount by 1 and set the char value to '0'
		//loop over freq array and check if you dont find ''&& '0'the return char and its freq
		
		int freq[] = new int[S.length()]; //{}
		char[] ch = S.toCharArray(); //{y ,y}
		for(int i=0;i<ch.length;i++) {
			freq[i]=1;    //{1}
			for(int j = 0;j<ch.length;j++){
				if(ch[i]==ch[j]&&i!=j) {
					freq[i]++;//{2}
					ch[j]='0';//{y,0}
				}
			}
		}
		for(int i=0;i<ch.length;i++) {
System.out.println(ch[i]);
		}
System.out.println("frequency");		
		for(int i=0;i<freq.length;i++) {
			if(ch[i]!=' '&& ch[i]!='0') {
		System.out.println(ch[i]+":"+freq[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateFrequency.calculateFreq("hello");
	}

}
