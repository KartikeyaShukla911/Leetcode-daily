//N queen problem
public static final Nqueen = 3;


static void Nqueen( )
{
    int n = 4;
    int arr[][] = {
        {0,0,0,0},
        {0,0,0,0},
        {0,0,0,0},
        {0,0,0,0},
    };

    if(checkNqueenUtil(arr,n,0,0)==false)
    {
        // not possible to place queen;
    }
}

public static boolean checkNqueenUtil(int arr[],int n,int row,int col)
{
    if(col>=N)
        return true;
    // all queen placed

    for(i=row;i<n;i++){
        if(isSafe(arr,n,row,col))
        {
            arr[row][col]=1;

            if(checkNqueenUtil(arr,n,i,col+1))
                return true;
                arr[row][col]=0;
        }
    }
    return false;
}

public static boolean isSafe(int arr[],int n,int row,int col)
{
    int dupRow = row;
    int dupCol = col;
    int i;

    for(i=col;i>=0;i--)
    {
        if(arr[row][i]==1)
            return false;
    }

    for(i=row;i>=0;i--)
    {
        if(arr[i][col]==1)
            return false;
    }

    for(i=row;i<n;i++)
    {
        if(arr[i][col]==1)
            return false;
    }
    while(dupRow!=0 && dupCol!=0)
    {
        if(arr[dupRow--][dupCol--]==1)
            return false;
    }
    dupRow=row;
    dupCol=col;

    while(dupRow<n && dupCol!=0)
    {
        if(arr[dupRow++][dupCol--]==1)
            return false;
    }
    return true;
}