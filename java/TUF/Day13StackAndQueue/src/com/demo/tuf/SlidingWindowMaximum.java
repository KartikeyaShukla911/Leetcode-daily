package com.demo.tuf;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
 * Problem Statement: Given an array of integers arr, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Return the max sliding window.

Examples:

Example 1:

Input: arr = [4,0,-1,3,5,3,6,8], k = 3

Output: [4,3,5,5,6,8]
 */

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,0,-1,3,5,3,6,8};
		int k = 3;
		List<Integer> ans = slidingWindowMax(arr,k);
		for(int i : ans)
		{
			System.out.println("max: "+i);
		}
	}
	
	public static List<Integer> slidingWindowMax(int arr[],int k)
	{
		List<Integer> ans = new ArrayList();
		
		Deque<Integer> dq = new ArrayDeque();
		int i,n=arr.length;
		for(i=0;i<arr.length;i++)
		{
			if(dq.peek()==i-k)
			{
				dq.poll();
			}
			
			while(!dq.isEmpty() && arr[dq.peekLast()] <arr[i])
			{
				dq.pollLast();
			}
			
			dq.offer(i);
			
			if(i>=k-1)
			{
				ans.add(arr[dq.peek()]);
			}
		}
		
		return ans;
	}

}
