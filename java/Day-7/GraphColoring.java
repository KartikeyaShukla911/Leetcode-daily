/*
 * Grph color node
 * M - Coloring Problem


37

2
Problem Statement: Given an undirected graph and a number m, determine if the graph can be colored with at most m colors such that no two adjacent vertices of the graph are colored with the same color.

Examples:

Example 1:
Input: 
N = 4
M = 3
E = 5
Edges[] = {
  (0, 1),
  (1, 2),
  (2, 3),
  (3, 0),
  (0, 2)
}
 */


 public static void main(String args[])
 {
    int N=4,M=5,E=5;

    List<Integer> []graph = new ArrayList[N];
    for(i=0;i<N;i++)
    {
        graph[i]=new ArrayList<Integer>();
    }

    int[] color = new int[M];
    graph[0].add(1);
    graph[2].add(0);
    graph[1].add(2);

    if(graphColor(0,graph,N,M)==true)
        sysout("possible");
    
 }

 public static boolean graphColor(int index,List<Integer> []graph,int []color,int N,int M)
 {
    if(index==M)
        return true;
    
    for(i=1;i<=M;i++)
    {
        if(isSafe(i,graph,N,M)==true)
        {
            color[index]=i;
            if(graphColor(index+1,graph,color,N,M)==true)
                return true;
            color[index]=0;
                
        }
    }
    return false;
 }

 public static boolean isSafe(int i,List<Integer> []graph,int []color,int N,int M)
 {
    for(int x : graph[i])
    {
        if(color[x]==i)
            return false;
    }
    return true;
 }

 // O N^M