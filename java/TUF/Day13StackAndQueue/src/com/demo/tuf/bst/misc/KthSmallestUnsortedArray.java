package com.demo.tuf.bst.misc;

import java.util.Arrays;

public class KthSmallestUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
        int K = 2;

        // Function call
        System.out.print("K'th smallest element is "
                         + kthSmallest(arr, K));
	}
	
	public static int kthSmallest(Integer[] arr,int k)
	{
		int n = arr.length;
		if(k>=n)
			return -1;
		Arrays.sort(arr);
		return arr[k-1];
	}

}
