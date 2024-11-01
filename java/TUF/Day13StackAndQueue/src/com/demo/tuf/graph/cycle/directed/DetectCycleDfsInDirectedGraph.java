package com.demo.tuf.graph.cycle.directed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetectCycleDfsInDirectedGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v = 11;
		List<List<Integer>> adj = new ArrayList();
		
		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList());
		}
		
		adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(3).add(7);
        adj.get(4).add(5);
        adj.get(5).add(6);
        adj.get(7).add(5);
        adj.get(8).add(9);
        adj.get(9).add(10);
        adj.get(10).add(8);
        
        DetectCycleDfsInDirectedGraph obj = new DetectCycleDfsInDirectedGraph();
        boolean ans = obj.isCyclic(v, adj);
        if (ans)
            System.out.println("True");
        else
            System.out.println("False");
	}
	
	public boolean isCyclic(int v, List<List<Integer>> adj)
	{
		if(v==0)
			return false;
		
		int visited[] = new int[v];
		int pathVisit[] = new int[v];
		
		Arrays.fill(visited, 0);
		Arrays.fill(pathVisit, 0);
		
		for(int i=0;i<v;i++)
		{
			if(visited[i]==0)
				if(dfsUtil(i,visited,pathVisit,adj)==true)
					return true;
		}
		return false;
	}
	
	public boolean dfsUtil(int i,int[] visited,int[] pathVisit,List<List<Integer>> adj)
	{
		visited[i]=1;
		pathVisit[i]=1;
		
		for(int x : adj.get(i))
		{
			if(visited[i]==0)
			{
				if(dfsUtil(x,visited,pathVisit,adj)==true)
					return true;
			}
			else if(pathVisit[i]==1)
			{
				return true;
			}
		}
		pathVisit[i]=0;
		return false;
	}
	
	// O - (V+E) = v is vertices or nodes and e = edges. Space -- 2N
}
