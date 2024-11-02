package com.demo.tuf.dp;

import java.util.Arrays;

public class Knapsack01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wt[] = {1, 2, 4, 5};
        int val[] = {5, 4, 8, 6};
        int W = 5;
        int n = wt.length;

        int dp[][] = new int[n+1][W+1];
        for(int x[] : dp)
        	Arrays.fill(x, -1);
        // Calculate and print the maximum value of items the thief can steal
        System.out.println("The Maximum value of items the thief can steal is " + knapsack(wt, val, n, W,dp));
    
	}

	public static int knapsack(int wt[],int val[],int n,int W,int dp[][])
	{
		if(n<=0 || W<=0)
			return 0;
		
		if(dp[n][W]!=-1)
			return dp[n][W];
		
		if(wt[n-1]>W)
			dp[n][W]= knapsack(wt,val,n-1,W,dp);
		else
			dp[n][W] =  Math.max(knapsack(wt,val,n-1,W,dp), knapsack(wt,val,n-1,W-wt[n-1],dp)+val[n-1]);
		return dp[n][W];
	}
}
