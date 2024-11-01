package com.demo.tuf.graph.bipartite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DfsOnBipartite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> adj = new ArrayList();
		int v=4;
		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList());
		}
		
		adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        DfsOnBipartite obj = new DfsOnBipartite();
        boolean ans = obj.isBipartite(4, adj);
        if(ans)
            System.out.println("1");
        else System.out.println("0");
	}
	
	public boolean isBipartite(int v,List<List<Integer>> adj)
	{
		if(v==0)
			return true;
		
		int color[] = new int[v];
		
		Arrays.fill(color, -1);
		
		for(int i=0;i<v;i++)
		{
			if(color[i]==-1)
			{
				if(dfs(i,0,color,v,adj)==false)
					return false;
			}
		}
		return true;
	}
	
	public static boolean dfs(int temp,int col,int color[],int v,List<List<Integer>> adj)
	{
		color[temp]=1;
		for(int x : adj.get(temp))
		{
			if(color[x]==-1)
			{
				if(dfs(temp,1-col,color,v,adj)==false)
					return false;
			}
			else if(color[x]==col)
				return true;
		}
		color[temp]=-1;
		return false;
	}
	//O V+E
}
