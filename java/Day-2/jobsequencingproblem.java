// job sequencing problem
/*
 * Problem Statement: You are given a set of N jobs where each job comes with a deadline and profit. The profit can only be earned upon completing the job within its deadline. Find the number of jobs done and the maximum profit that can be obtained. Each job takes a single unit of time and only one job can be performed at a time.

Examples

Example 1:

Input: N = 4, Jobs = {(1,4,20),(2,1,10),(3,1,40),(4,1,30)}

Output: 2 60

Explanation: The 3rd job with a deadline 1 is performed during the first unit of time .The 1st job is performed during the second unit of time as its deadline is 4.
Profit = 40 + 20 = 60
 */

 class Jobs
 {
    int x;
    int deadline;
    int profit;

    public Jobs(int x,int deadline,int Profit)
 }


 public static int jobSequence(int arr[],int n)
 {
    Arrays.sort(arr,(b,a)-> b.profit-a.profit);
    
    int maxi=0;
    for(i=0;i<n;i++)
    {
        maxi = max(maxi,arr[i].deadline);
    }

    int maxJob[] = new int[maxi+1];

    //maxJob with -1 each

    for(i=0;i<n;i++)
    {
        for(j=i;j>=0;j--)
        {
            if(maxJob[j]==-1)
            {
                maxJob[j]=i;
                profit+=arr[i].profit;
                break;
            }
        }
    }

    // O nlog n + O N*M
 }