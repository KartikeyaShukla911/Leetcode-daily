/*
 * Rat in a Maze
 * Example 1:

Input:
N = 4
m[][] = {{1, 0, 0, 0},
        {1, 1, 0, 1}, 
        {1, 1, 0, 0},
        {0, 1, 1, 1}}

Output: DDRDRR DRDDRR
 */

import java.util.ArrayList;

static List<String> findPath(int arr[][],int n)
 {
    int[][] visited = new int[][];
    List<String> ans = new ArrayList<>();
    int i,j;
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        visited[i][j]=0;
    }

    if(arr[0][0]==0)
        return;
    row=col=0;
    dfs(arr,n,ans,visited,"",row,col);
    return ans;
 }

 static void dfs(...)
 {
    if(row<0 || col<0 || row>=n || col>=n)
    {
        return ;
    }

    if(arr[row][col]==0)
        return;

    if(visited[row][col]==1)
        return;
    
    if(row==n-1 && col==n-1)
    {
        ans.add(res); // res is String
        return;

    }

    visited[row][col]=1;
    dfs(arr,n,ans,visited,res+"D",row+1,col);
    dfs(arr,n,ans,visited,res+"U",row-1,col);
    dfs(arr,n,ans,visited,res+"L",row,col-1);
    dfs(arr,n,ans,visited,res+"R",row,col+1);
    arr[row][col]=0;
 }