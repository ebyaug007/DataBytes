/*
 * Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to its original position. The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.

Ex: Given the following strings...

"LR", return true
"URURD", return false
"RUULLDRD", return true
 * 
 * */
package com.vacuumcleaner;

public class vacuumcleanerapp {
	public static void main(String[] args) {
		String path = "LLU";
		if(returnInitial(path))
			System.out.println("Returns to initial position");
		else
			System.out.println("Doesnot return");
	}

	private static boolean returnInitial(String path) {
		
		int tracking = 0;
		//This array is used to count number of occurrence of [L,R,U,D]
		int[] count = new int[]{0,0,0,0 };
		char[] c=path.toCharArray();
		for(int i=0;i<path.length();i++)
		{
			if(c[i]=='L')
			{
				tracking = tracking -1;
				count[0]++;
			}
			else if(c[i]=='R')
			{
				tracking = tracking + 1;
				count[1]++;
			}
			
			else if(c[i]=='D')
			{
				tracking = tracking - 2;
				count[3]++;
			}
			else if(c[i]=='U')
			{
				tracking = tracking  + 2;
				count[2]++;
			}
		}
		if(tracking ==0 && (count[0]==count[1] && count[2] == count[3]))
			return true;
		return false;
	}
	

}
