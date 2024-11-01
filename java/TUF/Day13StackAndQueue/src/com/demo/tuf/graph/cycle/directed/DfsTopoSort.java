package com.demo.tuf.graph.cycle.directed;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DfsTopoSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> adj = new ArrayList();
		int v= 6;
		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList());
		}
		
		
		// O(V+E) , Space - O(2N)
		adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);
        
        int res[] = topoSort(6, adj);
   
        System.out.println("Toposort of the given graph is:" );
        for (int i = 0; i < res.length; i++) {
        System.out.print(res[i]+" ");
	}
	}

    public static int[] topoSort(int v,List<List<Integer>> adj)
    {
    	int ans[] = new int[v];
    	if(v==0)
    		return ans;
    	
    	Stack<Integer> st = new Stack();
    	int[] visited = new int[v];
    	for(int i=0;i<v;i++)
    	{
    		if(visited[i]==0)
    		{
    			dfsTopo(i,v,visited,st,adj);
    		}
    	}
    	
    	for(int i=0;i<v;i++)
    	{
    		ans[i]=st.pop();
    	}
    	return ans;
    }
    
    public static void dfsTopo(int temp,int v,int[] visited,Stack<Integer> st,List<List<Integer>> adj)
    {
    	visited[temp]=1;
    	for(int x : adj.get(temp))
    	{
    		if(visited[x]==0)
    		{
    			dfsTopo(x,v,visited,st,adj);
    		}
    	}
    	st.push(temp);
    }
}
