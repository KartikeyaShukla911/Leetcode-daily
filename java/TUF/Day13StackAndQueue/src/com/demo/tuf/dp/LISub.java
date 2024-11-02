package com.demo.tuf.dp;

public class LISub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,9,2,5,3,7,101,18};
		System.out.println("longest increasing subsequence "+lis(arr,0,arr.length));
	}

	public static int lis(int arr[],int idx,int n)
	{
		if(n==0)
			return 0;
		int cnt=0;
		for(int i =0;i<n;i++)
		{
			if(dfs(arr,i,idx,n)==true)
				cnt++;
		}
		return cnt;
	}
	
	public static boolean dfs(int arr[],int i,int idx,int n)
	{
		if(i!=n && idx!=n)
		{
			if(arr[i]>arr[idx]==true)
				return dfs(arr,i+1,idx,n);
		}
		return false;
	}
}
