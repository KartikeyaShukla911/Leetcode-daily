/*
 * Palindrome Partitioning


45

0
Problem Statement: You are given a string s, partition it in such a way that every substring is a palindrome. Return all such palindromic partitions of s.

 */


 static void palindromPart(int arr[],int n,List<List<String>> ans,
 List<String> ans,int index,String s)
 {
    if(index==n)
    {
        ans.add(new ArrayList<>(res));
        return ;
    }

    for(int i=index;i<n;i++)
    {
        if(isPalinDrome(s,index,i))
        {
            res.add(s.substring(index,i+1));
            palindromPart(arr,n,ans,res,i+1,s);
            res.remove(res.size());
        }
    }
 } // O- 2^n * k * n/2

 