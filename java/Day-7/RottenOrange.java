/*
 * Rotten orange
 * arr = [{2,1,1},{0,1,1},{1,0,1}]
 */


 public static void main(String args[])
 {
    int[][] arr = {
        {2,1,1},{1,1,0},{0,1,1}
    };
    int n=3;
    System.out.println("Time: "+rottenOrange(arr, n));
 }

 public static int rottenOrange(int arr[][],int n)
 {
    if(n==0)
        return 0;
    
    int visited[][] = new int[n][n];
    int cnt=0;
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(arr[i][j]==2)
            {
                cnt++;
                bfs(arr,i,j,visited);
            }
        }
    }

    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(arr[i][j]==1)
                return -1;
        }
    }
    return cnt;
 }

 public static void bfs(int arr[][],int x,int y,int visited[][])
 {
    if(x<0 || x>=n || y<0 || y>=n)
        return;
    
    if(visited[x][y]==1)
        return;
    
    visited[x][y]=1;
    bfs(arr,x+1,y,visited);
    bfs(arr,x,y+1,visited);
    bfs(arr,x-1,y,visited);
    bfs(arr,x,y-1,visited);
 }