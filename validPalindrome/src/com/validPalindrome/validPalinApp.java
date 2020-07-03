/* Given a string and the ability to delete at most one character, return whether or not it can form a palindrome.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.

Ex: Given the following strings...

"abcba", return true
"foobof", return true (remove the first 'o', the second 'o', or 'b')
"abccab", return false*/

package com.validPalindrome;

public class validPalinApp {
	
	public static boolean isPalin(String str)
	{
		int len = str.length();		
		for(int i=0;i<len;i++)
		{
			int check =0;
			String strtemp = createNewString(str, i);
			int templen = strtemp.length()-1;
			for(int k =0;k<=strtemp.length()/2;k++)
			{
			
				if(strtemp.charAt(k)!=strtemp.charAt(templen--))
				{	check =1;
					break;
				}
			}
			
			if(check==0)
				return true;
		}
		return false;
	}
	

	
	public static String createNewString(String str , int remove)
	{
		return str.substring(0, remove)+str.substring(remove+1, str.length());
	}
	
	public static boolean maincheck(String str)
	{

		return isPalin(str);
	}
	
	public static void main(String[] args) {
		String str = "malayaalam";
		if(maincheck(str))
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome");
		
		
	}

}
