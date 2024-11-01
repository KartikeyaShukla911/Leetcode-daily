package com.demo.tuf.graph.cycle.directed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsTopoSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> adj = new ArrayList();
		int v=6;
		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList());
		}
		
		 adj.get(5).add(2);
         adj.get(5).add(0);
         adj.get(4).add(0);
         adj.get(4).add(1);
         adj.get(3).add(1);
         adj.get(2).add(3);


        new BfsTopoSorted().isCyclic(6,adj);
	}

	public static void isCyclic(int v,List<List<Integer>> adj)
	{
		if(v==0)
			return;
		
		int indegree[] = new int[v];
		Queue<Integer> q = new LinkedList();
		
		int[] topo = new int[v];
		int idx=0;
		int i;
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
				q.add(i);
		}
		
		while(!q.isEmpty())
		{
			int temp = q.poll();
			topo[idx++]=temp;
			indegree[temp]--;
			
			for(int x : adj.get(temp))
			{
				indegree[x]--;
				
				if(indegree[x]==0)
					q.add(x);
			}
		}
		
		System.out.println("Topological Sorted Graph: ");
		for(i=0;i<v;i++)
		{
			System.out.print(" "+topo[i]);
		}
	}
	
	// O(V+E) S(2N)
}
