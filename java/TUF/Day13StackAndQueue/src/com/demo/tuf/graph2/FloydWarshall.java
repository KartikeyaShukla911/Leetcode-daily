package com.demo.tuf.graph2;

public class FloydWarshall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Multi-source shortest path
		 * Floyd warshall used in to find the distance for all edges with shortest path in 2d matrix
		 */
		
		int V = 4;
        int[][] matrix = new int[V][V];

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                matrix[i][j] = -1;
            }
        }

        matrix[0][1] = 2;
        matrix[1][0] = 1;
        matrix[1][2] = 3;
        matrix[3][0] = 3;
        matrix[3][1] = 5;
        matrix[3][2] = 4;

        FloydWarshall obj = new FloydWarshall();
        obj.shortest_distance(matrix);

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
	}
	
	public void shortest_distance(int[][] mat)
	{
		int i,j,k;
		int n = mat.length;
		int m = mat[0].length;
		
		// set i==j as 0, and -1 (these are unreachable) as INF
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					mat[i][j]=0;
				}
				
				else if(mat[i][j]==-1)
				{
					mat[i][j]=(int)1e9;
				}
			}
		}
		
		for(k=0;k<n;k++)
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					mat[i][j] = Math.min(mat[i][j],mat[i][k]+mat[k][j]);
				}
			}
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(mat[i][j]==1e9)
					mat[i][j]=-1;
			}
		}
	}
}
