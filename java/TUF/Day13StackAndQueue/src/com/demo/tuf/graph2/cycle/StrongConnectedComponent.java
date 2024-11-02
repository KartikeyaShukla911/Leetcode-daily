package com.demo.tuf.graph2.cycle;

import java.util.ArrayList;
import java.util.Stack;

public class StrongConnectedComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
        int[][] edges = {
            {1, 0}, {0, 2},
            {2, 1}, {0, 3},
            {3, 4}
        };
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        StrongConnectedComponent obj = new StrongConnectedComponent();
        int ans = obj.kosaraju(n, adj);
        System.out.println("The number of strongly connected components is: " + ans);
    
	}

	public int kosaraju(int n,ArrayList<ArrayList<Integer>> adj)
	{
		Stack<Integer> st = new Stack();
		int[] visited = new int[n];
		
		int i;
		for(i=0;i<n;i++)
		{
			for(int temp : adj.get(i))
			{
				if(visited[temp]==0)
					dfs(temp,adj,st,visited);
			}
		}
		
		int connectedComponents=0;
		
		for(i=0;i<n;i++)
		{
			visited[i]=0;
			for(int temp : adj.get(i))
			{
				adj.get(temp).add(i);
			}
		}
		
		
		while(!st.isEmpty())
		{
			int node = st.peek();
			st.pop();
			if(visited[node]==0)
			{
				connectedComponents++;
				dfsReverse(node,adj,visited);
			}
		}
		return connectedComponents;
	}
	
	public static void dfsReverse(int temp,ArrayList<ArrayList<Integer>> adj,int visited[])
	{
		visited[temp]=1;
		for(int x : adj.get(temp))
		{
			if(visited[x]==0)
				dfsReverse(x,adj,visited);
		}
		
	}
	
	public static void dfs(int temp,ArrayList<ArrayList<Integer>> adj, Stack<Integer> st,int[] visited)
	{
		visited[temp]=1;
		for(int x : adj.get(temp))
		{
			if(visited[x]==0)
				dfs(temp,adj,st,visited);
		}
		st.push(temp);
	}
	
	// O V+E
}
