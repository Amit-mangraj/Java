package com.Strings.programs;

public class CalculateVowlesAndConst {

	//vowels -> a e i o 
    //constans -> rest are constansts
    public static boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)>-1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "I love My country";
		   str= str.replaceAll("\\s","");
		   //char[] ch = str.toCharArray();
		   int vow =0;
		   int con = 0;
		   for(int i=0;i<str.length();i++){
		       if(isVowel(str.charAt(i))){
		           vow++;
		       }else{
		          con++; 
		       }
		   }
			System.out.println(vow+ " "+ con);
		}

}
