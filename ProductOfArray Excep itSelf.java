// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

public int[] productExceptSelf(int[] nums) {
    int n = nums.length,i;

    int lrr[] = new int[n];
    int rrr[] = new int[n];

    lrr[0]=nums[0];
    rrr[n-1] = nums[n-1];
    for(i=1;i<n;i++)
    {
        lrr[i] = nums[i] * lrr[i-1];
    }

    for(i=n-2;i>=0;i--)
    {
        rrr[i] = rrr[i+1] * nums[i];
    }

    int ans[] = new int[n];
    ans[n-1] = lrr[n-2];
    ans[0] = rrr[1];
    for(i=1;i<n-1;i++)
    {
        // System.out.println("lrr "+lrr[i-1]);
        // System.out.println("rrr "+rrr[i+1]);
        ans[i] = lrr[i-1] * rrr[i+1];
    }
    return ans;
}