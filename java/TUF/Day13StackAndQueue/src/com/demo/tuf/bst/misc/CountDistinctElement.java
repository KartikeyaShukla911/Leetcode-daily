package com.demo.tuf.bst.misc;

import java.util.HashMap;

public class CountDistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * Brute Force Approach
			 * 
			 * take 1 for loop to iterate, take hashmap, and take another for loop to iterate till k
			 * then search for 1 count element and increase count
			 * Time complex - i->n
			 * j=i;j<k; put in hm
			 * check HashSet and count if cnt=1
			 * O(n^2) S(n)
			 */
		
		// use hashmap to put and count element with 0..1,,2
		int arr[] = {1, 2, 1, 3, 4, 2, 3}, K = 4;
        
        // Function call
      countDistinct(arr, arr.length, K);
	}
	
	public static void countDistinct(int arr[],int n,int k)
	{
		if(k>n)
		{
			k=k%n;
		}
		
		if(n==0 || k==0 || k==1)
			return;
		
		HashMap<Integer,Integer> hm = new HashMap();
		int i;
		
		int cnt=0;
		
		for(i=0;i<n;i++)
		{
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		
		for(i=k;i<n;i++)
		{
			
				if(hm.get(arr[i-k])==1)
				{
					hm.remove(arr[i-k]);
				}
				else
				{
					hm.put(arr[i-k], hm.get(arr[i-k])-1);
				}
			
				hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
				System.out.println("Distinct elements size: "+hm.size());
			
		}
	}
}
