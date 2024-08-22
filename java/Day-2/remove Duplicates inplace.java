// remove duplicates inplace

public static void removeDup(int arr[],int n)
{
    int i,j;
    i=0,j=1;
    if(n<=1)
        return;
    
    while(i<j && j<n)
    {
        if(arr[i]!=arr[j])
        {
            i++;
        }

        arr[i]=arr[j++];
    }
    return i+1;
}