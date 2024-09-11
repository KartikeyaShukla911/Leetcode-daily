package com.demo.tuf;
import java.io.*;
import java.util.Stack;

public class AreaOfHistorgram {
	
	/*
	 * Area of largest rectangle in Histogram

Problem Statement: Given an array of integers heights representing the histogram's bar height where the width of each bar is 1  return the area of the largest rectangle in histogram.

Example:

Input: N =6, heights[] = {2,1,5,6,2,3}

Output: 10
	 */
	
	public static int findHisto(int arr[],int N)
	{
		if(N==0)
			return 0;
		if(N==1)
		{
			return arr[0]*1;
		}
		Stack<Integer> st = new Stack();
		int i;
		int leftSmaller[] = new int[N];
		int rightSmaller[] = new int[N];
		
//		rightSmaller[N-1]=0;
//		leftSmaller[0]=0;
		for(i=N-1;i>=0;i--)
		{
			while(!st.isEmpty() && arr[st.peek()] >= arr[i])
			{
				st.pop();
			}
			
			if(!st.isEmpty())
			{
				rightSmaller[i]=st.peek()-1;
			}
			else
			{
				rightSmaller[i]=N-1;
			}
			st.push(i);
		}
		
		while (!st.isEmpty()) st.pop();
		
		for(i=0;i<N;i++)
		{
			while(!st.isEmpty() && arr[st.peek()] >= arr[i])
			{
				st.pop();
			}
			
			if(st.isEmpty())
			{
				leftSmaller[i]=0;
			}
			else
			{
				leftSmaller[i]=st.peek()+1;
				
			}
			st.push(i);
		}
		int maxi =0;
		for(i=0;i<N;i++)
		{
			maxi = Math.max(maxi, (rightSmaller[i] - leftSmaller[i] + 1) * arr[i]);
		}
		return maxi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N =6; 
		int heights[] = {2,1,5,6,2,3};
		
		System.out.println("Histogram area: "+findHisto(heights,N));
	}

}
