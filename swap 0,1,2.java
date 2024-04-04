// sort 0,1,2

//1st Arrays.sort(arr,n);

int low=0,mid=0,high=n-1;
int n;

while(mid < high)
{
    if(arr[mid] == 0)
    {
        swap(arr,low,mid);
        low++,mid++;
    }

    else if(arr[mid]==1)
    {
        mid++;
    }
    else
    {
        swap(arr,mid,high);
        high--;
    }
}