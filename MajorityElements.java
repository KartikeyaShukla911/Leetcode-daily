public int majorityElement(int[] nums) {
    int n = nums.length;
    int i;
    if(n==1)
        return nums[0];
    int maxi=nums[0];
    int cnt=0;
    for(i=1;i<n;i++)
    {
        if(nums[i-1]==maxi)
        {
            cnt++;
        }
        else
        {
            cnt--;
            if(cnt==0)
            {
                maxi=nums[i];
            }
        }
    }
    return maxi;
}
