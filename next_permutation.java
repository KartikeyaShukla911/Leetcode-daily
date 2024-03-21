// next permutation


public void next_permutation(int arr[],int n)
{
    if(n==0)
        return;

    int index = -1;
    int i,j;
    for(i=n-2;i>=0;i--)
    {
        if(arr[i]<arr[i+1])
        {
            index = i;
            break;
        }
    }

    if(index==-1)
    {
        reverse(arr,0,n);
    }
    else
    {
        for(i=n-1;i>index;i--)
        {
            if(arr[i]<arr[index])
            {
                swap(arr,index,i);
                
                break;
            }
        }
        reverse(arr,index+1,n);
    }
}

public void swap(int arr[],int i,int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

public void reverse(int arr[],int i,int j)
{
    while(i<j)
    {
        swap(arr,i++,j--);
    }
}