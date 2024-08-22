class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;

        int min = Integer.MAX_VALUE;
        int low=0,high=n-1,mid;

        while(low<=high)
        {
            mid = (low+high) >> 1;

            if(arr[low] <= arr[high])
            {
                min = Math.min(min,arr[low]);
                break;
            }
            else
            {
                if(arr[low]<=arr[mid])
                {
                    min = Math.min(min,arr[low]);

                    low = mid + 1;
                }
                else
                {
                    min = Math.min(min,arr[mid]);
                    high = mid-1;
                }
            }
        }
        return min;
    }
}