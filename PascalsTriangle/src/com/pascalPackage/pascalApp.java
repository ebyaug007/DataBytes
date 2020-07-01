/*Pascal's Triangle

https://www.mathsisfun.com/pascals-triangle.html
	
Output should be row on Pascal's Triangle specified in the input
*/
package com.pascalPackage;

import java.util.ArrayList;
import java.util.List;

public class pascalApp {
	public static void main(String[] args) {
		System.out.println(getRow(3));
	}
	public static List<Integer> getRow(int rowindex)
	{
		List<Integer> row = new ArrayList<Integer>(rowindex+1);
		row.add(1);
		for(int i=1;i<=rowindex;i++)
		{
			for(int j=i-1;j>=1;j--)
			{				
				row.set(j, row.get(j-1)+row.get(j));
			}
			row.add(1);
		}
		
		return row;
	}

}
