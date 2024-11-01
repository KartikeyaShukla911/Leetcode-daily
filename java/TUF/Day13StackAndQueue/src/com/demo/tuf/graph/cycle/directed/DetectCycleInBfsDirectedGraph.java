package com.demo.tuf.graph.cycle.directed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DetectCycleInBfsDirectedGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectCycleInBfsDirectedGraph obj = new DetectCycleInBfsDirectedGraph();
		
		List<List<Integer>> adj = new ArrayList();
		int i,v=6;
		for(i=0;i<v;i++)
		{
			adj.add(new ArrayList());
		}
		
		adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(2);
        boolean ans = obj.isCyclic(v, adj);
        if (ans)
            System.out.println("True");
        else
            System.out.println("False");
	}
	
	public boolean isCyclic(int v,List<List<Integer>> adj)
	{
		if(v==0)
			return false;
		
		Queue<Integer>  q = new LinkedList();
		int[] indegree = new int[v];
		
		int i;
		int cnt=0;
		
		for(i=0;i<v;i++)
		{
			for(int x : adj.get(i))
			{
				indegree[x]++;
			}
		}
		
		for(i=0;i<v;i++)
		{
			if(indegree[i]==0)
			{
				q.add(i);
			}
		}
		
		while(!q.isEmpty())
		{
			int temp = q.poll();
			indegree[temp]--;
			for(int x : adj.get(temp))
			{
				indegree[x]--;
				if(indegree[x]==0)
					q.add(x);
			}
		}
		
		if(cnt!=v)
			return true;
		return false;
	}
}
