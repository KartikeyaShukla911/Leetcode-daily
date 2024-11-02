package com.demo.tuf.dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println(lis(arr));
        System.out.println(lisDp(arr));
	}

	public static int lis(int arr[])
	{
		int n = arr.length;
		int idx;
		int res=0;
		for(idx=0;idx<n;idx++)
		{
			res = dfs(idx,n,arr);
		}
		return res;
	}
	
	public static int dfs(int idx,int n,int[] arr)
	{
		if(idx==n)
			return 0;
		
		int mx=1;
		
		for(int prev = 0;prev<idx;prev++)
		{
			if(arr[prev]<arr[idx])
			mx = Math.max(mx, dfs(prev,n,arr)+1);
		}
		return mx;
	}
	
	public static int lisDp(int arr[])
	{
		int n = arr.length;
		
		int memo[] = new int[n+1];
		
		Arrays.fill(memo, -1);
		int res=0;
		for(int i=0;i<n;i++)
		{
			memo[i] = dfsMemo(i,arr,memo);
		}
		return memo[n];
	}
	
	public static int dfsMemo(int idx,int arr[],int[] memo)
	{
		if(idx==0)
			return 1;
		
		if(memo[idx]!=-1)
			return memo[idx];
		
		int mx=1;
		for(int prev=0;prev<idx;prev++)
		{
			if(arr[prev]<arr[idx])
			{
				 mx=Math.max(mx,dfsMemo(prev,arr,memo)+1);
			}
		}
		memo[idx]=mx;
		return memo[idx];
	}
}
