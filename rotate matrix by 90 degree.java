// rotate matrix inplace by 90 degree


public void rotate(int[][] matrix) {
        
    int n = matrix.length, m = matrix[0].length;
    int ans[][] = new int [n][m];

    int i,j;

    for(i=0;i<n;i++)
        for(j=0;j<m;j++)
            ans[i][j]=matrix[i][j];

    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            int temp = ans[i][j];
            ans[i][j] = ans[j][i];
            ans[j][i] = temp;
            System.out.println("mat: "+matrix[i][j]);

        }
        System.out.println();
    }

    for(i=0;i<n;i++)
    {
        reverseRow(i,m,ans);
    }
}

    public void reverseRow(int row,int col,int ans[][])
    {

        int j,i;
        for(j=0;j<col;j++,col--)
        {
            int temp = ans[row][j];
            ans[row][j] = ans[row][col-1];
            ans[row][col-1] = temp;
        }
    }
}