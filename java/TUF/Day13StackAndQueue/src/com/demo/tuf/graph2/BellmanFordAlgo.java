package com.demo.tuf.graph2;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFordAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * The idea behind using bellman ford algo is to compute the shortest path for all nodes from source. 
		 * And to check negative cycle
		 * Dijikstra fails on negative cycle, causes TLE issue
		 */
	
	int v = 6;
	ArrayList<ArrayList<Integer>> adj = new ArrayList<>() {
        {
            add(new ArrayList<Integer>(Arrays.asList(3, 2, 6)));
            add(new ArrayList<Integer>(Arrays.asList(5, 3, 1)));
            add(new ArrayList<Integer>(Arrays.asList(0, 1, 5)));
            add(new ArrayList<Integer>(Arrays.asList(1, 5, -3)));
            add(new ArrayList<Integer>(Arrays.asList(1, 2, -2)));
            add(new ArrayList<Integer>(Arrays.asList(3, 4, -2)));
            add(new ArrayList<Integer>(Arrays.asList(2, 4, 3)));
        }
    };
	
	int dist[] = new int[v];
	dist = bellmanFord(v,adj);
	
	for(int i : dist)
		System.out.println("->"+i);
	}

	public static int[] bellmanFord(int v,ArrayList<ArrayList<Integer>> adj)
	{
		/*
		 *  create dist[] with INF 
		 *  
		 *  for v-1, do the relaxation
		 * do a relaxation again, and check if it's -1, if yes, return [-1] as negative cycle.
		 *  after that store the answer with shortest dist[] values for given nodes
		 * 
		 */
		int i;
		int[] dist = new int[v];
		for(i=0;i<v;i++)
		{
			dist[i]=(int)1e9;
		}
		dist[0]=0;
		
		for(i=0;i<v-1;i++)
		{
			for(ArrayList<Integer> temp : adj)
			{
				int u = temp.get(0);
				int vv= temp.get(1);
				int wt=temp.get(2);
				
				if(dist[u]!=1e9 && dist[u]+wt < dist[vv])
				{
					dist[vv] = dist[u]+wt;
				}
			}
		}
		
		for(ArrayList<Integer> temp : adj)
		{
			int u = temp.get(0);
			int vv= temp.get(1);
			int wt=temp.get(2);
			
			if(dist[u]!=1e9 && dist[u]+wt < dist[vv])
			{
				int t[] = new int[1];
				t[0]=-1;
				return t;
			}
		}
		return dist;
	}
}

// O VxE
