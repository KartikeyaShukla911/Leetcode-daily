class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if(n<=4)
            return 0;
        
        Arrays.sort(nums);

        int ans = nums[n-1]-nums[0];
        int i;

        for(i=0;i<=3;i++)
            ans = Math.min(ans, nums[n - (3-i)-1] - nums[i]);
        
        return ans;
    }
}