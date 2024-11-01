package com.demo.tuf.graph.basics;

import java.util.LinkedList;
import java.util.Queue;

public class Graph
{
	int vertex;
	LinkedList<Integer> adjList[];
	public Graph(int v)
	{
		this.vertex = v;
		int i;
		adjList = new LinkedList[vertex];
		for(i=0;i<vertex;i++)
		{
			adjList[i]= new LinkedList();
		}
	}
	
	public void addEdge(int x,int y)
	{
		adjList[x].add(y);
		adjList[y].add(x); // for bi directional graph
	}
	
	public void printGraph()
	{
		int i;
		for(i=0;i<vertex;i++)
		{
			System.out.print(" Vertex : "+i);
			
			for(Integer node : adjList[i])
			{
				System.out.print(" -->"+node);
			}
		}
	}
	
	public void dfs(int start)
	{
		boolean[] visited = new boolean[vertex];
		System.out.println("DFS of graph: ");
		dfsUtil(visited,start);
		System.out.println();
	}
	
	public void dfsUtil(boolean[] visited, int start)
	{
		if(visited[start]==true)
			return;
		
		visited[start]=true;
		System.out.print("-->"+start);
		for(Integer node : adjList[start])
		{
			if(!visited[node])
				dfsUtil(visited,node);
		}
		System.out.println();
	}
	
	public void bfs(int start)
	{
		boolean[] visited= new boolean[vertex];
		Queue<Integer> q = new LinkedList();
		
		visited[start]=true;
		System.out.println("BFS of graph: ");
		q.add(start);
		//System.out.println(" "+start);
		
		while(!q.isEmpty())
		{
			int temp = q.peek();
			System.out.println("--> "+temp);
			q.poll();
			for(Integer x : adjList[temp])
			{
				if(!visited[x]) {
					q.add(x);
					visited[x]=true;
				}
			}
			System.out.println();
		}
	}
}