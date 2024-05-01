// two sum problem in java

public int[] twoSum(int[] nums, int target) {
    int n = nums.length;
    int ans[] = new int[2];
    if(n<=1)
        return ans;
    
    int i;
    ans[0]=nums[0];
    ans[1]=nums[1];

    HashMap<Integer,Integer> hm = new HashMap();


    for(i=0;i<n;i++)
    {
        if(hm.isEmpty())
        {
            hm.put(nums[i],i);

        }
        else
        {
            if(hm.containsKey(target - nums[i]))
            {
                ans[0] = hm.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }
            else
            {
                hm.put(nums[i],i);
            }
        }
    }
    return ans;
}