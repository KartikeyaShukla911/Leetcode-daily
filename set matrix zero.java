// set matrix zero


public void setZeroes(int[][] matrix) {
    int n = matrix.length,m = matrix[0].length,i,j;
    int row[] = new int[n];
    int col[] = new int[m];

    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            if(matrix[i][j] ==0)
            {
                row[i] = -1;
                col[j] = -1;
            }
        }
    }

    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            if(row[i]==-1 || col[j]==-1)
            {
                matrix[i][j]=0;
            }
        }
    }
}


/// without using any extra space


public void setZeroes(int[][] matrix) {
        
        
    int n=matrix.length,m = matrix[0].length,i,j,rowZero=-1;

    if(matrix[0][0]==0)
    {
        rowZero = 0;
    }

    int rowZeroFound = -1, colZeroFound = -1;

    for(i=1;i<n;i++)
    {
        if(matrix[i][0]==0)
            colZeroFound = 0;
    }

    for(j=1;j<m;j++)
    {
        if(matrix[0][j]==0)
            rowZeroFound = 0;
    }
    for(i=1;i<n;i++)
    {
        for(j=1;j<m;j++)
        {
            if(matrix[i][j]==0)
            {
                matrix[0][j]=0;
                matrix[i][0]=0;
            }
        }
    }

    for(i=1;i<n;i++)
    {
        for(j=1;j<m;j++)
        {
            if(matrix[i][0]==0 || matrix[0][j]==0)
            {
                matrix[i][j]=0;
            }
        }
    }

    if(rowZero == 0)
    {
        for(i=0;i<n;i++)
            matrix[i][0]=0;
        for(j=0;j<m;j++)
            matrix[0][j]=0;
    }

    for(i=0;i<n;i++)
    {
        if(colZeroFound==0)
        {
            matrix[i][0]=0;
        }
    }

    for(j=0;j<m;j++)
    {
        if(rowZeroFound==0)
        {
            matrix[0][j]=0;
        }
    }
}