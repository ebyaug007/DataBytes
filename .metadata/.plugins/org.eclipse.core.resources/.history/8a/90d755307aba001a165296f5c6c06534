package com.palindrome;

public class panlindromeapp {

	public static void main(String[] args) {
		String strcheck = "m a 343 la y a l am";
		System.out.println(palincheck(strcheck));
		if(palincheck(strcheck) )
			System.out.println("is palindrome");
		else
			System.out.println("Not palindrome");
		
	}
	
	public static boolean palincheck(String str)
	{
		String st = extractStr(str);
		int len =st.length();
		char[] c = st.toCharArray();
		for(int i=0,j=len-1;i<=len/2;i++,j--)
		{
			if(c[i]!=c[j])
				return false;
		}
		return true;
	}
	
	public static String extractStr(String str)
	{
		int len = str.length();
		char[] c = str.toLowerCase().toCharArray();
		StringBuilder st1 = new StringBuilder();
		for(int i=0;i<len;i++)
		{
			if((c[i] >= 97 && c[i] <= 122))
				st1 = st1.append(c[i]);
		}
		return st1.toString();
	}
}
