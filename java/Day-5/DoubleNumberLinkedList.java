/*
 * Print All Permutations of a String/Array


21

0
Problem Statement: Given an array arr of distinct integers, print all permutations of String/Array.

Examples:

Example 1: 

Input: arr = [1, 2, 3]

Output: 
[
  [1, 2, 3],
  [1, 3, 2],
  [2, 1, 3],
  [2, 3, 1],
  [3, 1, 2],
  [3, 2, 1]
]

Explanation: Given an array, return all the possible permutations.
 */

 static void printPermute(int arr[],int n)
 {
    if(n==0)
        return;

    List<List<Integer>> ans = new ArrayList();
    List<Integer> res = new ArrayList();
    findPermutation(0,arr,n,ans,res);
    
    return;
 }

static void findPermutation(int idx,int arr[],int n,ans,res..)
{
    if(idx==n)
    {
        ans.add(res);
        return;
    }

    for(int i=idx;i<n;i++)
    {
        swap(arr,idx,i);
        findPermutation(idx+1,arr,n,ans,res);
        swap(arr,idx,i);
    }
}

// O - N!xN