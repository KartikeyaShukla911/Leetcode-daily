package com.demo.tuf.bst.misc;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianStreamInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float arr[]
	            = { 5, 15, 1, 3, 2, 8, 7, 9, 10, 6, 11, 4 };
	        int n = arr.length;
	 
	        printMedian(arr, n);
	}

	public static void printMedian(float[] arr,int n)
	{
		int i;
		int j=0;
		int pos=0;
		int cnt=0;
		for(i=1;i<n;i++)
		{
			if(arr[i]<arr[j])
			{
//				pos=binarySearch(arr,n,0,arr[i]);
				
				//move element to right and create space to insert elements
				// O n^2
			}
			cnt++; // keep track of sorted elements, if even, then mid-1+mid+1/2 else, the mid of count is answer
		}
	}
	
	public static void printMedUsingHeap(float[] arr,int n)
	{
		PriorityQueue<Integer> s = new PriorityQueue(Collections.reverseOrder()); // minHeap
		PriorityQueue<Integer> g = new PriorityQueue(); // maxHeap
		
		/*
		 * here keep track of smaller elements into pq, and other larger in g
		 * med is the first element.
		 * if the first arr[i] is smaller in med, insert to g
		 * if first arr[i] is greater in med, insert to s
		 * reupdate med = g.poll() + s.poll() / 2
		 */
		
		int i;
		float med=0;
		for(i=0;i<n;i++)
		{
			med=arr[i];
			System.out.println("Median "+med);
			float x = arr[i];
			
			if(s.size() > g.size())
			{
				if(med < x)
				{
					g.add(s.remove());
					s.add((int)x);
				}
				else
				{
					g.add((int)x);
				}
				med = (g.peek()+s.peek())/2;
			}
			else if(s.size()==g.size())
			{
				if(x<med)
				{
					s.add(x);
					med = s.peek();
				}
				else
				{
					g.add(x);
					med = g.peek();
				}
			}
			else
			{
				if(x>med)
				{
					s.add(g.remove());
				}
			}
		}
	}
	//O n log n S - 2n
}
