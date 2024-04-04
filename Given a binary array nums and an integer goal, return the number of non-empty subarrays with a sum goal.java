//Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal


//brute force

public int numSubarraysWithSum(int[] nums, int goal) {
    int i,j,n=nums.length;

    int res = 0;
    for(i=0;i<n;i++)
    {
        int sum = 0;
        for(j=i;j<n;j++)
        {
            sum += nums[j];

            if(sum==goal)
                res++;

        }
    }
    return res;
}


// optimized -- kind of overlapping sum

public int numSubarraysWithSum(int[] nums, int goal) {
    HashMap<Integer, Integer> hm = new HashMap();

    int n = nums.length,i,j;

    int ans=0;
    int curr_sum=0;

    hm.put(0,1);
    for(i=0;i<n;i++)
    {
        curr_sum += nums[i];

        if(hm.containsKey(curr_sum - goal))
        {
            ans += hm.get(curr_sum - goal);
        }

        hm.put(curr_sum,hm.getOrDefault(curr_sum,0)+1);
    }
    return ans;
}
