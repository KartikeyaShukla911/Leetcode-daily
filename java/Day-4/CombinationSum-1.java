/*
 * Combination Sum - 1


55

2
Problem Statement: 

Given an array of distinct integers and a target, you have to return the list of all unique combinations where the chosen numbers sum to target. You may return the combinations in any order.


Input: array = [2,3,6,7], target = 7

Output: [[2,2,3],[7]]
 */


static void combinationSum(int arr[],int n,int tar)
{
    List<List<Integer>> ans = new ArrayList();
    List<Integer> res = new ArrayList();

    findCombSum(arr,n,tar,ans,res,0);
}

static void findCombSum(int index....)
{
    if(tar==0)
    {
        ans.add(res);
        return;
    }

    if(arr[index] <=tar)
    {
        res.add(arr[index]);
        findCombSum(index,ans,res,tar-arr[index]);
        res.remove(res.size()-1);
    }
    findCombSum(index+1,ans,res,tar);
}

// O - 2^t * k, where t is target and k is average space taken