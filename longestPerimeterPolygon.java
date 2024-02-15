public long largestPerimeter(int[] nums) {
    int n = nums.length;

    Arrays.sort(nums);
    
    long sum=0;
    for(int i : nums)
        sum += i;
    
    for(int i=n-1;i>=2;i--)
    {
        sum -= nums[i];
        if(sum > nums[i])
        {
            return sum + nums[i];
        }
    }
    return -1;
}