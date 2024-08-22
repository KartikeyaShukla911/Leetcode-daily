//find triplets in an array

public static int triplets(int arr[],int n)
{
    Arrays.sort(arr);
    //Collection.sort(arr);

    int low,high;
    int cnt=0;
    for(i=0;i<n;i++)
    {
        low=i+1;
        high= n-1;
        while(low<high)
        {
            int sum = arr[low]+arr[high]+arr[i];
            if(sum==0)
                cnt++;
            else if(sum<0)
            {
                low++;
            }
            else
            {
                high--;
            }
        }
    }
    return cnt;
}