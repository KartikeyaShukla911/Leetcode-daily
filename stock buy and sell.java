// stock buy and sell
class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length,i;
        if(n==1 || n<=0)
            return 0;
        int maxi=0;
        int lrr[] = new int[n];

        for(i=n-1;i>=0;i--)
        {
            maxi = prices[i] > maxi ? prices[i] : maxi;

            lrr[i] = maxi;
        }

        maxi = 0;
        for(i=0;i<n;i++)
        {
            maxi = Math.max(maxi,lrr[i] - prices[i]);
            if(maxi<0)
                maxi = 0;
        }
        return maxi;
    }
}

// 2nd variation

public int maxProfit(int[] prices) {
        
    int  n = prices.length,i;

    if(n<=1)
        return 0;
    
    int lrr[] = new int[n];

    lrr[n-1] = prices[n-1];

    for(i=0;i<n-1;i++)
    {
        lrr[i] = prices[i] > prices[i+1] ? prices[i] : prices[i+1];
    }

    lrr[n-1] = prices[n-1];
    int maxi = 0;
    for(i=0;i<n;i++)
    {
        System.out.println("lrr: "+lrr[i]);
        maxi += lrr[i] - prices[i];
        if(maxi < 0)
        maxi = 0;
    }

    return maxi;
}