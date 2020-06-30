/*
 * Given a string, return whether or not it uses capitalization correctly. A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, or only the first letter is capitalized.

Ex: Given the following strings...

"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true
 * 
 * */
package com.CorrectCapital;

public class correctcapitalizationApp {
	public static void main(String[] args) {
			
		String str = "coding";
		System.out.println(iscorrect(str) ? "Correct" : "Incorrect");		
	}
	public static boolean iscorrect(String str)
	{
		int total = 0;
		int len = str.length();
		for(int i =0 ;i<len;i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=91 )
				total = total + i + 1;
		}
		int sum = ((len)*(len+1))/2;
		//System.out.println(total +" "+ sum);
		if(total==1 || total ==0 || total == sum)
			return true;
		return false;
	}

}
