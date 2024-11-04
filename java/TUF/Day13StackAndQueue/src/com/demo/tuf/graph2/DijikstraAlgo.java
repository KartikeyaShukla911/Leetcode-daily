package com.demo.tuf.graph2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class DijikstraAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int V = 5, E = 6;

        int[][] edges = {{1,2,2},{2,5,5},{2,3,4},{1,4,1},{4,3,3},{3,5,1}};

        DijikstraAlgo obj = new DijikstraAlgo();
        List < Integer > path = obj.shortestPath(V, E, edges);
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
	}
	
	public int shortestPath(int v,int e, int[][] edges)
	{
		
		/*
		 * create an undirected graph with weights and edges
		 * create a distance[] and parent[] array initialize with inifinity and -1
		 * make parent index as 0, since this is the starting point
		 * 
		 * create a min priority queue in, since we need the minimum source distance
		 * add 0, iterate and find the least distance,
		 * compare and put the min weight as compared to INF
		 * 
		 *  once iterated to destination,
		 *  create and traverse an array,
		 *  and find all paths from parent array.
		 */
		
		int i;
		List<List<Integer>> adj = new ArrayList();
		List<Integer> ans = new ArrayList();
		
		for(i=0;i<v;i++)
		{
			adj.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
			adj.get(edges[i][1]).add(new Pair(edges[i][0],edges[i][2]));
			
		}
		
		int dist[] = new int[v+1];
		int parent[] = new int[v+1];
		
		Arrays.fill(dist, Integer.MIN_VALUE);
		Arrays.fill(parent, -1);
		
		parent[1]=0;
		
		PriorityQueue<Pair> pq = new PriorityQueue((x,y)-> x.getFirst() - y.getFirst());
		
		pq.add(new Pair(0,1));
		
		for(i=1;i<=v;i++)
		{
			dist[i]=(int)(1e9);
			parent[i]=i;
		}
		while(!pq.isEmpty())
		{
			Pair it = pq.peek();
			int node = it.getSecond();
			int dis = it.getFirst();
			pq.remove();
			
			for(Pair itr : adj.get(node))
			{
				int adjNode = itr.getSecond();
				int adjWeight = itr.getFirst();
				
				
				if(adjNode + adjWeight < dist[adjNode])
				{
					dist[adjNode] = adjNode + adjWeight;
					pq.add(new Pair(dis+adjWeight, adjNode));
					
					parent[adjNode] = node;
				}
			}
			
		}
		
		if(dist[v]==1e9)
		{
			return ans.add(-1);
		}
		
		int node = n;
		
		while(parent[node]!=node)
		{
			path.add(node);
			node = parent[node];
		}
		
		path.add(1);
		
		Collection.reverse(path);
	}

	// O E log V + O V
	class Pair
	{
		int first;
		int second;
		
		public Pair(int a,int b)
		{
			this.first = a;
			this.second = b;
		}
		
		public int getFirst()
		{
			return first;
		}
		
		public int getSecond()
		{
			return second;
		}
	}
}
