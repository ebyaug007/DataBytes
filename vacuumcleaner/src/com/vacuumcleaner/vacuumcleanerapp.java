package com.vacuumcleaner;

public class vacuumcleanerapp {
	public static void main(String[] args) {
		String path = "RUULLDRD";
		if(returnInitial(path))
			System.out.println("Returns to initial position");
		else
			System.out.println("Doesnot return");
	}

	private static boolean returnInitial(String path) {
		
		int tracking = 0;
		char[] c=path.toCharArray();
		for(int i=0;i<path.length();i++)
		{
			if(c[i]=='L')
				tracking = tracking -1;
			else if(c[i]=='R')
				tracking = tracking + 1;
			else if(c[i]=='D')
				tracking = tracking - 2;
			else if(c[i]=='U')
				tracking = tracking  + 2;
		}
		if(tracking ==0)
			return true;
		return false;
	}
	

}
