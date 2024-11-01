package com.demo.tuf.graph.cycle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInGraph {

	public boolean isCycle(int v, ArrayList<ArrayList<Integer>> arr)
	{
		//int v = arr.size();
		boolean[] visited = new boolean[v];
		int[] parent = new int[v];
		Arrays.fill(visited, false);
		Arrays.fill(parent, -1);
		
		return bfs(v,arr,visited,parent,v);
	}
	
	public boolean bfs(int start,ArrayList<ArrayList<Integer>> arr, boolean[] visited, int[] parent,int v)
	{
		if(v==0)
			return false;
		
		Queue<Node> q= new LinkedList();
		q.add(new Node(start,parent[start]));
		
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			int f = temp.first;
			int s = temp.second;
			
			visited[f]=true;
			for(Integer adj : arr.get(f))
			{
				if(!visited[adj])
				{
					q.add(new Node(adj,s));
				}
				
				else if(parent[adj]==s) // some else have updated the parent
					return true;
			}
		}
		
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        
        /*
         * Process to detect cycle using bfs
         * take a visited[] boolean to track visited graph node
         * take a parent[] integer visited to track if the current node or it's adjacent node are same as parent or not,
         * if yes, then there is a cycle
         * else no
         */
                
        DetectCycleInGraph obj = new DetectCycleInGraph();
        boolean ans = obj.isCycle(4, adj);
        if (ans)
            System.out.println("Cycle found");    
        else
            System.out.println("No Cycle found");
    }
}

	class Node {
    int first;
    int second;
    public Node(int first, int second) {
        this.first = first;
        this.second = second; 
    }
}
