// find perimeter of connected island

public int islandPerimeter(int[][] grid) {
        
    int n = grid.length;
    int m = grid[0].length;

    
    //int[][] visited = new int[n][m];
    int cnt=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(grid[i][j]==1)
            {
                cnt += dfs(grid,i,j,n,m);
            }
        }
    }
    return cnt;
}

public int dfs(int[][] grid, int x,int y, int n,int m)
{
    //System.out.println("Cnt: "+cnt);
    if(x<0 || y<0 || x>n-1 || y>m-1)
        return 1;
    if(grid[x][y]==-1)
        return 0;
    
    if(grid[x][y]==0)
        return 1;
    grid[x][y]=-1;


    return(dfs(grid,x+1,y,n,m) + dfs(grid,x-1,y,n,m) + dfs(grid,x,y-1,n,m) +
    dfs(grid,x,y+1,n,m));
}