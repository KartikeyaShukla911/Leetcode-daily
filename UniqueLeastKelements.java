//https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/description/?envType=daily-question&envId=2024-02-16

public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
    int n = arr.length,i,j;
    HashMap<Integer,Integer> hm = new HashMap();

    for(i=0;i<n;i++)
    {
        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
    }

    List<Integer> ans = new ArrayList();
    int cnt=0;
    for(int temp : hm.values())
    {
        ans.add(temp);
    }

    Collections.sort(ans);

    for(i=0;i<ans.size();i++)
    {
        if(k>ans.get(i))
        {
            k-= ans.get(i);
            ans.set(i,0);
        }
        else
        {
            ans.set(i,ans.get(i)-k);
            k=0;
        }

        if(ans.get(i)!=0) cnt++;
    }
    return cnt;
}