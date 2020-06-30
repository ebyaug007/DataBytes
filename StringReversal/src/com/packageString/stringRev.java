/*Given a string, reverse all of its characters and return the resulting string.

Ex: Given the following strings...

“Cat”, return “taC”
“The Daily Byte”, return "etyB yliaD ehT”
“civic”, return “civic”*/
package com.packageString;

public class stringRev {

	public static void main(String[] args) {
	
		String str = "Abcdda";
		System.out.println(reversedStr(str));
	}
	public static String reversedStr(String str)
	{
		char[] c = str.toCharArray();
		int ln = str.length();
		StringBuilder strrv = new StringBuilder();
		for(int i = ln-1; i>=0; i--)
		{
			
			strrv.append(c[i]);
		}
		return strrv.toString();
	}
	
	
}