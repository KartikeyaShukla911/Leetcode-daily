package com.demo.tuf.bst.misc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class kthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		 
        int arr[] = { 1, 2, 3, 4, 5, 6 };
 
        // Function call
        List<Integer> res = getAllKthNumber(arr,k);
 
        for (int x : res)
            System.out.println("Kth largest element is "
                               + x);
    }

	public static List<Integer> getAllKthNumber(int arr[],int k)
	{
		int n = arr.length;
		if(n==0)
			return null;
		
		List<Integer> ans = new ArrayList();
		if(k>n)
			k=k%n;
		
		PriorityQueue<Integer> pq = new PriorityQueue();
		
		for(int temp : arr)
		{
			if(pq.size()<k)
			{
				pq.add(temp);
			}
			else
			{
				if(temp > pq.peek())
				{
					pq.poll();
					pq.add(temp);
				}
				else
				{
					if(pq.size()>=k)
					{
						ans.add(pq.peek());
					}
					else
					{
						ans.add(-1);
					}
				}
			}
		}
		return ans;
	}
}
