package com.demo.tuf.dp2;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3 };
        int target = 4;
        int n = arr.length;

        // Call the countWaysToMakeChange function and print the result
        System.out.println("The total number of ways is " + countWaysToMakeChange(arr, n, target));
    
	}

	public static int countWaysToMakeChange(int arr[],int n,int target)
	{
		if(target==0)
			if(target%arr[0]==0)
				return 1;
			else
				return 0;
		
		int not_taken=0;
		int taken=0;
		if(arr[n-1]>target)
			not_taken = countWaysToMakeChange(arr, n-1, target);
		
		else
			taken = countWaysToMakeChange(arr, n-1, target-arr[n-1]);
		
		return taken+not_taken;
	}
}
