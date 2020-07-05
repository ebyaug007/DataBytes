/*Given a string representing your stones and another string representing a list of jewels, return the number of stones that you have that are also jewels.

Ex: Given the following jewels and stones...

jewels = "abc", stones = "ac", return 2
jewels = "AaaddfFf", stones = "Af", return 3
jewels = "AYOPD", stones = "ayopd", return 0*/
package com.app;

import java.awt.print.Printable;

public class JewelStoneApp {
	static int countStone(String jewels, String stones)
	{
		int[] countarr= new int[58];
		int count = 0;
		for(int i = 0 ;i<jewels.length(); i++)
			countarr[  jewels.charAt(i) - 'A']++;
		for(int i=0;i<stones.length();i++)
			count += countarr[stones.charAt(i)-'A'];
		return count;
	}
	
	public static void main(String[] args) {
		String jewels = "abdc";
		String stones = "ayopd";
		System.out.println(countStone(jewels, stones));
	}

}
