package com.demo.tuf.dp;

public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {1,2,3,4,5,0};
		int arr2[] = {1,2,-3,0,-4,-5};
		System.out.println("MaxProductSubArray "+MaxProductKadane(arr2));
	}

	public static int MaxProductKadane(int arr[])
	{
		int n = arr.length;
		int i;
		
		int fact=1,glob=1;
		for(i=0;i<n;i++)
		{
			fact = fact*arr[i];
			glob = Math.max(glob, fact);
			if(fact==0)
				fact=1;
		}
		return glob;
	}
	
	public static int modifiedKadane(int arr[])
	{
		int n = arr.length;
		int i;
		
		int prod1=arr[0],prod2=arr[0],res=arr[0];
		
		for(i=1;i<n;i++)
		{
			int temp = Math.max(arr[i], Math.max(prod1*arr[i], prod2*arr[i]));
			prod2 = Math.min(arr[i], Math.min(prod1*arr[i], prod2*arr[i]));
			prod1 = temp;
			
			res = Math.max(res, prod1);
		}
		return res;
	}
}
