/*Given a string, return the index of its first unique character. If a unique character does not exist, return -1.

Ex: Given the following strings...

"abcabd", return 2
"thedailybyte", return 1
"developer", return 0*/

package com.firstuniquechar;

public class FirstUniqueMain {
	static int[] countchar(String str)
	{
		int[] arr = new int[26];
		for(int i=0;i<str.length();i++)
			arr[str.charAt(i)-'a']++;
		
		return arr;
	}
	static int returnunique(int[] arr,String str)
	{
		for(int i=0;i<str.length();i++)
			if(arr[str.charAt(i)-'a'] == 1)
				return i;
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbcc";
		int[] arr = countchar(str);
		System.out.println(returnunique(arr, str));
		
	}

}
