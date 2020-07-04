/*Given an array of integers, return whether or not two numbers sum to a given target, k.
Note: you may not sum a number with itself.

Ex: Given the following...

[1, 3, 8, 2], k = 10, return true (8 + 2)
[3, 9, 13, 7], k = 8, return false
[4, 2, 6, 5, 2], k = 4, return true (2 + 2)
*/

package com.twosum;

import java.util.HashSet;

public class TwoSumApp {

	static boolean check(int[] arr, int k)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i =0 ;i<arr.length;i++)
		{
			int temp = k-arr[i];
			if(hs.contains(temp))
				return true;
			hs.add(arr[i]);
		}
		return false;
	}
	
	public static void main(String[] args) {
	
		int arr[]= {4, 2, 6, 5, 2};
		int k = 3;
		
		if(check(arr, k))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
