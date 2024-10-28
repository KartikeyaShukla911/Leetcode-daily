package com.demo.tuf.bst.misc;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFillAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] img = {
	            { 1, 1, 1 },
	            { 1, 1, 0 },
	            { 1, 0, 1 }
	        };

	        int x = 1, y = 1;
	        int newClr = 3;
	   
	        floodFillDfs(img, x, y, newClr);
	        
	}

	public static void floodFillDfs(int[][] img,int x,int y,int newClr)
	{
		if(img[x][y]==newClr)
			return;
		
		int n = img.length;
		int m = img[0].length;
		
		dfs(img,x,y,n,m,newClr);
	}
	
	public static void dfs(int[][] img, int x,int y,int n,int m,int newClr)
	{
		int temp = img[x][y];
		
		if(temp!=newClr)
			return;
		
		if(x+1<n)
		{
			dfs(img,x+1,y,n,m,newClr);
		}
		if(x-1>=0)
		{
			dfs(img,x-1,y,n,m,newClr);
		}
		if(y+1<m)
		{
			dfs(img,x,y+1,n,m,newClr);
		}
		if(y-1>=0)
		{
			dfs(img,x,y-1,n,m,newClr);
		}
	}
	
	public static bfs(int[][] img, int x,int y,int n,int m, int newClr)
	{
		int temp = img[x][y];
		
		if(temp!=newClr)
			return;
		
		Queue<int[]> q = new LinkedList();
	}
	
}
