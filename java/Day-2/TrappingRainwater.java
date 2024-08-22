// TRAPPING RAINWATER

/*
 * intuition
 * taking a condition arr[l]<=arr[r] ensures that whichever is smaller, that is counted for storage
 * check for lmax or rmax so far and element lesser than that would tell how much water is stored
 */

public static void trappingRainWater(int arr[],int n)
{
    //brute-force

    int lmax,rmax,i,j;

    for(i=0;i<n;i++)
    {
        if(i==0||i==n-1)
            continue;
        j=i;
        while(j>=0)
        {
            lmax = max(lmax,arr[j--]);
        }
        j=i;
        while(j<n)
        {
            rmax = max(rmax,arr[j++]);
        }

        cap+=min(lmax,rmax)-arr[i];
    }

    //2 pointer - optimized

    lmax=0,rmax=0,left=0,right=n-1;
    while(left<=right)
    {
        if(arr[left]<=arr[right])
        {
            if(arr[left]<lmax)
            {
                lmax = arr[left];
            }
            else
            {
                cap+= lmax-arr[left];
            }
            left++;
        }
        else
        {
            if(arr[right]<rmax)
            {
                rmax = arr[right];
            }
            else
            pointercap += rmax-arr[right];
        }
    }
    
}