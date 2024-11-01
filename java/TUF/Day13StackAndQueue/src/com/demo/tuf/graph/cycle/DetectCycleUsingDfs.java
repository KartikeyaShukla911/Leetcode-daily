package com.demo.tuf.graph.cycle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetectCycleUsingDfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int V = 3;
		List<List<Integer>> adj = new ArrayList();
		int i;
		for (i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(0);
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        
        System.out.println(isCyclic(V, adj) ? 
                "Contains cycle" : "No Cycle");

       V = 3;
       List<List<Integer>> adj2 = new ArrayList<>(V);

       for (i = 0; i < V; i++) {
           adj2.add(new ArrayList<>());
       }

       adj2.get(0).add(1);
       adj2.get(1).add(0);
       adj2.get(1).add(2);
       adj2.get(2).add(1);

       System.out.println(isCyclic(V, adj2) ? 
               "Contains Cycle" : "No Cycle");
   }
	
	public static boolean isCyclic(int v,List<List<Integer>> adj)
	{
		boolean visited[]=new boolean[v];
		Arrays.fill(visited, false);
		
		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			{
				return dfsUtil(v,visited,adj,-1);
			}
		}
		return false;
	}
	
	public static boolean dfsUtil(int v, boolean visited[],List<List<Integer>> adj,int parent)
	{
		visited[v]=true;
		for(int x : adj.get(v))
		{
			if(!visited[x])
			{
				dfsUtil(v,visited,adj,v);
			}
			else if (x!=parent)
				return true;
		}
		return false;
	}
}
