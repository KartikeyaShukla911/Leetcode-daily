// majority elements with n/2 

public int majorityElement(int[] nums) {
    int n = nums.length;
    int i;
    if(n==0)
        return 0;
    
    int cnt=0;
    int maxi = nums[0];
    for(i=0;i<n;i++)
    {
        if(nums[i]==maxi)
        {
            cnt++;

        }
        else
        {
            cnt--;
            if(cnt<0){
                maxi = nums[i];
                cnt=0;
            }

        }
    }
    return maxi;
}