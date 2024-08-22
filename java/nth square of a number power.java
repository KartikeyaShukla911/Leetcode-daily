// nth square root power using binary search

public void binaryS(int n,int m)
{
    int low  = 1, high = n;
    int mid = (low+high)>>1;

    while(low<=high)
    {
        mid = funcM(mid,n,m);
        if(mid==1)
            return mid;
        
        else if(mid == 2)
            high = mid-1;
        else
            low = mid-1;
    }
}

public int funcM(int mid,int n,int m)
{
    int i;
    int prod=1;
    for(i=2;i<=m/2;i++)
    {
        prod *= mid;
        if(prod > m)
            return 2;
    }
    if(prod==1)
        return mid;
    return 0;
}