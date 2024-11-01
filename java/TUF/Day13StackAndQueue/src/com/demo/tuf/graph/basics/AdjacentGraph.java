package com.demo.tuf.graph.basics;

import java.util.LinkedList;
import java.util.Queue;

public class AdjacentGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        
        graph.printGraph();
        graph.bfs(0);
        graph.dfs(0);
	}
}

	
