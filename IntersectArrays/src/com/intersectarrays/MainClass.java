/*Given two integer arrays, return their intersection.
Note: the intersection is the set of elements that are common to both arrays.

Ex: Given the following arrays...

nums1 = [2, 4, 4, 2], nums2 = [2, 4], return [2, 4]
nums1 = [1, 2, 3, 3], nums2 = [3, 3], return [3]
nums1 = [2, 4, 6, 8], nums2 = [1, 3, 5, 7], return []
*/
package com.intersectarrays;

import java.util.HashSet;
import java.util.Iterator;

public class MainClass {
	
	static void intersect(int[] arr1, int[] arr2)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		HashSet<Integer> hs1=new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++)
			hs.add(arr1[i]);
		for(int i=0;i<arr2.length;i++)
			if(hs.contains(arr2[i]))
				hs1.add(arr2[i]);
		Iterator<Integer> i = hs1.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2, 4, 6, 8};
		int arr2[]= {3,3};
		intersect(arr1, arr2);
		
	}

}
