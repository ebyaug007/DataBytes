/*Given t
 * wo strings s and t return whether or not s is an anagram of t.
Note: An anagram is a word formed by reordering the letters of another word.

Ex: Given the following strings...

s = "cat", t = "tac", return true
s = "listen", t = "silent", return true
s = "program", t = "function", return false*/

package com.main;

import java.util.Arrays;

public class AnagramApp {

	static boolean checkanagram(String s, String t)
	{
		int sarr[] = new int[26];
		int tarr[] = new int[26];
		for(int i=0;i< s.length(); i++)
			sarr[s.charAt(i) - 'a']++;
		
		for(int i=0;i< t.length(); i++)
			tarr[t.charAt(i) - 'a']++;
		if(Arrays.equals(sarr, tarr ))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		String s="listen", t= "silent";
		if(checkanagram(s, t))
		{
			System.out.println("Is Anagram");
		}
		else
			System.out.println("Not Anagram");
	}
}
