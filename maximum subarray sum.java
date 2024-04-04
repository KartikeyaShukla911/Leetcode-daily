// maximum subarray sum in an array

public static void kadaneAlgo(int arr[],int n)
{
    int i,j;
    int sum=0;
    int maxi = 0;
    for(i=0;i<n;i++)
    {
        sum += arr[i];
        if(max<sum)
        {
            maxi = sum;
        }

        if(sum==0)
            sum=0;
    }
    System.out.println("Maxi "+maxi);
}