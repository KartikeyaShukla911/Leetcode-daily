package com.demo.tuf.graph2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsMinSpanningTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int V = 5;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
        int[][] edges =  {{0, 1, 2}, {0, 2, 1}, {1, 2, 1}, {2, 3, 2}, {3, 4, 1}, {4, 2, 2}};

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<ArrayList<Integer>>());
        }

        for (int i = 0; i < 6; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];

            ArrayList<Integer> tmp1 = new ArrayList<Integer>();
            ArrayList<Integer> tmp2 = new ArrayList<Integer>();
            tmp1.add(v);
            tmp1.add(w);

            tmp2.add(u);
            tmp2.add(w);

            adj.get(u).add(tmp1);
            adj.get(v).add(tmp2);
        }

        PrimsMinSpanningTree obj = new PrimsMinSpanningTree();
        int sum = obj.spanningTree(V, adj);
        System.out.println("The sum of all the edge weights: " + sum);
	}

	public int spanningTree(int v,ArrayList<ArrayList<ArrayList<Integer>>> adj)
	{
		
		/*
		 * prims min spanning tree is used to find the sum of wt of a minimum spanning tree
		 * 
		 * 
		 */
		
		PriorityQueue<Pair> pq = new PriorityQueue((x,y)-> x.weight - y.weight);
		
		int sum=0;
		int vis[] = new int[v];
		
		pq.add(new Pair(0,0));
		
		while(!pq.isEmpty())
		{
			int wt = pq.peek().weight;
			int node = pq.peek().node;
			
			vis[node]=1;
			sum +=wt;
			for(int i =0 ; i<adj.get(i).size();i++)
			{
				if(vis[adj.get(i).get(0)]==0)
					pq.add(new Pair(adj.get(i).get(0), adj.get(i).get(1)));
			}
		}
		return sum;
	}
	
	class Pair
	{
		int weight;
		int node;
		
		public Pair(int node,int weight)
		{
			this.node = node;
			this.weight = weight;
		}
	}
}
