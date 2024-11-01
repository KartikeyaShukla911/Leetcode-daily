package com.demo.tuf.graph.traverse;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueIslandFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = {
		        {1, 1, 0, 1, 1},
		        {1, 0, 0, 0, 0},
		        {0, 0, 0, 0, 1},
		        {1, 1, 0, 1, 1}};

		UniqueIslandFound ob = new UniqueIslandFound();
		    int ans = ob.countDistinctIslands(grid);
		    System.out.println(ans);
	}
	public int countDistinctIslands(int[][] grid)
	{
		int n = grid.length;
		int m = grid[0].length;
		if(n==0 && m==0)
			return 0;
		
		int  visited[][] = new int[n][m];
		Set<String> hs = new HashSet();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(visited[i][j]==0 && grid[i][j]==1)
				{
					dfs(i,j,visited,grid,n,m,hs,i,j);
				}
			}
		}
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		return hs.size();
	}
	
	public static void dfs(int row1,int col1,int visited[][],int[][] grid,int n,int m,Set<String> hs,int row0,int col0)
	{
		int dx[] = {0,0,1,-1};
		int dy[] = {1,-1,0,0};
		
		visited[row1][col1]=1;
		
		hs.add(toString(row1-row0,col1-col0));
		
		for(int i=0;i<4;i++)
		{
			int rowX = row1+dx[i];
			int colY = col1+dy[i];
			
			if(rowX>=0 && rowX<n && colY>=0 && colY<m && visited[rowX][colY]==0 && grid[rowX][colY]==1)
				dfs(rowX,colY,visited,grid,n,m,hs,row0,col0);
		}
	}
	
	private static String toString(int a,int b)
	{
		StringBuilder sb =new StringBuilder();
		sb.append(String.valueOf(Math.abs(a))).append(",").append(String.valueOf(Math.abs(b)));
		return sb.toString();
	}
}
