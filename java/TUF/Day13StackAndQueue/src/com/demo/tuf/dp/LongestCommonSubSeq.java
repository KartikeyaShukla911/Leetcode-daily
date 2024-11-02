package com.demo.tuf.dp;

import java.util.Arrays;

// longest common substring
public class LongestCommonSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "acd";
        String s2 = "ced";

        // Call the lcs function and print the result
        System.out.println("The Length of Longest Common Subsequence is " + lcs(s1, s2));
   
	}

	public static int lcs(String s1,String s2)
	{
		int n=s1.length();
		int m = s2.length();
		
		int dp[][] = new int[n+1][m+1];
		for(int i[] : dp)
		{
			Arrays.fill(i, -1);
		}
		
		return lcsUtil(dp,n,m,s1,s2);
	}
	
	public static int lcsUtil(int dp[][],int n,int m,String s1,String s2)
	{
		if(n==0||m==0)
			return 0;
		
		if(dp[n][m]!=-1)
			return dp[n][m];
		
		if(s1.charAt(n-1)==s2.charAt(m-1))
			dp[n][m] =  1+lcsUtil(dp,n-1,m-1,s1,s2);
		
		else 
			dp[n][m] = Math.max(lcsUtil(dp,n-1,m,s1,s2) ,lcsUtil(dp,n,m-1,s1,s2));
		return dp[n][m];
	}
}
